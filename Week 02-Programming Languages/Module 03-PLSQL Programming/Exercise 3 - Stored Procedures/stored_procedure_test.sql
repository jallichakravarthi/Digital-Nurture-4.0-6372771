BEGIN
  ProcessMonthlyInterest;
END;
/

BEGIN
  UpdateEmployeeBonus('IT', 5);
END;
/

BEGIN
  TransferFunds(101, 102, 1000);
END;
/

SELECT * FROM accounts;
SELECT * FROM employees;
