Prerequisites
--------------------------------------
1) Configure Camel Bindy Extension
https://bugzilla.redhat.com/show_bug.cgi?id=1026736

2) Install FTP Server
yum install vsftpd ftp
setsebool -P ftp_home_dir=1
chkconfig vsftpd on

Test
---------------------------------------
1) Test File Binding
cp /home/redhat/workspaceHermes/switchyard-example-ftp/src/test/resources/file.txt /tmp/demo/GenericFileProcessor/in


2) Test FTP Binding
cp /home/redhat/workspaceHermes/switchyard-example-ftp/src/test/resources/file.txt /home/redhat/ftp/demo/GenericFileProcessor/in

