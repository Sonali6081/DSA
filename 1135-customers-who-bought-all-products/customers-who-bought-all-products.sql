# Write your MySQL query statement below
 SELECT 
    customer_id
FROM (
    SELECT 
        c.customer_id,
        COUNT(DISTINCT c.product_key) AS product_count
    FROM 
        Customer c
    GROUP BY 
        c.customer_id
) AS customer_product_counts
WHERE 
    product_count = (SELECT COUNT(DISTINCT product_key) FROM Product);