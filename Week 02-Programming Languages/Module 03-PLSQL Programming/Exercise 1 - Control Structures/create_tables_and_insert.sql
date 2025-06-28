CREATE TABLE customers (
    customer_id     NUMBER PRIMARY KEY,
    name            VARCHAR2(100),
    age             NUMBER,
    balance         NUMBER(10, 2),
    is_vip          VARCHAR2(5) DEFAULT 'FALSE'
);

CREATE TABLE loans (
    loan_id         NUMBER PRIMARY KEY,
    customer_id     NUMBER REFERENCES customers(customer_id),
    interest_rate   NUMBER(5,2),
    due_date        DATE
);

INSERT INTO customers VALUES (1, 'Alice', 65, 12000, 'FALSE');
INSERT INTO customers VALUES (2, 'Bob', 45, 8000, 'FALSE');
INSERT INTO customers VALUES (3, 'Carol', 70, 9500, 'FALSE');

INSERT INTO loans VALUES (101, 1, 7.5, SYSDATE + 10);
INSERT INTO loans VALUES (102, 2, 6.0, SYSDATE + 45);
INSERT INTO loans VALUES (103, 3, 8.0, SYSDATE + 5);

COMMIT;
