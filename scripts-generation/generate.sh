#!/bin/bash
if [[ $OSTYPE == 'linux-gnu' ]]; then
	python_cmd='python'
else
	python_cmd='python2.7'
fi

if [ $# -eq 3 ] 
then
    echo 'Seed from ' $1 ' to ' $2 '- Threads = ' $3 
else
    echo "Invalid number of arguments"
    exit 1
fi

seed1=$1
seed2=$2
proc=$3

echo "Choose the version you want to execute"
echo "For more than one version, separate the number with a comma"
echo "1 = DYNAMOSA v.1.0.6"
echo "2 = Adaptive DYNAMOSA v.1.0.6"
echo "3 = Random approach"
echo "4 = All sincular indicators"
read choice

rm -rf run.sh
echo '#!/bin/bash' >> run.sh
chmod 777 run.sh
for i in $(echo $choice | sed "s/,/ /g")
do
	if [ "$i" == "1" ]; then
		${python_cmd} scripts/DYNAMOSA6.py dynamosa $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 dynamosa/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './dynamosa/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "2" ]; then
		${python_cmd} scripts/PDYNAMOSA.py adynamosa $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 adynamosa/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './adynamosa/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "3" ]; then
		${python_cmd} scripts/RANDOM6.py random $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 random/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './random/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi	
	if [ "$i" == "4" ]; then
		${python_cmd} scripts/LOOP_COUNTER.py LOOP_COUNTER $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 LOOP_COUNTER/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './LOOP_COUNTER/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		${python_cmd} scripts/METHOD_CALL.py METHOD_CALL $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 METHOD_CALL/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './METHOD_CALL/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		${python_cmd} scripts/COVERED_METHOD_CALL.py COVERED_METHOD_CALL $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 COVERED_METHOD_CALL/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './COVERED_METHOD_CALL/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		${python_cmd} scripts/STATEMENTS_COUNTER.py STATEMENTS_COUNTER $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 STATEMENTS_COUNTER/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './STATEMENTS_COUNTER/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		${python_cmd} scripts/STATEMENTS_COVERED.py STATEMENTS_COVERED $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 STATEMENTS_COVERED/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './STATEMENTS_COVERED/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		${python_cmd} scripts/OBJECTS_INSTANTIATIONS.py OBJECTS_INSTANTIATIONS $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 OBJECTS_INSTANTIATIONS/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './OBJECTS_INSTANTIATIONS/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		${python_cmd} scripts/TEST_LENGTH.py TEST_LENGTH $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 TEST_LENGTH/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './TEST_LENGTH/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
done
#LOOP_COUNTER:METHOD_CALL:COVERED_METHOD_CALL:STATEMENTS_COUNTER:STATEMENTS_COVERED:OBJECTS_INSTANTIATIONS:TEST_LENGTH"
