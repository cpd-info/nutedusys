@echo off
for /f "skip=1" %%x in ('wmic os get localdatetime') do if not defined MyDate set MyDate=%%x
for /f %%x in ('wmic path win32_localtime get /format:list ^| findstr "="') do set %%x
set fmonth=00%Month%
set fday=00%Day%
set today=%Year%-%fmonth:~-2%-%fday:~-2%

echo %today%


SET hora=%time%
SET timeok=%hora::=-%
SET timeok=%timeok:,=-%
@echo on

neo4j-admin dump --database=graph.db --to=/neo4j/data/backups/graph.db/%today%-%timeok%.dump

