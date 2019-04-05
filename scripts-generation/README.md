# Instructions

The  `generate.sh` script takes in input 3 parameters:

* starting_seed
* ending_seed
* parallel runs

Therefore, for istance 

> ./generate.sh 1000 1030 10

will generate 30 runs for the chosen criterion with 10 parallel runs.

Once this command is executed, a menu appears end you need to select the version(s)
The menu is the follwing:

```
Choose the version that you want to execute
For more than one version, separate the number with a comma
1 = DYNAMOSA v.1.0.6
2 = Performance DYNAMOSA v.1.0.6
3 = Random approach
4 = All sincular indicators
```

The user has to choose 1 or more combination he wants to run.
If you want to run more than once, just use the command to separate the various numbers.

Then, the `run.sh` script will be created to execute the experiment with the chosen configuration. 
Every configuation has a specific python file into the `script` directory.

## Original script
The usage of the underline used python script is the following

```python
Usage:
experiment_base.py <dir> <minSeed> <maxSeed> <classFile> <maxJobs> <cores>
```

* `dir` is the name of the directory that will be created, storing script, results, logs and so on..
* `minSeed` and `maxSeed` are used to determine the number of iterations to do
* `classfile` is the list of class. This scripts wants a tab formatted text file
* `maxJobs`: set this to 1
* `cores`: number of parallel executions

You have to modify the `experiment_base.py` file with the right configuration (algo, strategy, combination and so on), and then run the command above.
