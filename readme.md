1) delegate to maven:
   running application fails with error message "No goals have been specified for this build."
   https://youtrack.jetbrains.com/issue/IDEA-375521/Maven-with-delegate-run-to-Maven-running-fails
2) running exec:exec from Maven toolwindow works fine.
3) running exec:java from Maven toolwindow works fine.
4) debugging exec:java from Maven toolwindow works fine: debugger is launched and stops at breakpoints.
5) debugging exec:exec from Maven toolwindow doesn't work: debugger is launched but doesn't stop at breakpoints.
   https://youtrack.jetbrains.com/issue/IDEA-203018/Maven-attempt-to-debug-execexec-goal-fails-always
6) debugging using the maven run configuration that explicitly sets debug options (see `exec_debugging` RC):
   you can run it and then attach the debugger. This works.
7) `test` goal Debugging doesn't work: debugger is launched but doesn't stop at breakpoints.




     
 