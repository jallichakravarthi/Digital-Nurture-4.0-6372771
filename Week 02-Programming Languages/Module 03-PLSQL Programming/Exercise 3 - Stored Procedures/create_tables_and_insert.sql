CREATE TABLE customers (
  customer_id NUMBER PRIMARY KEY,
  name        VARCHAR2(100),
  age         NUMBER,
  balance     NUMBER(15, 2),
  is_vip      VARCHAR2(5) DEFAULT 'FALSE'
);

CREATE TABLE accounts (
  account_id   NUMBER PRIMARY KEY,
  customer_id  NUMBER REFERENCES customers(customer_id),
  balance      NUMBER(15, 2),
  account_type VARCHAR2(20)
);

CREATE TABLE employees (
  employee_id NUMBER PRIMARY KEY,
  department  VARCHAR2(50),
  salary      NUMBER(15, 2)
);

INSERT ALL
  INTO customers VALUES (1101, 'Alice', 65, 12000, 'FALSE')
  INTO customers VALUES (1102, 'Bob', 45,  8000,  'FALSE')
  INTO customers VALUES (1103, 'Carol', 70,  9500,  'FALSE')
SELECT * FROM dual;

INSERT ALL
  INTO accounts VALUES (101, 1, 15000, 'SAVINGS')
  INTO accounts VALUES (102, 2, 300000, 'CHECKING')
SELECT * FROM dual;

INSERT ALL
  INTO employees (employee_id, department, salary)
    VALUES (101, 'IT', 15000)
  INTO employees (employee_id, department, salary)
    VALUES (102, 'IT', 300000)
SELECT * FROM dual;

COMMIT;

SELECT * FROM customers;
SELECT * FROM accounts;
SELECT * FROM employees;
