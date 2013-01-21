REST Performance Playground
===========================
A little project aiming to compare the performance of some of the technologies used to implement REST web services. For now it uses just a very simple action of exponentiation as a test case but hopefully in the future there will be more complicated tests (including for example blocking database calls etc.).
 

How to:
-------
1. Choose an implementation from "impl" folder.
2. Run it as described in the implementations README.
3. Run the [Gatling](http://gatling-tool.org/) performance test from "test" folder. I recommend running the test twice on the JVM based implementations so that you can see the benefit of JIT.