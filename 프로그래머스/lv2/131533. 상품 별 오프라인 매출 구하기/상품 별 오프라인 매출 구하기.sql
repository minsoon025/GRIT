-- 코드를 입력하세요
SELECT PRODUCT_CODE, SUM(P.PRICE*OS.SALES_AMOUNT) SALES
FROM PRODUCT P
JOIN OFFLINE_SALE OS ON P.PRODUCT_ID = OS.PRODUCT_ID
GROUP BY OS.PRODUCT_ID
ORDER BY SALES DESC, PRODUCT_CODE ASC

# SALES_AMOUNT를 같은 아이디 별로 값을 더해야한다.