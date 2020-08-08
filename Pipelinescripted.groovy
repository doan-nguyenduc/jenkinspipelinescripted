node
{
    //Properties configure
    properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '3', numToKeepStr: '3'))])
    sh 'pwd'
    sh 'printenv'
    sh 'ls'
    
}
