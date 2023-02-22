import sys
row = int(sys.argv[1])

# upper part
for i in range(row//2, row, 2):
    for j in range(1, row-i ,2):
        print(" ", end="")
    for j in range(1, i+1, 1):
        print("*", end="")
    for j in range(1, row-i+1, 1):
        print(" ", end="")
    for j in range(1, i+1, 1):
        print("*", end="")
    print()