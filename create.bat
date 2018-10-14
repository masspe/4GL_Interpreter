REM Grammar name and file have to be the same
SET CLASSPATH=.;antlr-4.5.3-complete.jar;%%CLASSPATH%%
java org.antlr.v4.Tool 
java org.antlr.v4.Tool fgl.g4 -listener -visitor  -Xforce-atn  -package fgl.freecompile.net
REM java org.antlr.v4.gui.TestRig 4gl.g4