SELECT MAX(account.avail_balance) max_balance,
       MIN(account.avail_balance) min_balance,
       AVG(account.avail_balance) avg_balance,
       SUM(account.avail_balance) tot_balance,
       COUNT(*) num_accounts
FROM account
WHERE product_cd = 'CHK';