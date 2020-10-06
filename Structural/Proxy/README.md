## When to use Proxy Pattern ?

- Lazy initialization (virtual proxy). This is when you have a heavyweight service object that wastes system resources by being always up, even though you only need it from time to time.
- Access control (protection proxy). This is when you want only specific clients to be able to use the service object; for instance, when your objects are crucial parts of an operating system and clients are various launched applications (including malicious ones).
- Local execution of a remote service (remote proxy). This is when the service object is located on a remote server.
- Logging requests (logging proxy). This is when you want to keep a history of requests to the service object.
- Caching request results (caching proxy). This is when you need to cache results of client requests and manage the lifecycle of this cache, especially if results are quite large.

## Advantages of Proxy Pattern

- The service object can be controlled without clients knowing about it.
- Lifecycle of the service object can be managed when clients don’t care about it.
- The proxy works even if the service object isn’t ready or is not available.

## Disadvantages of Proxy Pattern

- The code may become more complicated since you need to introduce a lot of new classes.
- The response from the service might get delayed.

### How to run ?

- Run `CachingProxy.java`.
