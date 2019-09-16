CREATE VIEW customer_totals_vw
    (cust_id,
     cust_type_cd,
     cust_name,
     num_accounts,
     tot_deposits
    )
AS
SELECT cst.cust_id, cst.cust_type_cd,
    CASE
        WHEN cst.cust_type_cd = 'B' THEN
            (SELECT bus.name FROM business bus WHERE bus.cust_id = cst.cust_id)
        ELSE
            (SELECT concat(ind.fname, ' ', ind.lname)
             FROM individual ind
             WHERE ind.cust_id = cst.cust_id)
    END cust_name,
    SUM(CASE WHEN act.status = 'ACTIVE' THEN 1 ELSE 0 END) tot_active_accountd,
    SUM(CASE WHEN act.status = 'ACTIVE' THEN act.avail_balance ELSE 0 END)
    tot_balance
FROM customer cst INNER JOIN account act
    ON act.cust_id = cst.cust_id
GROUP BY cst.cust_id, cst.cust_type_cd;
