def fib (n):
    assert(n >=0, 'ONLY NON NEGATIVE NUMBERS')
    if n < 2:
        return n
    return fib(n - 1) + fib(n - 2)

#########test############
test_cases = [(0,0),(1,1),(2,1),(-5,-1),(-20,-1),(50,12586269025)]

for case in test_cases:
    entrada = case[0]
    salidaEsperada = case[1]