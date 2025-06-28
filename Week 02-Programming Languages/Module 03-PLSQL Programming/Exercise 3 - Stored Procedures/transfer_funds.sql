CREATE OR REPLACE PROCEDURE TransferFunds (
  p_from_acct IN NUMBER,
  p_to_acct   IN NUMBER,
  p_amount    IN NUMBER
) AS
  v_balance NUMBER;
BEGIN
  SELECT balance INTO v_balance
    FROM accounts
    WHERE account_id = p_from_acct
    FOR UPDATE;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds: ' || v_balance);
  END IF;

  UPDATE accounts
    SET balance = balance - p_amount
    WHERE account_id = p_from_acct;

  UPDATE accounts
    SET balance = balance + p_amount
    WHERE account_id = p_to_acct;

  COMMIT;
END;
/
