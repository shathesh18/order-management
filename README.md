# order-management

## API Usage

[hostname]:[port]/[basepath]/"/order" - get all the orders\n
[hostname]:[port]/[basepath]/"/order/{orderId}" - get an order by id\n
[hostname]:[port]/[basepath]/"/order?startTime=yyyy-mm-ddThh:mm:ss&endTime=yyyy-mm-ddThh:mm:ss" - get orders within time interval(not implemented)\n
[hostname]:[port]/[basepath]/"/order?zip=zipcode - get top 10 orders with a zip code(not implemented)

