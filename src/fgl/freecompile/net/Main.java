package fgl.freecompile.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;



import fgl.freecompile.net.fglLexer;
import fgl.freecompile.net.fglParser;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
	
		File file = new File("prg1.p");
	    
        ANTLRInputStream stream = (!file.exists())
                ? new ANTLRInputStream(System.in)
                : new ANTLRInputStream(new FileInputStream(file));
                fglLexer lexer = new fglLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        fglParser parser = new fglParser(tokens);
        ParseTree tree = parser.mainBlock();
        System.out.println(tree);
        Interpreter interpreter = new Interpreter();
        interpreter.visit(tree);
        
	}

}
