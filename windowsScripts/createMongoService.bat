@echo on

rem Change this path to use your MongoDB INSTALL PATH
rem Tested in Windows 7 x86_64 and Windows 2012 r2 x86_64
set MONGODB_HOME=D:\Program_Files\Mongodb-3.0.7

rem Please create your mongod.conf file in %MONGODB_HOME%\conf\mongod.conf
%MONGODB_HOME%\bin\mongod.exe --install --serviceName "MongoDB" --serviceDisplayName "MongoDB 3.0.7" --serviceDescription "MongoDB 3.0.7" --config %MONGODB_HOME%\conf\mongod.conf 