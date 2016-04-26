SELECT airlines.airline 
FROM flights
 JOIN airlines 
ON flights.flightNumber=airlines.flightNumber 
WHERE arrivalAirport='Milan' 
AND arrivalAirport='Helsinki' 
AND webRegistration='yes'
 AND averageTicketPrice<100
