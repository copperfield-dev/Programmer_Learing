SELECT a.cust_id, a.product_cd, a.avail_balance /
    CASE
        WHEN prod_tots.tot_balance = 0 THEN 1
        ELSE prod_tots.tot_balance
    END percent_of_total
FROM account a INNER JOIN
    (SELECT a.product_cd, SUM(a.avail_balance) tot_balance
     FROM account a
     GROUP BY a.product_cd) prod_tots
     ON a.product_cd = prod_tots.product_cd;
