def recur_fibo(n):
    if n <= 1:
       return n
    else:
       return(recur_fibo(n-1) + recur_fibo(n-2))
ns = int(input("Enter n numbers you want to sequnce: "))

if ns <= 0:
   print("Plese enter a positive integer")
else:
   print("Fibonacci sequence:")
   for i in range(ns):
       print(recur_fibo(i))
