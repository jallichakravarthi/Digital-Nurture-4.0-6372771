BEGIN
    FOR rec IN (
        SELECT l.loan_id
        FROM loans l
        JOIN customers c ON l.customer_id = c.customer_id
        WHERE c.age > 60
    ) LOOP
        UPDATE loans
        SET interest_rate = interest_rate - 1
        WHERE loan_id = rec.loan_id;
    END LOOP;

    COMMIT;
END;
/
