def is_prime(number):
    
    if number < 0 or number-int(number) != 0:
        return str(number)+" is not a Whole number"

    if number in [0, 1]:
        return str(number)+" Neither Prime nor Composite"

    else:
        for i in range(2, (number//2) + 1):
            if number % i == 0:
                return str(number) + " is a Composite number"
        return str(number) + " is a Prime number"


print(is_prime(7))
