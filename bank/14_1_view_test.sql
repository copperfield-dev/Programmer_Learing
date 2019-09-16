CREATE VIEW customer_vw
	(cust_id,
	 fed_id,
	 cust_type_cd,
	 address,
	 city,
	 state,
	 zipcode)
AS
SELECT cust_id,
	concat('ends in ', substr(fed_id, 8, 4)) fed_id,
	cust_type_cd,
	address,
	city,
	state,
	postal_code
FROM customer;

SELECT cust_id, fed_id, cust_type_cd
FROM customer_vw;

DESCRIBE customer_vw;

SELECT cust_type_cd, count(*)
FROM customer_vw
WHERE state = 'MA'
GROUP BY cust_type_cd
ORDER BY 1;
