
#collections = ["Nap", "Sought", "Palindrome", "Kashamadupe", "Happyday", "PhaseGate"]
collections  = [1,2,33,44,55,7,5,44,100,-4,-55,0]

largest = collections[0]
smallest = collections[0]
for count in range(len(collections)):
    if(collections[count] > largest):
        largest = collections[count]
        
    if (collections[count] < smallest):
        smallest = collections[count]
        

print(f"The largest element in the list = {largest} ")
print(f"The smallest element int the list = {smallest}")

counter = 0;
for count in range(len(collections)):
    tally = 0
    while(tally < counter):
        if(collections[tally] == collections[count]):
            break;

    if (tally == counter):
        collections[counter] = collections[count]
        counter+=1
    
print(collections)
