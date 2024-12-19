## Mockito:
- If a service depends on an external API or database, you can use Mockito to simulate the API/database behavior without actually connecting to them. This makes testing faster and more reliable.
- steps:
    1. Creates a Fake Object (Mock): 
        - Mockito creates a fake version of the class or interface you want to test. 
        - This fake object looks and behaves like the real object but doesn’t actually run its original code.
        - Mockito uses the Java Reflection API to create mock objects at runtime.
        - For interfaces, it uses Java's Proxy class to generate dynamic proxies.
        - For concrete classes, Mockito uses a bytecode manipulation library, such as Byte Buddy, to subclass the target class and override its methods.
    2. Define Fake Behavior (Stubbing):
        - You tell the fake object what to do when certain methods are called.
    3. Intercepts Method Calls
        - When your code calls a method on the fake object, Mockito intercepts the call.
        - If the fake behaviour is defined, it uses that.
        - If not, it returns a default value (like 0, false, or null).
    4. Keeps a Record of Calls:
        - Mockito keeps track of all the methods called on the fake object and with what data
    5. Verify Interactions:
        - At the end of the test, you can check if the fake object was used as expected.
- instead of mockito we can also use
    - EasyMock
    - JMock
    - PowerMock:  Extends Mockito and EasyMock for advanced use cases
    - MockServer: A framework for mocking and testing HTTP and HTTPS requests