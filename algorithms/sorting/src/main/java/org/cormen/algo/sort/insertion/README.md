# Pseudo code for Insertion sort and Analysis of algorithm

assume the input is array of Integer say A
<pre>
 PseudoCode                                                                             cost           times
    
1) for j = 2 to A.length                                                                 c<sub>1</sub>              n
    2) key = A[j]                                                                        c<sub>2</sub>             n-1
    3)Insert A[j] into sorted sequence                                                   0              n-1
        A[i ... j-1]
    4)i = j - 1                                                                          c<sub>4</sub>             n-1
    5)while i > 0 and A[i] > key                                                         c<sub>5</sub>             j-2 to n-1 (t<sub>j</sub>)
    6)A[i + 1] = A[i]                                                                    c<sub>6</sub>             j-2 to n-1 (t<sub>j</sub> - 1)
    7) i = i - 1                                                                         c<sub>7</sub>             j-2 to n-1 (t<sub>j</sub> - 1)
     8) A[i + 1] = key                                                                   c<sub>8</sub>             n-1                         
</pre>

Hence the Time complexcity will be

T(n) = c<sub>1</sub>(n) + c<sub>2</sub>(n) + c<sub>4</sub>(n) + c<sub>5</sub>(j = 2 to n)t<sub>j</sub>
            +c<sub>5</sub>(j = 2 to n)t<sub>j</sub> - 1 + c<sub>5</sub>(j = 2 to n)t<sub>j</sub> - 1 + c<sub>8</sub>(n -1)
            
### Best case: When Array already sorted
T(n) = c<sub>1</sub>(n) + c<sub>2</sub>(n - 1) + c<sub>4</sub>(n - 1) + c<sub>5</sub>(n - 1)  + c<sub>8</sub>(n - 1) 
    = (c<sub>1</sub> + c<sub>2</sub> + c<sub>4</sub> + c<sub>5</sub> + c<sub>8</sub>)n - (c<sub>2</sub> + c<sub>4</sub> + c<sub>5</sub> + c<sub>8</sub>)
    ~= an + b
    
### Worst Case: When Array is reversed sort

T(n) = c<sub>1</sub>(n) + c<sub>2</sub>(n - 1) + c<sub>4</sub>(n - 1) + c<sub>5</sub>(n(n+1)/2 -1) + c<sub>6</sub>(n(n-1)/2)+
        c<sub>7</sub>(n(n-1)/2) + c<sub>8</sub>(n-1)
      ~= an<sup>2</sup> + bn + c
      
## Order of Growth
T(n) = O(n<sup>2</sup>)