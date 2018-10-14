// Generated from fgl.g4 by ANTLR 4.5.3
package fgl.freecompile.net;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fglParser}.
 */
public interface fglListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fglParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(fglParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(fglParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(fglParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(fglParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainBlock(fglParser.MainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainBlock(fglParser.MainBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#mainStatements}.
	 * @param ctx the parse tree
	 */
	void enterMainStatements(fglParser.MainStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#mainStatements}.
	 * @param ctx the parse tree
	 */
	void exitMainStatements(fglParser.MainStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeferStatement(fglParser.DeferStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeferStatement(fglParser.DeferStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#functionOrReportDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionOrReportDefinitions(fglParser.FunctionOrReportDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#functionOrReportDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionOrReportDefinitions(fglParser.FunctionOrReportDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(fglParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(fglParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(fglParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(fglParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(fglParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(fglParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(fglParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(fglParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDeclaration(fglParser.GlobalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDeclaration(fglParser.GlobalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#typeDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclarations(fglParser.TypeDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#typeDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclarations(fglParser.TypeDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(fglParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(fglParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(fglParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(fglParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(fglParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(fglParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#indirectType}.
	 * @param ctx the parse tree
	 */
	void enterIndirectType(fglParser.IndirectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#indirectType}.
	 * @param ctx the parse tree
	 */
	void exitIndirectType(fglParser.IndirectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(fglParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(fglParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#largeType}.
	 * @param ctx the parse tree
	 */
	void enterLargeType(fglParser.LargeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#largeType}.
	 * @param ctx the parse tree
	 */
	void exitLargeType(fglParser.LargeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#numberType}.
	 * @param ctx the parse tree
	 */
	void enterNumberType(fglParser.NumberTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#numberType}.
	 * @param ctx the parse tree
	 */
	void exitNumberType(fglParser.NumberTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#charType}.
	 * @param ctx the parse tree
	 */
	void enterCharType(fglParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#charType}.
	 * @param ctx the parse tree
	 */
	void exitCharType(fglParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#timeType}.
	 * @param ctx the parse tree
	 */
	void enterTimeType(fglParser.TimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#timeType}.
	 * @param ctx the parse tree
	 */
	void exitTimeType(fglParser.TimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#datetimeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeQualifier(fglParser.DatetimeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#datetimeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeQualifier(fglParser.DatetimeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#intervalQualifier}.
	 * @param ctx the parse tree
	 */
	void enterIntervalQualifier(fglParser.IntervalQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#intervalQualifier}.
	 * @param ctx the parse tree
	 */
	void exitIntervalQualifier(fglParser.IntervalQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#unitType}.
	 * @param ctx the parse tree
	 */
	void enterUnitType(fglParser.UnitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#unitType}.
	 * @param ctx the parse tree
	 */
	void exitUnitType(fglParser.UnitTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#yearQualifier}.
	 * @param ctx the parse tree
	 */
	void enterYearQualifier(fglParser.YearQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#yearQualifier}.
	 * @param ctx the parse tree
	 */
	void exitYearQualifier(fglParser.YearQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#monthQualifier}.
	 * @param ctx the parse tree
	 */
	void enterMonthQualifier(fglParser.MonthQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#monthQualifier}.
	 * @param ctx the parse tree
	 */
	void exitMonthQualifier(fglParser.MonthQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#dayQualifier}.
	 * @param ctx the parse tree
	 */
	void enterDayQualifier(fglParser.DayQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#dayQualifier}.
	 * @param ctx the parse tree
	 */
	void exitDayQualifier(fglParser.DayQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#hourQualifier}.
	 * @param ctx the parse tree
	 */
	void enterHourQualifier(fglParser.HourQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#hourQualifier}.
	 * @param ctx the parse tree
	 */
	void exitHourQualifier(fglParser.HourQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#minuteQualifier}.
	 * @param ctx the parse tree
	 */
	void enterMinuteQualifier(fglParser.MinuteQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#minuteQualifier}.
	 * @param ctx the parse tree
	 */
	void exitMinuteQualifier(fglParser.MinuteQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#secondQualifier}.
	 * @param ctx the parse tree
	 */
	void enterSecondQualifier(fglParser.SecondQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#secondQualifier}.
	 * @param ctx the parse tree
	 */
	void exitSecondQualifier(fglParser.SecondQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#fractionQualifier}.
	 * @param ctx the parse tree
	 */
	void enterFractionQualifier(fglParser.FractionQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#fractionQualifier}.
	 * @param ctx the parse tree
	 */
	void exitFractionQualifier(fglParser.FractionQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(fglParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(fglParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(fglParser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(fglParser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#arrayIndexer}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexer(fglParser.ArrayIndexerContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#arrayIndexer}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexer(fglParser.ArrayIndexerContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(fglParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(fglParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#dynArrayType}.
	 * @param ctx the parse tree
	 */
	void enterDynArrayType(fglParser.DynArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#dynArrayType}.
	 * @param ctx the parse tree
	 */
	void exitDynArrayType(fglParser.DynArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(fglParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(fglParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(fglParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(fglParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(fglParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(fglParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(fglParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(fglParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(fglParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(fglParser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(fglParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(fglParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#runStatement}.
	 * @param ctx the parse tree
	 */
	void enterRunStatement(fglParser.RunStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#runStatement}.
	 * @param ctx the parse tree
	 */
	void exitRunStatement(fglParser.RunStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(fglParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(fglParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(fglParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(fglParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#procedureIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterProcedureIdentifier(fglParser.ProcedureIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#procedureIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitProcedureIdentifier(fglParser.ProcedureIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(fglParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(fglParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(fglParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(fglParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(fglParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(fglParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#logicalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLogicalTerm(fglParser.LogicalTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#logicalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLogicalTerm(fglParser.LogicalTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#logicalFactor}.
	 * @param ctx the parse tree
	 */
	void enterLogicalFactor(fglParser.LogicalFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#logicalFactor}.
	 * @param ctx the parse tree
	 */
	void exitLogicalFactor(fglParser.LogicalFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#quantifiedFactor}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiedFactor(fglParser.QuantifiedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#quantifiedFactor}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiedFactor(fglParser.QuantifiedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#expressionSet}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSet(fglParser.ExpressionSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#expressionSet}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSet(fglParser.ExpressionSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(fglParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(fglParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlExpression}.
	 * @param ctx the parse tree
	 */
	void enterSqlExpression(fglParser.SqlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlExpression}.
	 * @param ctx the parse tree
	 */
	void exitSqlExpression(fglParser.SqlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlAlias}.
	 * @param ctx the parse tree
	 */
	void enterSqlAlias(fglParser.SqlAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlAlias}.
	 * @param ctx the parse tree
	 */
	void exitSqlAlias(fglParser.SqlAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlTerm}.
	 * @param ctx the parse tree
	 */
	void enterSqlTerm(fglParser.SqlTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlTerm}.
	 * @param ctx the parse tree
	 */
	void exitSqlTerm(fglParser.SqlTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlMultiply}.
	 * @param ctx the parse tree
	 */
	void enterSqlMultiply(fglParser.SqlMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlMultiply}.
	 * @param ctx the parse tree
	 */
	void exitSqlMultiply(fglParser.SqlMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlFactor}.
	 * @param ctx the parse tree
	 */
	void enterSqlFactor(fglParser.SqlFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlFactor}.
	 * @param ctx the parse tree
	 */
	void exitSqlFactor(fglParser.SqlFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlFactor2}.
	 * @param ctx the parse tree
	 */
	void enterSqlFactor2(fglParser.SqlFactor2Context ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlFactor2}.
	 * @param ctx the parse tree
	 */
	void exitSqlFactor2(fglParser.SqlFactor2Context ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterSqlExpressionList(fglParser.SqlExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitSqlExpressionList(fglParser.SqlExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSqlLiteral(fglParser.SqlLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSqlLiteral(fglParser.SqlLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlVariable}.
	 * @param ctx the parse tree
	 */
	void enterSqlVariable(fglParser.SqlVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlVariable}.
	 * @param ctx the parse tree
	 */
	void exitSqlVariable(fglParser.SqlVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlFunction}.
	 * @param ctx the parse tree
	 */
	void enterSqlFunction(fglParser.SqlFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlFunction}.
	 * @param ctx the parse tree
	 */
	void exitSqlFunction(fglParser.SqlFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#dateFunction}.
	 * @param ctx the parse tree
	 */
	void enterDateFunction(fglParser.DateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#dateFunction}.
	 * @param ctx the parse tree
	 */
	void exitDateFunction(fglParser.DateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#numberFunction}.
	 * @param ctx the parse tree
	 */
	void enterNumberFunction(fglParser.NumberFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#numberFunction}.
	 * @param ctx the parse tree
	 */
	void exitNumberFunction(fglParser.NumberFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(fglParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(fglParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#groupFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupFunction(fglParser.GroupFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#groupFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupFunction(fglParser.GroupFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#otherFunction}.
	 * @param ctx the parse tree
	 */
	void enterOtherFunction(fglParser.OtherFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#otherFunction}.
	 * @param ctx the parse tree
	 */
	void exitOtherFunction(fglParser.OtherFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlPseudoColumn}.
	 * @param ctx the parse tree
	 */
	void enterSqlPseudoColumn(fglParser.SqlPseudoColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlPseudoColumn}.
	 * @param ctx the parse tree
	 */
	void exitSqlPseudoColumn(fglParser.SqlPseudoColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(fglParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(fglParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(fglParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(fglParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#ifCondition2}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition2(fglParser.IfCondition2Context ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#ifCondition2}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition2(fglParser.IfCondition2Context ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#ifLogicalTerm}.
	 * @param ctx the parse tree
	 */
	void enterIfLogicalTerm(fglParser.IfLogicalTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#ifLogicalTerm}.
	 * @param ctx the parse tree
	 */
	void exitIfLogicalTerm(fglParser.IfLogicalTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(fglParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(fglParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#ifLogicalFactor}.
	 * @param ctx the parse tree
	 */
	void enterIfLogicalFactor(fglParser.IfLogicalFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#ifLogicalFactor}.
	 * @param ctx the parse tree
	 */
	void exitIfLogicalFactor(fglParser.IfLogicalFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(fglParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(fglParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#addingOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddingOperator(fglParser.AddingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#addingOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddingOperator(fglParser.AddingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(fglParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(fglParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingOperator(fglParser.MultiplyingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingOperator(fglParser.MultiplyingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(fglParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(fglParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(fglParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(fglParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(fglParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(fglParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(fglParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(fglParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(fglParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(fglParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void enterNumericConstant(fglParser.NumericConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void exitNumericConstant(fglParser.NumericConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(fglParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(fglParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#entireVariable}.
	 * @param ctx the parse tree
	 */
	void enterEntireVariable(fglParser.EntireVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#entireVariable}.
	 * @param ctx the parse tree
	 */
	void exitEntireVariable(fglParser.EntireVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(fglParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(fglParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#indexingVariable}.
	 * @param ctx the parse tree
	 */
	void enterIndexingVariable(fglParser.IndexingVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#indexingVariable}.
	 * @param ctx the parse tree
	 */
	void exitIndexingVariable(fglParser.IndexingVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#componentVariable}.
	 * @param ctx the parse tree
	 */
	void enterComponentVariable(fglParser.ComponentVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#componentVariable}.
	 * @param ctx the parse tree
	 */
	void exitComponentVariable(fglParser.ComponentVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#recordVariable}.
	 * @param ctx the parse tree
	 */
	void enterRecordVariable(fglParser.RecordVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#recordVariable}.
	 * @param ctx the parse tree
	 */
	void exitRecordVariable(fglParser.RecordVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#fieldIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldIdentifier(fglParser.FieldIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#fieldIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldIdentifier(fglParser.FieldIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(fglParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(fglParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(fglParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(fglParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(fglParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(fglParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(fglParser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(fglParser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(fglParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(fglParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(fglParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(fglParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(fglParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(fglParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#controlVariable}.
	 * @param ctx the parse tree
	 */
	void enterControlVariable(fglParser.ControlVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#controlVariable}.
	 * @param ctx the parse tree
	 */
	void exitControlVariable(fglParser.ControlVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(fglParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(fglParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(fglParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(fglParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(fglParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(fglParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#variableList}.
	 * @param ctx the parse tree
	 */
	void enterVariableList(fglParser.VariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#variableList}.
	 * @param ctx the parse tree
	 */
	void exitVariableList(fglParser.VariableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#variableOrConstantList}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrConstantList(fglParser.VariableOrConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#variableOrConstantList}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrConstantList(fglParser.VariableOrConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(fglParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(fglParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#otherFGLStatement}.
	 * @param ctx the parse tree
	 */
	void enterOtherFGLStatement(fglParser.OtherFGLStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#otherFGLStatement}.
	 * @param ctx the parse tree
	 */
	void exitOtherFGLStatement(fglParser.OtherFGLStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#otherProgramFlowStatement}.
	 * @param ctx the parse tree
	 */
	void enterOtherProgramFlowStatement(fglParser.OtherProgramFlowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#otherProgramFlowStatement}.
	 * @param ctx the parse tree
	 */
	void exitOtherProgramFlowStatement(fglParser.OtherProgramFlowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#exitTypes}.
	 * @param ctx the parse tree
	 */
	void enterExitTypes(fglParser.ExitTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#exitTypes}.
	 * @param ctx the parse tree
	 */
	void exitExitTypes(fglParser.ExitTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#exitStatements}.
	 * @param ctx the parse tree
	 */
	void enterExitStatements(fglParser.ExitStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#exitStatements}.
	 * @param ctx the parse tree
	 */
	void exitExitStatements(fglParser.ExitStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#continueStatements}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatements(fglParser.ContinueStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#continueStatements}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatements(fglParser.ContinueStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#otherStorageStatement}.
	 * @param ctx the parse tree
	 */
	void enterOtherStorageStatement(fglParser.OtherStorageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#otherStorageStatement}.
	 * @param ctx the parse tree
	 */
	void exitOtherStorageStatement(fglParser.OtherStorageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#printExpressionItem}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpressionItem(fglParser.PrintExpressionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#printExpressionItem}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpressionItem(fglParser.PrintExpressionItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#printExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpressionList(fglParser.PrintExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#printExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpressionList(fglParser.PrintExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#reportStatement}.
	 * @param ctx the parse tree
	 */
	void enterReportStatement(fglParser.ReportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#reportStatement}.
	 * @param ctx the parse tree
	 */
	void exitReportStatement(fglParser.ReportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(fglParser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(fglParser.FieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#thruNotation}.
	 * @param ctx the parse tree
	 */
	void enterThruNotation(fglParser.ThruNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#thruNotation}.
	 * @param ctx the parse tree
	 */
	void exitThruNotation(fglParser.ThruNotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(fglParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(fglParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#keyList}.
	 * @param ctx the parse tree
	 */
	void enterKeyList(fglParser.KeyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#keyList}.
	 * @param ctx the parse tree
	 */
	void exitKeyList(fglParser.KeyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#constructEvents}.
	 * @param ctx the parse tree
	 */
	void enterConstructEvents(fglParser.ConstructEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#constructEvents}.
	 * @param ctx the parse tree
	 */
	void exitConstructEvents(fglParser.ConstructEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#constructInsideStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstructInsideStatement(fglParser.ConstructInsideStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#constructInsideStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstructInsideStatement(fglParser.ConstructInsideStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#specialAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSpecialAttribute(fglParser.SpecialAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#specialAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSpecialAttribute(fglParser.SpecialAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(fglParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(fglParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(fglParser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(fglParser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#constructGroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstructGroupStatement(fglParser.ConstructGroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#constructGroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstructGroupStatement(fglParser.ConstructGroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#constructStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstructStatement(fglParser.ConstructStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#constructStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstructStatement(fglParser.ConstructStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#displayArrayStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisplayArrayStatement(fglParser.DisplayArrayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#displayArrayStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisplayArrayStatement(fglParser.DisplayArrayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#displayInsideStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisplayInsideStatement(fglParser.DisplayInsideStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#displayInsideStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisplayInsideStatement(fglParser.DisplayInsideStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#displayEvents}.
	 * @param ctx the parse tree
	 */
	void enterDisplayEvents(fglParser.DisplayEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#displayEvents}.
	 * @param ctx the parse tree
	 */
	void exitDisplayEvents(fglParser.DisplayEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisplayStatement(fglParser.DisplayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisplayStatement(fglParser.DisplayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#errorStatement}.
	 * @param ctx the parse tree
	 */
	void enterErrorStatement(fglParser.ErrorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#errorStatement}.
	 * @param ctx the parse tree
	 */
	void exitErrorStatement(fglParser.ErrorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#messageStatement}.
	 * @param ctx the parse tree
	 */
	void enterMessageStatement(fglParser.MessageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#messageStatement}.
	 * @param ctx the parse tree
	 */
	void exitMessageStatement(fglParser.MessageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#promptStatement}.
	 * @param ctx the parse tree
	 */
	void enterPromptStatement(fglParser.PromptStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#promptStatement}.
	 * @param ctx the parse tree
	 */
	void exitPromptStatement(fglParser.PromptStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#inputEvents}.
	 * @param ctx the parse tree
	 */
	void enterInputEvents(fglParser.InputEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#inputEvents}.
	 * @param ctx the parse tree
	 */
	void exitInputEvents(fglParser.InputEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#inputInsideStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputInsideStatement(fglParser.InputInsideStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#inputInsideStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputInsideStatement(fglParser.InputInsideStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#inputGroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputGroupStatement(fglParser.InputGroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#inputGroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputGroupStatement(fglParser.InputGroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(fglParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(fglParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#inputArrayStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputArrayStatement(fglParser.InputArrayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#inputArrayStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputArrayStatement(fglParser.InputArrayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#menuEvents}.
	 * @param ctx the parse tree
	 */
	void enterMenuEvents(fglParser.MenuEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#menuEvents}.
	 * @param ctx the parse tree
	 */
	void exitMenuEvents(fglParser.MenuEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#menuInsideStatement}.
	 * @param ctx the parse tree
	 */
	void enterMenuInsideStatement(fglParser.MenuInsideStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#menuInsideStatement}.
	 * @param ctx the parse tree
	 */
	void exitMenuInsideStatement(fglParser.MenuInsideStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#menuGroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterMenuGroupStatement(fglParser.MenuGroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#menuGroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitMenuGroupStatement(fglParser.MenuGroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#menuStatement}.
	 * @param ctx the parse tree
	 */
	void enterMenuStatement(fglParser.MenuStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#menuStatement}.
	 * @param ctx the parse tree
	 */
	void exitMenuStatement(fglParser.MenuStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#reservedLinePosition}.
	 * @param ctx the parse tree
	 */
	void enterReservedLinePosition(fglParser.ReservedLinePositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#reservedLinePosition}.
	 * @param ctx the parse tree
	 */
	void exitReservedLinePosition(fglParser.ReservedLinePositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#specialWindowAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSpecialWindowAttribute(fglParser.SpecialWindowAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#specialWindowAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSpecialWindowAttribute(fglParser.SpecialWindowAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#windowAttribute}.
	 * @param ctx the parse tree
	 */
	void enterWindowAttribute(fglParser.WindowAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#windowAttribute}.
	 * @param ctx the parse tree
	 */
	void exitWindowAttribute(fglParser.WindowAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#windowAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterWindowAttributeList(fglParser.WindowAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#windowAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitWindowAttributeList(fglParser.WindowAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#optionStatement}.
	 * @param ctx the parse tree
	 */
	void enterOptionStatement(fglParser.OptionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#optionStatement}.
	 * @param ctx the parse tree
	 */
	void exitOptionStatement(fglParser.OptionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#optionsStatement}.
	 * @param ctx the parse tree
	 */
	void enterOptionsStatement(fglParser.OptionsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#optionsStatement}.
	 * @param ctx the parse tree
	 */
	void exitOptionsStatement(fglParser.OptionsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#screenStatement}.
	 * @param ctx the parse tree
	 */
	void enterScreenStatement(fglParser.ScreenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#screenStatement}.
	 * @param ctx the parse tree
	 */
	void exitScreenStatement(fglParser.ScreenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(fglParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(fglParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#cursorManipulationStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorManipulationStatement(fglParser.CursorManipulationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#cursorManipulationStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorManipulationStatement(fglParser.CursorManipulationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#columnsList}.
	 * @param ctx the parse tree
	 */
	void enterColumnsList(fglParser.ColumnsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#columnsList}.
	 * @param ctx the parse tree
	 */
	void exitColumnsList(fglParser.ColumnsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#statementId}.
	 * @param ctx the parse tree
	 */
	void enterStatementId(fglParser.StatementIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#statementId}.
	 * @param ctx the parse tree
	 */
	void exitStatementId(fglParser.StatementIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(fglParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(fglParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(fglParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(fglParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#columnItem}.
	 * @param ctx the parse tree
	 */
	void enterColumnItem(fglParser.ColumnItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#columnItem}.
	 * @param ctx the parse tree
	 */
	void exitColumnItem(fglParser.ColumnItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#dataDefinitionStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataDefinitionStatement(fglParser.DataDefinitionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#dataDefinitionStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataDefinitionStatement(fglParser.DataDefinitionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#dataManipulationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataManipulationStatement(fglParser.DataManipulationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#dataManipulationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataManipulationStatement(fglParser.DataManipulationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlSelectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlSelectStatement(fglParser.SqlSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlSelectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlSelectStatement(fglParser.SqlSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#columnsTableId}.
	 * @param ctx the parse tree
	 */
	void enterColumnsTableId(fglParser.ColumnsTableIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#columnsTableId}.
	 * @param ctx the parse tree
	 */
	void exitColumnsTableId(fglParser.ColumnsTableIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(fglParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(fglParser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#headSelectStatement}.
	 * @param ctx the parse tree
	 */
	void enterHeadSelectStatement(fglParser.HeadSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#headSelectStatement}.
	 * @param ctx the parse tree
	 */
	void exitHeadSelectStatement(fglParser.HeadSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#tableQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTableQualifier(fglParser.TableQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#tableQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTableQualifier(fglParser.TableQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(fglParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(fglParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void enterFromTable(fglParser.FromTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void exitFromTable(fglParser.FromTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void enterTableExpression(fglParser.TableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void exitTableExpression(fglParser.TableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#fromSelectStatement}.
	 * @param ctx the parse tree
	 */
	void enterFromSelectStatement(fglParser.FromSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#fromSelectStatement}.
	 * @param ctx the parse tree
	 */
	void exitFromSelectStatement(fglParser.FromSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(fglParser.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(fglParser.AliasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#mainSelectStatement}.
	 * @param ctx the parse tree
	 */
	void enterMainSelectStatement(fglParser.MainSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#mainSelectStatement}.
	 * @param ctx the parse tree
	 */
	void exitMainSelectStatement(fglParser.MainSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#unionSelectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionSelectStatement(fglParser.UnionSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#unionSelectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionSelectStatement(fglParser.UnionSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#simpleSelectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelectStatement(fglParser.SimpleSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#simpleSelectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelectStatement(fglParser.SimpleSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#whereStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhereStatement(fglParser.WhereStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#whereStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhereStatement(fglParser.WhereStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#groupByStatement}.
	 * @param ctx the parse tree
	 */
	void enterGroupByStatement(fglParser.GroupByStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#groupByStatement}.
	 * @param ctx the parse tree
	 */
	void exitGroupByStatement(fglParser.GroupByStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#havingStatement}.
	 * @param ctx the parse tree
	 */
	void enterHavingStatement(fglParser.HavingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#havingStatement}.
	 * @param ctx the parse tree
	 */
	void exitHavingStatement(fglParser.HavingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#orderbyColumn}.
	 * @param ctx the parse tree
	 */
	void enterOrderbyColumn(fglParser.OrderbyColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#orderbyColumn}.
	 * @param ctx the parse tree
	 */
	void exitOrderbyColumn(fglParser.OrderbyColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#orderbyStatement}.
	 * @param ctx the parse tree
	 */
	void enterOrderbyStatement(fglParser.OrderbyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#orderbyStatement}.
	 * @param ctx the parse tree
	 */
	void exitOrderbyStatement(fglParser.OrderbyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlLoadStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlLoadStatement(fglParser.SqlLoadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlLoadStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlLoadStatement(fglParser.SqlLoadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlUnLoadStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlUnLoadStatement(fglParser.SqlUnLoadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlUnLoadStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlUnLoadStatement(fglParser.SqlUnLoadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlInsertStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlInsertStatement(fglParser.SqlInsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlInsertStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlInsertStatement(fglParser.SqlInsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlUpdateStatement(fglParser.SqlUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlUpdateStatement(fglParser.SqlUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sqlDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlDeleteStatement(fglParser.SqlDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sqlDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlDeleteStatement(fglParser.SqlDeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void enterActualParameterList(fglParser.ActualParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void exitActualParameterList(fglParser.ActualParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#dynamicManagementStatement}.
	 * @param ctx the parse tree
	 */
	void enterDynamicManagementStatement(fglParser.DynamicManagementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#dynamicManagementStatement}.
	 * @param ctx the parse tree
	 */
	void exitDynamicManagementStatement(fglParser.DynamicManagementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#queryOptimizationStatement}.
	 * @param ctx the parse tree
	 */
	void enterQueryOptimizationStatement(fglParser.QueryOptimizationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#queryOptimizationStatement}.
	 * @param ctx the parse tree
	 */
	void exitQueryOptimizationStatement(fglParser.QueryOptimizationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#databaseDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseDeclaration(fglParser.DatabaseDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#databaseDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseDeclaration(fglParser.DatabaseDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#clientServerStatement}.
	 * @param ctx the parse tree
	 */
	void enterClientServerStatement(fglParser.ClientServerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#clientServerStatement}.
	 * @param ctx the parse tree
	 */
	void exitClientServerStatement(fglParser.ClientServerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#dataIntegrityStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataIntegrityStatement(fglParser.DataIntegrityStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#dataIntegrityStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataIntegrityStatement(fglParser.DataIntegrityStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#wheneverStatement}.
	 * @param ctx the parse tree
	 */
	void enterWheneverStatement(fglParser.WheneverStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#wheneverStatement}.
	 * @param ctx the parse tree
	 */
	void exitWheneverStatement(fglParser.WheneverStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#wheneverType}.
	 * @param ctx the parse tree
	 */
	void enterWheneverType(fglParser.WheneverTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#wheneverType}.
	 * @param ctx the parse tree
	 */
	void exitWheneverType(fglParser.WheneverTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#wheneverFlow}.
	 * @param ctx the parse tree
	 */
	void enterWheneverFlow(fglParser.WheneverFlowContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#wheneverFlow}.
	 * @param ctx the parse tree
	 */
	void exitWheneverFlow(fglParser.WheneverFlowContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#reportDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReportDefinition(fglParser.ReportDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#reportDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReportDefinition(fglParser.ReportDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#outputReport}.
	 * @param ctx the parse tree
	 */
	void enterOutputReport(fglParser.OutputReportContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#outputReport}.
	 * @param ctx the parse tree
	 */
	void exitOutputReport(fglParser.OutputReportContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#formatReport}.
	 * @param ctx the parse tree
	 */
	void enterFormatReport(fglParser.FormatReportContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#formatReport}.
	 * @param ctx the parse tree
	 */
	void exitFormatReport(fglParser.FormatReportContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#eol}.
	 * @param ctx the parse tree
	 */
	void enterEol(fglParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#eol}.
	 * @param ctx the parse tree
	 */
	void exitEol(fglParser.EolContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(fglParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(fglParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(fglParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(fglParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(fglParser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(fglParser.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(fglParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(fglParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link fglParser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantIdentifier(fglParser.ConstantIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fglParser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantIdentifier(fglParser.ConstantIdentifierContext ctx);
}