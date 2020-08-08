node
{
    //Properties configure
    properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '3', numToKeepStr: '3')), [$class: 'GithubProjectProperty', displayName: '', projectUrlStr: 'https://github.com/doan-nguyenduc/cLinux/'], pipelineTriggers([githubPush(), pollSCM('* * * * *')])])
	sh 'pwd'
    sh 'printenv'
    git 'https://github.com/doan-nguyenduc/cLinux.git'
	sh """
	    gcc -o main HelloWorld.c 
        ./main
	rm -rf main		
	"""
}
