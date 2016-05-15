select airCompany
 FROM (
SELECT airlines.airline as airCompany, AVG(averageTicketPrice) as avePrice 
FROM flights
 JOIN airlines 
ON flights.flightNumber=airlines.flightNumber 
WHERE arrivalAirport='Milan' 
OR arrivalAirport='Helsinki' 
AND webRegistration='yes'
GROUP BY airlines.airline) as airlinesList
 WHERE avePrice<100;