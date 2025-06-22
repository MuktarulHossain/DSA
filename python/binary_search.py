list1 = [1,4,6,8,9,10,12,14,15,16,18,20,22,24,26,28,30,32,34,36,38,40]

print("List:", list1)

def binary_search(arr, target):
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1

def main():
    target = int(input("Enter a number to search: "))
    result = binary_search(list1, target)
    
    if result != -1:
        print(f"Number {target} found at index {result}.")
    else:
        print(f"Number {target} not found in the list.")


if __name__ == "__main__":
    main()


