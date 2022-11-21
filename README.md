# DP TA 2

Process flow of application:

Waffle shop -> Customer enter -> Selection of waffle -> selection of ingredients -> Beverage option -> Hot/cold Beverages -> order to waitress -> waitress to cook -> cook prepares the order. 

DP used are Simple Factory Pattern, Template Method Pattern and Decorator Pattern.


Implementation:
The cook works with Waffle Factory for waffle and with Beverage Factory for beverage. The cook uses makeWaffle() and makeBeverage() methods i.e <u>Simple Factory Pattern.</u>

The customers had chosen waffle ingredients according to the waffle they had previously wanted. The waffle is decorated according to these waffle ingredients i.e <u> Decorator Pattern </u>. There is a waffle decoration such as Chocolate Decorator. Then the coost is calculated

Hot and cold beverages uses i.e <u> Template Method Pattern.</u> hook() is used for each beverage and the customer is asked if some extras are wanted. 




