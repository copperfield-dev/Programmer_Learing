SELECT cust_id, fed_id, cust_type_cd
FROM customer_vw;

SELECT cust_type_cd, count(*)
FROM customer_vw
WHERE state = 'MA'
GROUP BY cust_type_cd
ORDER BY 1;

SELECT cst.cust_id, cst.fed_id, bus.name
FROM customer_vw cst INNER JOIN business bus
    ON cst.cust_id = bus.cust_id;
