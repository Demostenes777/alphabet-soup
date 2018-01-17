# alphabet-soup

Being n the length of the message and m the length of the string containing the letters in the bowl, and assuming that the running time of Arrays.sort is O(x.log(x)) being x the number of objects to be sorted, the running time of the proposed algorithm is:

O(n.log(n) + m.log(m) + m) 

Since m >> n and m.log(m) >> m it can be reduced to

O(m.log(m))
