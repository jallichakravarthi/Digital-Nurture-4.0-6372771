CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  p_dept       IN VARCHAR2,
  p_bonus_pct  IN NUMBER
) AS
BEGIN
  UPDATE employees
  SET salary = salary * (1 + p_bonus_pct / 100)
  WHERE department = p_dept;

  COMMIT;
END;
/
