package fgl.freecompile.net;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import com.freecompiler.common.FunctionType;
import com.freecompiler.common.Helper;
import com.freecompiler.common.ProcedureType;
import com.freecompiler.common.*;
import fgl.freecompile.net.fglParser.*;


public class Interpreter extends fglBaseVisitor<Integer> { 
	 public List<VariableType> VarList;
	   public List<ProcedureType> PrcList;
	   public List<FunctionType> FunctList;
	   public String ProgramName;
	   public ProcedureType CurrentPrc=null;
	   public FunctionType CurrentFunct=null;
	   public Deque<VariableType> stack=null;
    @Override
    public Integer visitMainBlock(fglParser.MainBlockContext ctx) {
    	try
    	{
    		  
	        VarList =new ArrayList<VariableType>() ;
	        PrcList = new ArrayList<ProcedureType>();
	        FunctList = new ArrayList<FunctionType>();
	        stack = new ArrayDeque<VariableType>();
	        Helper.interpreter=this;
        
        Integer result = 0;
    //   System.out.println("  Visit Ident " + ctx.getClass()+ ":" + ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        	// System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("MainBlock"+ex.toString());
    	}
    return 0;
    }

    /*
    @Override
    public Integer visitMainStatements(fglParser.MainStatementsContext ctx) {
    	try
    	{
        
        Integer result = 0;
     //  System.out.println("Visit MainStatements " + ctx.getClass()+ ":" + ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        //	System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("MainStatements"+ex.toString());
    	}
    return 0;
    }

    @Override
    public Integer visitCodeBlock(fglParser.CodeBlockContext ctx) {
    	try
    	{
        
        Integer result = 0;
     //  System.out.println("Visit MainStatements " + ctx.getClass()+ ":" + ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        	//System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("MainStatements"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitStatement(fglParser.StatementContext ctx) {
    	try
    	{
        
        Integer result = 0;
     //  System.out.println("Visit MainStatements " + ctx.getClass()+ ":" + ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        //	System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("MainStatements"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitUnlabelledStatement(fglParser.UnlabelledStatementContext ctx) {
    	try
    	{
        
        Integer result = 0;
     //  System.out.println("Visit MainStatements " + ctx.getClass()+ ":" + ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        	//System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("MainStatements"+ex.toString());
    	}
    return 0;
    }
  
    @Override
    public Integer visitSimpleStatement(fglParser.SimpleStatementContext ctx) {
    	try
    	{
        
        Integer result = 0;
       System.out.println("visitSimpleStatement " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        	System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitSimpleStatement"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitOtherFGLStatement(fglParser.OtherFGLStatementContext ctx) {
    	try
    	{
        
        Integer result = 0;
       System.out.println("OtherFGLStatement " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        	System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("OtherFGLStatement"+ex.toString());
    	}
    return 0;
    }
    @Override
    public Integer visitScreenStatement(fglParser.ScreenStatementContext ctx) {
    	try
    	{
        
        Integer result = 0;
       System.out.println("ScreenStatementContext " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        	System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("ScreenStatementContext"+ex.toString());
    	}
    return 0;
    }
    */
    @Override
    public Integer visitDisplayStatement(fglParser.DisplayStatementContext ctx) {
    	try
    	{
        
        Integer result = 0;
   //    System.out.println("visitDisplayStatement " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        	//System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        VariableType v=stack.peek();
        System.out.println(v.value.toString());
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitDisplayStatement"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitExpression(fglParser.ExpressionContext ctx) {
    	try
    	{
        
        Integer result = 0;
    //   System.out.println("visitExpression " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        	System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitExpression"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitSimpleExpression(fglParser.SimpleExpressionContext ctx) {
    	try
    	{
        
        Integer result = 0;
       System.out.println("SimpleExpressionContext " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        	System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("SimpleExpressionContext"+ex.toString());
    	}
    return 0;
    }
    
    
    @Override
    public Integer visitTerm(fglParser.TermContext ctx) {
    	try
    	{
        
        Integer result = 0;
       System.out.println("TermContext " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        	System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("TermContext"+ex.toString());
    	}
    return 0;
    }
    @Override
    public Integer visitFactor(fglParser.FactorContext ctx) {
    	try
    	{
        
        Integer result = 0;
       System.out.println("FactorContext " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        	System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("FactorContext"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitConstant(fglParser.ConstantContext ctx) {
    	try
    	{
        
        Integer result = 0;
       System.out.println("Constant " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        	System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("Constant"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitString(fglParser.StringContext ctx) {
    	try
    	{
        
        Integer result = 0;
  //     System.out.println("visitString " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
       stack.push(new VariableType("",(String)ctx.getText(),VarType.String));
      /* for(int i=0;i< ctx.children.size();i++)
        {
        	System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }*/
        return result;
    }
    catch (Exception ex) {
    		System.out.println("Constant"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitVariableDeclaration(fglParser.VariableDeclarationContext ctx) {
	try
	{    
    Integer result = 0;
  //   System.out.println("visitVariableDeclaration " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
  // stack.push(new VariableType("",(String)ctx.getText(),VarType.String));
		   for(int i=0;i< ctx.children.size();i++)
		    {
		    	//System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
		    	visit(ctx.getChild(i));
		    }
		   VarList.add(stack.peek());
		   return result;
		}
		catch (Exception ex) {
				System.out.println("visitVariableDeclaration"+ex.toString());
			}
		return 0;
	    }
 
	@Override
public Integer visitConstantIdentifier(fglParser.ConstantIdentifierContext ctx) {
try
{    
Integer result = 0;
// System.out.println("visitConstantIdentifier " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
  	stack.push(new VariableType(ctx.getText(),null,VarType.Integer));
	 
 
	   return result;
	}
	catch (Exception ex) {
			System.out.println("ConstantIdentifier"+ex.toString());
		}
	return 0;
    }


@Override
public Integer visitType(fglParser.TypeContext ctx) {
try
{    
Integer result = 0;
 System.out.println("TypeContext " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
// stack.push(new VariableType("",(String)ctx.getText(),VarType.String));
	   for(int i=0;i< ctx.children.size();i++)
	    {
	    	System.out.println(i+":"+ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText());
	    	visit(ctx.getChild(i));
	    }
	   return result;
	}
	catch (Exception ex) {
			System.out.println("TypeContext"+ex.toString());
		}
	return 0;
   
}

@Override
public Integer visitTypeIdentifier(fglParser.TypeIdentifierContext ctx) {
try
{    
Integer result = 0;
 System.out.println("TypeContext " + ctx.getClass()+ ":" + ctx.getText()+ ctx.children.size());
 	  VariableType v=stack.peek();
	 	if (v!=null)
	 	{
	 		switch(ctx.getText().toUpperCase())
	 		{
	 		case "INT" :
	 				v.type=VarType.Integer;
	 				v.value=(int)0;
	 			break;
	 		}
	 		stack.push(v);
	 	}
	 	else
	 		throw new RuntimeException("Var declaration stack empty");
	   return result;
	}
	catch (Exception ex) {
			System.out.println("TypeContext"+ex.toString());
		}
	return 0;
    }
}

