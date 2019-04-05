# Replication Package

This is the online appendix/replication package for the paper *"Testing with Fewer Resources: An Adaptive Approach to Performance-Aware Test-Case Generation"*.

In this online repository we provide:

* a **runnable version** of the implemented approaches: the *evosuite.jar* file;
* all the [tables][tables] with the full tables reporting the results described in the paper;
* the script used to generate the tests;
* a zipped folders with all the projects used in the empirical study.

### EvoSuite jar
We built a custom EvoSuite version implementing the pDynaMOSA starting from [EvoSuite 1.0.6.][evosuite].
To run the experiments reported in the paper, we relied on the bash scripts that you can find in the _scripts_ directory for every approach tested.
The full source code can be found [here](https://github.com/giograno/evosuite).

### Full Results
[Here][tables] we report the full results for the three investigated research questions.

[evosuite]: https://github.com/EvoSuite/evosuite
[tables]: https://github.com/sealuzh/dynamic-performance-replication/blob/master/results

### Performance Measurement
The data about the performance measurements are in [this folder][measurements].
We also include two csv files indicating the exact test suites, amongst the generated ones, that has been measured.
Moreover, we include the source code used for the measurement as well the script used to process the raw data.

[measurements]: https://github.com/sealuzh/dynamic-performance-replication/tree/master/performance-measurement/