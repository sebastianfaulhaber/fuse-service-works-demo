switchyard-example-ftp
======================================
Synopsis
--------------------------------------
This demo scenario demonstrates how to use the switchyard FTP binding in conjunction with some routing logic:
1. Fetch file from FTP server (CSV with multiple lines)
2. Split and map CSV data to POJO data model with Camel Bindy
3. Process all POJO records, marshal and then aggregate them into one ZIP file
4. Upload the resulting file to FTP server


Prerequisites
--------------------------------------
1) Setup a working development environment for Red Hat JBoss Fuse Service Works as described here: https://access.redhat.com/documentation/en-US/Red_Hat_JBoss_Fuse_Service_Works/6/html-single/Getting_Started_Guide/index.html. After going through the installation steps you should have installed 

2) Configure Camel Bindy Extension
https://bugzilla.redhat.com/show_bug.cgi?id=1026736

3) Install FTP Server
```
yum install vsftpd ftp
setsebool -P ftp_home_dir=1
chkconfig vsftpd on
```

Test
---------------------------------------
1) Test File Binding
```
cp /home/redhat/workspace/switchyard-example-ftp/src/test/resources/file.txt /tmp/demo/GenericFileProcessor/in
```

2) Test FTP Binding
```
cp /home/redhat/workspace/switchyard-example-ftp/src/test/resources/file.txt /home/redhat/ftp/demo/GenericFileProcessor/in
```

ToDo
--------------------------------------
- Creation of ZIP file is not yet working