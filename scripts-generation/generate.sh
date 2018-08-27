#!/bin/bash
if [[ $OSTYPE == 'linux-gnu' ]]; then
	python_cmd='python'
else
	python_cmd='python2'
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
echo "1 = MOSA"
echo "2 = performance indicators as secondary objective"
echo "3 = pMOSA"
read choice

rm -rf run.sh
echo '#!/bin/bash' >> run.sh
chmod 777 run.sh
for i in $(echo $choice | sed "s/,/ /g")
do
	if [ "$i" == "1" ]; then
		${python_cmd} scripts/MOSA.py mosa $seed1 $seed2 subject.txt 1 $proc
		echo 'chmod 777 mosa/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './mosa/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "2" ]; then
		${python_cmd} scripts/archive_sum.py archive_sum $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 archive_sum/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './archive_sum/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "3" ]; then
		${python_cmd} scripts/crowding_dominance.py crowding_dominance $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 crowding_dominance/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './crowding_dominance/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "4" ]; then
		${python_cmd} scripts/crowding_epsilon_dominance.py crowding_epsilon_dominance $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 crowding_epsilon_dominance/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './crowding_epsilon_dominance/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "5" ]; then
		${python_cmd} scripts/crowding_fast_dominance.py crowding_fast_dominance $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 crowding_fast_dominance/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './crowding_fast_dominance/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "6" ]; then
		${python_cmd} scripts/crowding_sum.py crowding_sum $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 crowding_sum/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './crowding_sum/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
	fi
	if [ "$i" == "7" ]; then
		${python_cmd} scripts/crowding_min_max.py crowding_min_max $seed1 $seed2 subject.txt 1 $proc	
		echo 'chmod 777 crowding_min_max/scripts/ubuntu_EvoSuite_0.sh' >> run.sh
		echo './crowding_min_max/scripts/ubuntu_EvoSuite_0.sh' >> run.sh		
	fi
done
