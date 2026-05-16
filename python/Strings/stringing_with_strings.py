#String questions

#To reverse a string without a built in function
#def reverse(name):
#    count_in_reverse = name[: : -1]
#    return count_in_reverse
#
#what_name = input("Enter a name of choice: ")
#reverse_it = reverse(what_name)
#print(reverse_it)
#
#
#to check if  astring is palindrome
#def palindrome(names):
#    palindrome_checker = names[::-1]
#    if palindrome_checker == names:
#        return True;
#    return False;
#what_names = input("Enter a name of choice: ")
#check_if_isPalindrome = palindrome(what_names)
#print(f"if {what_names} = true, it is a PALINDROME\nelse... its not\nlets seee...........{check_if_isPalindrome}")

#check for vowels and consonant
def alphabets(letters):
    vowels = ["a","e","i","o","u"]
    consonants = ['b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z']

    vowel_counter = 0
    consonant_counter = 0
    for count in letters:

        if count in vowels:
            vowel_counter +=1
        
        elif count in consonants:
            consonant_counter += 1
    return vowel_counter, consonant_counter

name = input("Enter a name: ")
print(alphabets(name))

