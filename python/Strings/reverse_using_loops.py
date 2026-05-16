
word = "BOYOYOOO"
result = ""

for count in range(len(word)-1, -1, -1):
    result+=word[count]
    print(result)

print(f"the final result is = {result}")


reversed_function = " ".join(reversed(word))

print("\n", reversed_function)

#bamboo 

list_of_words = list(reversed(word))
print(list_of_words)

index = 0
last_index = len(word)-1

while(index < last_index):
    if (word[index ] != word[last_index]):
        print(f"{word} is not a palindrome")
        index += 1 
        last_index-= 1

print(f"{word} is a palindrome")

print(word.title())

    
