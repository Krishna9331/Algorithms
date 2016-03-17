# divide-and-conquer

Basically it breaks one problem into several problem which are similar to original one but smaller in size,
then it solves the sub problems recursively and then combine each solution to create solution for original problem.

It has three Steps:
### Divide: 
            create sub problems out of original problem
### Conquer:
            Solve subproblem recursively, if size are small enough solve it straight forward.
### Combine
            combine solution of all subproblem into one to get the final result.
            
# Merge Sort

This sorting works on the principle of divide-and-conquer.

Where it divide the sequence of n element into n/2 sub problems and sort it recursively.

The division process continues until it does not reach the sequence of 1 element which is obviously sorted.

The key part is merging of all sorted sub problems. We can consider it as below process:

Suppose we have two pile of cards say(p1, p2) which is sorted and kept on the table, where smallest one is at the top.
The cards are facing up. What we need is sort all the cards from P1 and P2. Which we can achieve as below:

Every time look at the cards on top of the piles and take the smaller one and put it separately.
During this process it might be possible that cards has been removed more than once from the same pile(say p2),
because the top card on the other pile(p1) is bigger than the cards coming up every time after removing the previous one.
We repeat this step until one pile is completely empty, at which point we take all the cards from another pile and put it.

To get read of checking if a pile is empty or not every time programmatically, We can put a Sentinel card(Joker)at the bottom of each pile 
Which is greater than all other one.

If we had pile of integer we could have used infinity as Sentinel.

### Analysis of Merge Sort

The Divide step just calculate middle of sub array hence Θ(1)

conquer step solves two problems each od size n/2 hence 2T(n/2).

merger process of n element takes Θ(n)
<pre>

                Θ(1)    if n==1
 T(n) =     
              2T(n/2) + Θ(n)    if n>1 
</pre>

so if Θ(1) = c then we can rewrite above as below
<pre>

                c       if n==1
 T(n) =     
              2T(n/2) + cn      if n>1 
</pre>

each cn is getting divided into cn/2 and cn/2 and each of them is getting that of cn/4 ....
so expression will be 

Tn ~=  cn + (cn/2 + cn/2) + (cn/4 + cn/4 + cn/4 + cn/4) + ..... + (c + c + c + c .....n times)
    = cn + cn + cn + cn .....(logn + 1) times
    = cnlogn + cn
    
hence Order is nlogn for heap short.
