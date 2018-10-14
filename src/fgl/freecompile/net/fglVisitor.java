// Generated from fgl.g4 by ANTLR 4.5.3
package fgl.freecompile.net;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fglParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fglVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fglParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(fglParser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(fglParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#mainBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainBlock(fglParser.MainBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#mainStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatements(fglParser.MainStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#deferStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferStatement(fglParser.DeferStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#functionOrReportDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionOrReportDefinitions(fglParser.FunctionOrReportDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(fglParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(fglParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(fglParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(fglParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#globalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDeclaration(fglParser.GlobalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#typeDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclarations(fglParser.TypeDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(fglParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(fglParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(fglParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#indirectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirectType(fglParser.IndirectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(fglParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#largeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLargeType(fglParser.LargeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#numberType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberType(fglParser.NumberTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#charType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(fglParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#timeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeType(fglParser.TimeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#datetimeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeQualifier(fglParser.DatetimeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#intervalQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalQualifier(fglParser.IntervalQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#unitType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitType(fglParser.UnitTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#yearQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearQualifier(fglParser.YearQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#monthQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthQualifier(fglParser.MonthQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#dayQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDayQualifier(fglParser.DayQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#hourQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHourQualifier(fglParser.HourQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#minuteQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinuteQualifier(fglParser.MinuteQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#secondQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondQualifier(fglParser.SecondQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#fractionQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFractionQualifier(fglParser.FractionQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#structuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredType(fglParser.StructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(fglParser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#arrayIndexer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexer(fglParser.ArrayIndexerContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(fglParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#dynArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynArrayType(fglParser.DynArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(fglParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(fglParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(fglParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(fglParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlabelledStatement(fglParser.UnlabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(fglParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#runStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunStatement(fglParser.RunStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(fglParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(fglParser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#procedureIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureIdentifier(fglParser.ProcedureIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(fglParser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(fglParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(fglParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#logicalTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalTerm(fglParser.LogicalTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#logicalFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalFactor(fglParser.LogicalFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#quantifiedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiedFactor(fglParser.QuantifiedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#expressionSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSet(fglParser.ExpressionSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(fglParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlExpression(fglParser.SqlExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlAlias(fglParser.SqlAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlTerm(fglParser.SqlTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlMultiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlMultiply(fglParser.SqlMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlFactor(fglParser.SqlFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlFactor2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlFactor2(fglParser.SqlFactor2Context ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlExpressionList(fglParser.SqlExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlLiteral(fglParser.SqlLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlVariable(fglParser.SqlVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlFunction(fglParser.SqlFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#dateFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateFunction(fglParser.DateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#numberFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFunction(fglParser.NumberFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#charFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunction(fglParser.CharFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#groupFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupFunction(fglParser.GroupFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#otherFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherFunction(fglParser.OtherFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlPseudoColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlPseudoColumn(fglParser.SqlPseudoColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(fglParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(fglParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#ifCondition2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition2(fglParser.IfCondition2Context ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#ifLogicalTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLogicalTerm(fglParser.IfLogicalTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(fglParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#ifLogicalFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLogicalFactor(fglParser.IfLogicalFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(fglParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#addingOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddingOperator(fglParser.AddingOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(fglParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingOperator(fglParser.MultiplyingOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(fglParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#functionDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDesignator(fglParser.FunctionDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(fglParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(fglParser.UnsignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(fglParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#numericConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericConstant(fglParser.NumericConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(fglParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#entireVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntireVariable(fglParser.EntireVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#variableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableIdentifier(fglParser.VariableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#indexingVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexingVariable(fglParser.IndexingVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#componentVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentVariable(fglParser.ComponentVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#recordVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordVariable(fglParser.RecordVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#fieldIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldIdentifier(fglParser.FieldIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(fglParser.StructuredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(fglParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(fglParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetetiveStatement(fglParser.RepetetiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(fglParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(fglParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(fglParser.ForListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#controlVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlVariable(fglParser.ControlVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#initialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialValue(fglParser.InitialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(fglParser.FinalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#forEachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachStatement(fglParser.ForEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#variableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableList(fglParser.VariableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#variableOrConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrConstantList(fglParser.VariableOrConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(fglParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#otherFGLStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherFGLStatement(fglParser.OtherFGLStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#otherProgramFlowStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherProgramFlowStatement(fglParser.OtherProgramFlowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#exitTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitTypes(fglParser.ExitTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#exitStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStatements(fglParser.ExitStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#continueStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatements(fglParser.ContinueStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#otherStorageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherStorageStatement(fglParser.OtherStorageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#printExpressionItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpressionItem(fglParser.PrintExpressionItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#printExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpressionList(fglParser.PrintExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#reportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportStatement(fglParser.ReportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#fieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldName(fglParser.FieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#thruNotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThruNotation(fglParser.ThruNotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(fglParser.FieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#keyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyList(fglParser.KeyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#constructEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructEvents(fglParser.ConstructEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#constructInsideStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructInsideStatement(fglParser.ConstructInsideStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#specialAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialAttribute(fglParser.SpecialAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(fglParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#attributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeList(fglParser.AttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#constructGroupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructGroupStatement(fglParser.ConstructGroupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#constructStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructStatement(fglParser.ConstructStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#displayArrayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayArrayStatement(fglParser.DisplayArrayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#displayInsideStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayInsideStatement(fglParser.DisplayInsideStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#displayEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayEvents(fglParser.DisplayEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#displayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStatement(fglParser.DisplayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#errorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorStatement(fglParser.ErrorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#messageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageStatement(fglParser.MessageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#promptStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPromptStatement(fglParser.PromptStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#inputEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputEvents(fglParser.InputEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#inputInsideStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputInsideStatement(fglParser.InputInsideStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#inputGroupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputGroupStatement(fglParser.InputGroupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(fglParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#inputArrayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputArrayStatement(fglParser.InputArrayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#menuEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenuEvents(fglParser.MenuEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#menuInsideStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenuInsideStatement(fglParser.MenuInsideStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#menuGroupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenuGroupStatement(fglParser.MenuGroupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#menuStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenuStatement(fglParser.MenuStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#reservedLinePosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedLinePosition(fglParser.ReservedLinePositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#specialWindowAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialWindowAttribute(fglParser.SpecialWindowAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#windowAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowAttribute(fglParser.WindowAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#windowAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowAttributeList(fglParser.WindowAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#optionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionStatement(fglParser.OptionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#optionsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionsStatement(fglParser.OptionsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#screenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScreenStatement(fglParser.ScreenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatements(fglParser.SqlStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#cursorManipulationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorManipulationStatement(fglParser.CursorManipulationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#columnsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnsList(fglParser.ColumnsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#statementId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementId(fglParser.StatementIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#cursorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorName(fglParser.CursorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(fglParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#columnItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnItem(fglParser.ColumnItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#dataDefinitionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDefinitionStatement(fglParser.DataDefinitionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#dataManipulationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataManipulationStatement(fglParser.DataManipulationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlSelectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlSelectStatement(fglParser.SqlSelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#columnsTableId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnsTableId(fglParser.ColumnsTableIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(fglParser.SelectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#headSelectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadSelectStatement(fglParser.HeadSelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#tableQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableQualifier(fglParser.TableQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(fglParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#fromTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromTable(fglParser.FromTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#tableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExpression(fglParser.TableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#fromSelectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromSelectStatement(fglParser.FromSelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#aliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasName(fglParser.AliasNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#mainSelectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainSelectStatement(fglParser.MainSelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#unionSelectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionSelectStatement(fglParser.UnionSelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#simpleSelectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelectStatement(fglParser.SimpleSelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#whereStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereStatement(fglParser.WhereStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#groupByStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByStatement(fglParser.GroupByStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#havingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingStatement(fglParser.HavingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#orderbyColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderbyColumn(fglParser.OrderbyColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#orderbyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderbyStatement(fglParser.OrderbyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlLoadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlLoadStatement(fglParser.SqlLoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlUnLoadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlUnLoadStatement(fglParser.SqlUnLoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlInsertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlInsertStatement(fglParser.SqlInsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlUpdateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlUpdateStatement(fglParser.SqlUpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sqlDeleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlDeleteStatement(fglParser.SqlDeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#actualParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameterList(fglParser.ActualParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#dynamicManagementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicManagementStatement(fglParser.DynamicManagementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#queryOptimizationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOptimizationStatement(fglParser.QueryOptimizationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#databaseDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseDeclaration(fglParser.DatabaseDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#clientServerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClientServerStatement(fglParser.ClientServerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#dataIntegrityStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataIntegrityStatement(fglParser.DataIntegrityStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#wheneverStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWheneverStatement(fglParser.WheneverStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#wheneverType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWheneverType(fglParser.WheneverTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#wheneverFlow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWheneverFlow(fglParser.WheneverFlowContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#reportDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportDefinition(fglParser.ReportDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#outputReport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputReport(fglParser.OutputReportContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#formatReport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatReport(fglParser.FormatReportContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#eol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEol(fglParser.EolContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(fglParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#unsignedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedInteger(fglParser.UnsignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#unsignedReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedReal(fglParser.UnsignedRealContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(fglParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link fglParser#constantIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantIdentifier(fglParser.ConstantIdentifierContext ctx);
}