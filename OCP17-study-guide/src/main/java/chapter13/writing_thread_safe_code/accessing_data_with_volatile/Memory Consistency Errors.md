# Memory Consistency Errors

https://docs.oracle.com/javase/tutorial/essential/concurrency/memconsist.html

Memory consistency errors occur when different threads 
have inconsistent views of what should be the same data. 
The causes of memory consistency errors are complex and beyond the scope of this tutorial. 
Fortunately, the programmer does not need a detailed understanding of these causes. 
All that is needed is a strategy for avoiding them.

The key to avoiding memory consistency errors is understanding the happens-before relationship. 
This relationship is simply a guarantee that memory writes by one specific statement are visible 
to another specific statement. To see this, consider the following example. 

Suppose a simple int field is defined and initialized:

int counter = 0;

The counter field is shared between two threads, A and B. Suppose thread A increments counter:

counter++;

Then, shortly afterwards, thread B prints out counter:

System.out.println(counter);

If the two statements had been executed in the same thread, 
it would be safe to assume that the value printed out would be "1". 
But if the two statements are executed in separate threads, the value printed out might well be "0", 
because there's no guarantee that thread A's change to counter will be visible to 
thread B — unless the programmer has established a happens-before relationship between these two statements.

There are several actions that create happens-before relationships. 

One of them is synchronization, as we will see in the following sections.

We've already seen two actions that create happens-before relationships.

- When a statement invokes Thread.start, every statement that has a happens-before relationship with 
that statement also has a happens-before relationship with every statement executed by the new thread. 
The effects of the code that led up to the creation of the new thread are visible to the new thread.
- When a thread terminates and causes a Thread.join in another thread to return, 
then all the statements executed by the terminated thread have a happens-before relationship 
with all the statements following the successful join. 
The effects of the code in the thread are now visible to the thread that performed the join.

