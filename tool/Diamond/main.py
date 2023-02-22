import sys
row = int(sys.argv[1])

for i in range(row,0,-1):
    
    for j in range(2+row-i):
        print(' ', end='')  
    
    for j in range(i-1):
        print('* ',end='') 
    print()