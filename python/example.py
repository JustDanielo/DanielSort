from danielsort import daniel_sort
from danielsort2 import daniel_sort2
from random import sample

def main():
    array = sample(range(0, 10), 10)
    print(" --- \tRandom Array\t ---")
    print(array)
    print("\n")

    print(" --- \tDanielSort 1\t ---")
    output = daniel_sort(array)
    print(output)
    print("\n")
    
    print(" --- \tDanielSort 2\t ---")
    output = daniel_sort2(array)
    print(output)

if __name__ == "__main__":
    main()    