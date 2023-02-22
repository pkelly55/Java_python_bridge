import sys
rows = round(int(sys.argv[1])/2)
columns = rows *4

for i in range(rows):
    for j in range(columns):
        print("*", end = '  ')
    print()