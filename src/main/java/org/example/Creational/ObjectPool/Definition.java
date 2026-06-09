package org.example.Creational.ObjectPool;

public class Definition {
    void definitionObjectPool(){
        /*
        *   The Object Pool Design Pattern is a creational pattern that manages a set (pool) of reusable objects(like
        *   DBConnection Objects). Instead of creating and destroying objects frequently, we reuse pre-created instances
        *   from a pool.
        *
        *   Borrow an instance from the pool ➡ Use it and ➡ Return it to the pool
        *
        *   Object Pool Design Pattern is used when:
        *   Object creation is expensive (CPU/memory).
        *   The same type of object is needed repeatedly.
        *   You want to limit the number of instances (e.g., database connections).
        *
        *
        *   The Problem (Ex: DBConnection Pool)
        *   What's wrong with the above code? What happens if another client tries to create a new
        *   DBConnectionPoolManager ?
        *   More connections were added to the pool that exceed the MAX_POOL_SIZE .
        *   Multiple connection list objects are being created to track connection usage.
        *   The system will eventually lead to a memory leak.
        *   Unreliable design.
        *
        *
        *
        *   Solution (Ex: DBConnection Pool)
        *   This Object Pool Design Pattern is used in conjunction with the Singleton Design Pattern and requires
        *   thread safety when acquiring and releasing resources.
        *
        *
        *   Advantages
        *   - Reduce the overhead of creating and destroying the frequently required object (generally resource-intensive
        *   objects).
        *   - Reduce the latency, as it uses the pre-initialized object.
        *   - Prevent resource exhaustion by managing the number of resource-intensive object creations.
        *
        *
        *   Disadvantages
        *   - Resource leakage can happen if the object is not handled properly and is not returned to the pool.
        *   - Required more memory to manage the pool.
        *   - Pool management required thread safety, which is additional overhead.
        *   - Adds application complexity because of managing the pool.
        *
        *
        * */
    }
}
