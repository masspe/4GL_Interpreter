// Generated from fgl.g4 by ANTLR 4.5.3
package fgl.freecompile.net;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fglParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSOLUTE=1, AFTER=2, ACCEPT=3, AGGREGATE=4, ALLOCATE=5, ALL=6, ALL_ROWS=7, 
		AND=8, ANY=9, AS=10, ASC=11, ASCII=12, ASSIGN=13, AT=14, ATTRIBUTE=15, 
		ATTRIBUTES=16, AVERAGE=17, AVG=18, ARRAY=19, BEFORE=20, BEGIN=21, BETWEEN=22, 
		BIGINT=23, BLACK=24, BLINK=25, BLUE=26, BOLD=27, BORDER=28, BOTTOM=29, 
		BUFFERED=30, BY=31, BYTE=32, CACHE=33, CALL=34, CASE=35, CHAR=36, CHARARACTER=37, 
		CHAR_LENGTH=38, CHECK=39, CLEAR=40, CLIPPED=41, CLOSE=42, CLUSTER=43, 
		COLUMN=44, COLUMNS=45, COMMAND=46, COMMENT=47, COMMIT=48, COMMITTED=49, 
		CONNECT=50, CONSTANT=51, CONSTRAINED=52, CONSTRAINT=53, CONSTRUCT=54, 
		CONTINUE=55, COUNT=56, COPY=57, CRCOLS=58, CREATE=59, CURRENT=60, CURSOR=61, 
		CYAN=62, DATABASE=63, DATE=64, DATETIME=65, DAY=66, DEALLOCATE=67, DEC=68, 
		DECIMAL=69, DECODE=70, DECLARE=71, DEFAULT=72, DEFAULTS=73, DEFER=74, 
		DEFINE=75, DEF=76, VARIABLE=77, VAR=78, DELETE=79, CHARACTER=80, DIV=81, 
		DELIMITER=82, DESC=83, DIM=84, DIMENSIONS=85, DIRTY=86, DISPLAY=87, DISTINCT=88, 
		DO=89, DOUBLE=90, DOWN=91, DROP=92, DYNAMIC=93, EACH=94, ELSE=95, END=96, 
		ERROR=97, ESCAPE=98, EVERY=99, EXCLUSIVE=100, EXEC=101, EXECUTE=102, EXIT=103, 
		EXISTS=104, EXPLAIN=105, EXTEND=106, EXTENT=107, EXTERNAL=108, FALSE=109, 
		FETCH=110, FIELD=111, FIELD_TOUCHED=112, FILE=113, FINISH=114, FIRST=115, 
		FIRST_ROWS=116, FLOAT=117, FLUSH=118, FOR=119, FORM=120, FORMAT=121, FORMONLY=122, 
		FOREACH=123, FOUND=124, FRACTION=125, FREE=126, FROM=127, FUNCTION=128, 
		GET_FLDBUF=129, GLOBALS=130, GO=131, GOTO=132, GREEN=133, GROUP=134, HAVING=135, 
		HEADER=136, HELP=137, HIDE=138, HOLD=139, HOUR=140, IF=141, IN=142, INNER=143, 
		INDEX=144, INDICATOR=145, INFIELD=146, INITIALIZE=147, INPUT=148, INSERT=149, 
		INSTRUCTIONS=150, INTO=151, INT=152, INT_FLAG=153, INTEGER=154, INTERRUPT=155, 
		INTERVAL=156, INVISIBLE=157, IS=158, ISNULL=159, ISOLATION=160, JOIN=161, 
		KEY=162, LABEL=163, LAST=164, LEFT=165, LENGTH=166, LET=167, LIKE=168, 
		LINE=169, LINENO=170, LINES=171, LOAD=172, LOCATE=173, LOCK=174, LOG=175, 
		LONG=176, MAGENTA=177, MATCHES=178, MENU=179, MESSAGE=180, MAIN=181, MARGIN=182, 
		MAX=183, MDY=184, MIN=185, MINUTE=186, MOD=187, MODE=188, MODULE=189, 
		MONTH=190, MONEY=191, NCHAR=192, NAME=193, NEED=194, NEXT=195, NEW=196, 
		NORMAL=197, NO=198, NOT=199, NOTFOUND=200, NOW=201, NOLOCK=202, NOWAIT=203, 
		NUMERIC=204, NULL=205, NVARCHAR=206, NVL=207, OF=208, OFF=209, ON=210, 
		OPEN=211, OPTION=212, OPTIONS=213, OR=214, ORD=215, ORDER=216, OUTPUT=217, 
		OUTER=218, OTHERWISE=219, PAGE=220, PAGENO=221, PAUSE=222, PERCENT=223, 
		PIPE=224, PRECISION=225, PREPARE=226, PREVIOUS=227, PRINT=228, PRINTER=229, 
		PROGRAM=230, PROMPT=231, PUT=232, QUIT=233, QUIT_FLAG=234, RECORD=235, 
		REAL=236, READ=237, RED=238, RELATIVE=239, REMOVE=240, REOPTIMIZATION=241, 
		REPEATABLE=242, REPEAT=243, REPORT=244, RESIZE=245, RETURN=246, RETURNING=247, 
		REVERSE=248, RIGHT=249, ROLLBACK=250, ROW=251, ROWS=252, RUN=253, SCREEN=254, 
		SCROLL=255, SECOND=256, SKIP2=257, SELECT=258, SET=259, SHARE=260, SHOW=261, 
		SIZE=262, SLEEP=263, SMALLFLOAT=264, SMALLINT=265, SPACE=266, SPACES=267, 
		SQL=268, SQLERROR=269, SQLWARNING=270, START=271, STABILITY=272, STATISTICS=273, 
		STATUS=274, STOP=275, SUM=276, TABLE=277, TABLES=278, TERMINATE=279, TEMP=280, 
		TEXT=281, THEN=282, THROUGH=283, THRU=284, TIME=285, TO=286, TODAY=287, 
		TOP=288, TRAILER=289, TRUE=290, TYPE=291, UNCONSTRAINED=292, UNDERLINE=293, 
		UNION=294, UNIQUE=295, UNITS=296, UNLOAD=297, UP=298, UPDATE=299, USER=300, 
		USING=301, VALIDATE=302, VALUES=303, VARCHAR=304, WEEKDAY=305, VIEW=306, 
		WAIT=307, WAITING=308, WARNING=309, WHEN=310, WHENEVER=311, WHERE=312, 
		WHILE=313, WHITE=314, WITH=315, WITHOUT=316, WINDOW=317, WORDWRAP=318, 
		WORK=319, YEAR=320, YELLOW=321, PLUS=322, MINUS=323, STAR=324, SLASH=325, 
		COMMA=326, SEMI=327, COLON=328, EQUAL=329, NOT_EQUAL=330, LT=331, LE=332, 
		GE=333, GT=334, LPAREN=335, RPAREN=336, LBRACK=337, RBRACK=338, DOT=339, 
		ATSYMBOL=340, DOUBLEVERTBAR=341, IDENT=342, STRING_LITERAL=343, NUM_INT=344, 
		NUM_REAL=345, HEX_DIGIT=346, SL_COMMENT=347, SL_COMMENT_2=348, EOL=349, 
		WS=350, ESC=351, QUOTED_STRING=352, STEP=353, MEMORY=354, SAME=355, WRAP=356, 
		PRIOR=357, SECONDS=358;
	public static final int
		RULE_compilation_unit = 0, RULE_identifier = 1, RULE_mainBlock = 2, RULE_mainStatements = 3, 
		RULE_deferStatement = 4, RULE_functionOrReportDefinitions = 5, RULE_returnStatement = 6, 
		RULE_functionDefinition = 7, RULE_parameterList = 8, RULE_parameterGroup = 9, 
		RULE_globalDeclaration = 10, RULE_typeDeclarations = 11, RULE_typeDeclaration = 12, 
		RULE_variableDeclaration = 13, RULE_type = 14, RULE_indirectType = 15, 
		RULE_typeIdentifier = 16, RULE_largeType = 17, RULE_numberType = 18, RULE_charType = 19, 
		RULE_timeType = 20, RULE_datetimeQualifier = 21, RULE_intervalQualifier = 22, 
		RULE_unitType = 23, RULE_yearQualifier = 24, RULE_monthQualifier = 25, 
		RULE_dayQualifier = 26, RULE_hourQualifier = 27, RULE_minuteQualifier = 28, 
		RULE_secondQualifier = 29, RULE_fractionQualifier = 30, RULE_structuredType = 31, 
		RULE_recordType = 32, RULE_arrayIndexer = 33, RULE_arrayType = 34, RULE_dynArrayType = 35, 
		RULE_string = 36, RULE_statement = 37, RULE_codeBlock = 38, RULE_label = 39, 
		RULE_unlabelledStatement = 40, RULE_simpleStatement = 41, RULE_runStatement = 42, 
		RULE_assignmentStatement = 43, RULE_procedureStatement = 44, RULE_procedureIdentifier = 45, 
		RULE_actualParameter = 46, RULE_gotoStatement = 47, RULE_condition = 48, 
		RULE_logicalTerm = 49, RULE_logicalFactor = 50, RULE_quantifiedFactor = 51, 
		RULE_expressionSet = 52, RULE_subquery = 53, RULE_sqlExpression = 54, 
		RULE_sqlAlias = 55, RULE_sqlTerm = 56, RULE_sqlMultiply = 57, RULE_sqlFactor = 58, 
		RULE_sqlFactor2 = 59, RULE_sqlExpressionList = 60, RULE_sqlLiteral = 61, 
		RULE_sqlVariable = 62, RULE_sqlFunction = 63, RULE_dateFunction = 64, 
		RULE_numberFunction = 65, RULE_charFunction = 66, RULE_groupFunction = 67, 
		RULE_otherFunction = 68, RULE_sqlPseudoColumn = 69, RULE_relationalOperator = 70, 
		RULE_ifCondition = 71, RULE_ifCondition2 = 72, RULE_ifLogicalTerm = 73, 
		RULE_expression = 74, RULE_ifLogicalFactor = 75, RULE_simpleExpression = 76, 
		RULE_addingOperator = 77, RULE_term = 78, RULE_multiplyingOperator = 79, 
		RULE_factor = 80, RULE_functionDesignator = 81, RULE_functionIdentifier = 82, 
		RULE_unsignedConstant = 83, RULE_constant = 84, RULE_numericConstant = 85, 
		RULE_variable = 86, RULE_entireVariable = 87, RULE_variableIdentifier = 88, 
		RULE_indexingVariable = 89, RULE_componentVariable = 90, RULE_recordVariable = 91, 
		RULE_fieldIdentifier = 92, RULE_structuredStatement = 93, RULE_conditionalStatement = 94, 
		RULE_ifStatement = 95, RULE_repetetiveStatement = 96, RULE_whileStatement = 97, 
		RULE_forStatement = 98, RULE_forList = 99, RULE_controlVariable = 100, 
		RULE_initialValue = 101, RULE_finalValue = 102, RULE_forEachStatement = 103, 
		RULE_variableList = 104, RULE_variableOrConstantList = 105, RULE_caseStatement = 106, 
		RULE_otherFGLStatement = 107, RULE_otherProgramFlowStatement = 108, RULE_exitTypes = 109, 
		RULE_exitStatements = 110, RULE_continueStatements = 111, RULE_otherStorageStatement = 112, 
		RULE_printExpressionItem = 113, RULE_printExpressionList = 114, RULE_reportStatement = 115, 
		RULE_fieldName = 116, RULE_thruNotation = 117, RULE_fieldList = 118, RULE_keyList = 119, 
		RULE_constructEvents = 120, RULE_constructInsideStatement = 121, RULE_specialAttribute = 122, 
		RULE_attribute = 123, RULE_attributeList = 124, RULE_constructGroupStatement = 125, 
		RULE_constructStatement = 126, RULE_displayArrayStatement = 127, RULE_displayInsideStatement = 128, 
		RULE_displayEvents = 129, RULE_displayStatement = 130, RULE_errorStatement = 131, 
		RULE_messageStatement = 132, RULE_promptStatement = 133, RULE_inputEvents = 134, 
		RULE_inputInsideStatement = 135, RULE_inputGroupStatement = 136, RULE_inputStatement = 137, 
		RULE_inputArrayStatement = 138, RULE_menuEvents = 139, RULE_menuInsideStatement = 140, 
		RULE_menuGroupStatement = 141, RULE_menuStatement = 142, RULE_reservedLinePosition = 143, 
		RULE_specialWindowAttribute = 144, RULE_windowAttribute = 145, RULE_windowAttributeList = 146, 
		RULE_optionStatement = 147, RULE_optionsStatement = 148, RULE_screenStatement = 149, 
		RULE_sqlStatements = 150, RULE_cursorManipulationStatement = 151, RULE_columnsList = 152, 
		RULE_statementId = 153, RULE_cursorName = 154, RULE_dataType = 155, RULE_columnItem = 156, 
		RULE_dataDefinitionStatement = 157, RULE_dataManipulationStatement = 158, 
		RULE_sqlSelectStatement = 159, RULE_columnsTableId = 160, RULE_selectList = 161, 
		RULE_headSelectStatement = 162, RULE_tableQualifier = 163, RULE_tableIdentifier = 164, 
		RULE_fromTable = 165, RULE_tableExpression = 166, RULE_fromSelectStatement = 167, 
		RULE_aliasName = 168, RULE_mainSelectStatement = 169, RULE_unionSelectStatement = 170, 
		RULE_simpleSelectStatement = 171, RULE_whereStatement = 172, RULE_groupByStatement = 173, 
		RULE_havingStatement = 174, RULE_orderbyColumn = 175, RULE_orderbyStatement = 176, 
		RULE_sqlLoadStatement = 177, RULE_sqlUnLoadStatement = 178, RULE_sqlInsertStatement = 179, 
		RULE_sqlUpdateStatement = 180, RULE_sqlDeleteStatement = 181, RULE_actualParameterList = 182, 
		RULE_dynamicManagementStatement = 183, RULE_queryOptimizationStatement = 184, 
		RULE_databaseDeclaration = 185, RULE_clientServerStatement = 186, RULE_dataIntegrityStatement = 187, 
		RULE_wheneverStatement = 188, RULE_wheneverType = 189, RULE_wheneverFlow = 190, 
		RULE_reportDefinition = 191, RULE_outputReport = 192, RULE_formatReport = 193, 
		RULE_eol = 194, RULE_unsignedNumber = 195, RULE_unsignedInteger = 196, 
		RULE_unsignedReal = 197, RULE_sign = 198, RULE_constantIdentifier = 199;
	public static final String[] ruleNames = {
		"compilation_unit", "identifier", "mainBlock", "mainStatements", "deferStatement", 
		"functionOrReportDefinitions", "returnStatement", "functionDefinition", 
		"parameterList", "parameterGroup", "globalDeclaration", "typeDeclarations", 
		"typeDeclaration", "variableDeclaration", "type", "indirectType", "typeIdentifier", 
		"largeType", "numberType", "charType", "timeType", "datetimeQualifier", 
		"intervalQualifier", "unitType", "yearQualifier", "monthQualifier", "dayQualifier", 
		"hourQualifier", "minuteQualifier", "secondQualifier", "fractionQualifier", 
		"structuredType", "recordType", "arrayIndexer", "arrayType", "dynArrayType", 
		"string", "statement", "codeBlock", "label", "unlabelledStatement", "simpleStatement", 
		"runStatement", "assignmentStatement", "procedureStatement", "procedureIdentifier", 
		"actualParameter", "gotoStatement", "condition", "logicalTerm", "logicalFactor", 
		"quantifiedFactor", "expressionSet", "subquery", "sqlExpression", "sqlAlias", 
		"sqlTerm", "sqlMultiply", "sqlFactor", "sqlFactor2", "sqlExpressionList", 
		"sqlLiteral", "sqlVariable", "sqlFunction", "dateFunction", "numberFunction", 
		"charFunction", "groupFunction", "otherFunction", "sqlPseudoColumn", "relationalOperator", 
		"ifCondition", "ifCondition2", "ifLogicalTerm", "expression", "ifLogicalFactor", 
		"simpleExpression", "addingOperator", "term", "multiplyingOperator", "factor", 
		"functionDesignator", "functionIdentifier", "unsignedConstant", "constant", 
		"numericConstant", "variable", "entireVariable", "variableIdentifier", 
		"indexingVariable", "componentVariable", "recordVariable", "fieldIdentifier", 
		"structuredStatement", "conditionalStatement", "ifStatement", "repetetiveStatement", 
		"whileStatement", "forStatement", "forList", "controlVariable", "initialValue", 
		"finalValue", "forEachStatement", "variableList", "variableOrConstantList", 
		"caseStatement", "otherFGLStatement", "otherProgramFlowStatement", "exitTypes", 
		"exitStatements", "continueStatements", "otherStorageStatement", "printExpressionItem", 
		"printExpressionList", "reportStatement", "fieldName", "thruNotation", 
		"fieldList", "keyList", "constructEvents", "constructInsideStatement", 
		"specialAttribute", "attribute", "attributeList", "constructGroupStatement", 
		"constructStatement", "displayArrayStatement", "displayInsideStatement", 
		"displayEvents", "displayStatement", "errorStatement", "messageStatement", 
		"promptStatement", "inputEvents", "inputInsideStatement", "inputGroupStatement", 
		"inputStatement", "inputArrayStatement", "menuEvents", "menuInsideStatement", 
		"menuGroupStatement", "menuStatement", "reservedLinePosition", "specialWindowAttribute", 
		"windowAttribute", "windowAttributeList", "optionStatement", "optionsStatement", 
		"screenStatement", "sqlStatements", "cursorManipulationStatement", "columnsList", 
		"statementId", "cursorName", "dataType", "columnItem", "dataDefinitionStatement", 
		"dataManipulationStatement", "sqlSelectStatement", "columnsTableId", "selectList", 
		"headSelectStatement", "tableQualifier", "tableIdentifier", "fromTable", 
		"tableExpression", "fromSelectStatement", "aliasName", "mainSelectStatement", 
		"unionSelectStatement", "simpleSelectStatement", "whereStatement", "groupByStatement", 
		"havingStatement", "orderbyColumn", "orderbyStatement", "sqlLoadStatement", 
		"sqlUnLoadStatement", "sqlInsertStatement", "sqlUpdateStatement", "sqlDeleteStatement", 
		"actualParameterList", "dynamicManagementStatement", "queryOptimizationStatement", 
		"databaseDeclaration", "clientServerStatement", "dataIntegrityStatement", 
		"wheneverStatement", "wheneverType", "wheneverFlow", "reportDefinition", 
		"outputReport", "formatReport", "eol", "unsignedNumber", "unsignedInteger", 
		"unsignedReal", "sign", "constantIdentifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'+'", "'-'", 
		"'*'", "'/'", "','", "';'", null, "'='", null, "'<'", "'<='", "'>='", 
		"'>'", "'('", "')'", "'['", "']'", "'.'", "'@'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSOLUTE", "AFTER", "ACCEPT", "AGGREGATE", "ALLOCATE", "ALL", "ALL_ROWS", 
		"AND", "ANY", "AS", "ASC", "ASCII", "ASSIGN", "AT", "ATTRIBUTE", "ATTRIBUTES", 
		"AVERAGE", "AVG", "ARRAY", "BEFORE", "BEGIN", "BETWEEN", "BIGINT", "BLACK", 
		"BLINK", "BLUE", "BOLD", "BORDER", "BOTTOM", "BUFFERED", "BY", "BYTE", 
		"CACHE", "CALL", "CASE", "CHAR", "CHARARACTER", "CHAR_LENGTH", "CHECK", 
		"CLEAR", "CLIPPED", "CLOSE", "CLUSTER", "COLUMN", "COLUMNS", "COMMAND", 
		"COMMENT", "COMMIT", "COMMITTED", "CONNECT", "CONSTANT", "CONSTRAINED", 
		"CONSTRAINT", "CONSTRUCT", "CONTINUE", "COUNT", "COPY", "CRCOLS", "CREATE", 
		"CURRENT", "CURSOR", "CYAN", "DATABASE", "DATE", "DATETIME", "DAY", "DEALLOCATE", 
		"DEC", "DECIMAL", "DECODE", "DECLARE", "DEFAULT", "DEFAULTS", "DEFER", 
		"DEFINE", "DEF", "VARIABLE", "VAR", "DELETE", "CHARACTER", "DIV", "DELIMITER", 
		"DESC", "DIM", "DIMENSIONS", "DIRTY", "DISPLAY", "DISTINCT", "DO", "DOUBLE", 
		"DOWN", "DROP", "DYNAMIC", "EACH", "ELSE", "END", "ERROR", "ESCAPE", "EVERY", 
		"EXCLUSIVE", "EXEC", "EXECUTE", "EXIT", "EXISTS", "EXPLAIN", "EXTEND", 
		"EXTENT", "EXTERNAL", "FALSE", "FETCH", "FIELD", "FIELD_TOUCHED", "FILE", 
		"FINISH", "FIRST", "FIRST_ROWS", "FLOAT", "FLUSH", "FOR", "FORM", "FORMAT", 
		"FORMONLY", "FOREACH", "FOUND", "FRACTION", "FREE", "FROM", "FUNCTION", 
		"GET_FLDBUF", "GLOBALS", "GO", "GOTO", "GREEN", "GROUP", "HAVING", "HEADER", 
		"HELP", "HIDE", "HOLD", "HOUR", "IF", "IN", "INNER", "INDEX", "INDICATOR", 
		"INFIELD", "INITIALIZE", "INPUT", "INSERT", "INSTRUCTIONS", "INTO", "INT", 
		"INT_FLAG", "INTEGER", "INTERRUPT", "INTERVAL", "INVISIBLE", "IS", "ISNULL", 
		"ISOLATION", "JOIN", "KEY", "LABEL", "LAST", "LEFT", "LENGTH", "LET", 
		"LIKE", "LINE", "LINENO", "LINES", "LOAD", "LOCATE", "LOCK", "LOG", "LONG", 
		"MAGENTA", "MATCHES", "MENU", "MESSAGE", "MAIN", "MARGIN", "MAX", "MDY", 
		"MIN", "MINUTE", "MOD", "MODE", "MODULE", "MONTH", "MONEY", "NCHAR", "NAME", 
		"NEED", "NEXT", "NEW", "NORMAL", "NO", "NOT", "NOTFOUND", "NOW", "NOLOCK", 
		"NOWAIT", "NUMERIC", "NULL", "NVARCHAR", "NVL", "OF", "OFF", "ON", "OPEN", 
		"OPTION", "OPTIONS", "OR", "ORD", "ORDER", "OUTPUT", "OUTER", "OTHERWISE", 
		"PAGE", "PAGENO", "PAUSE", "PERCENT", "PIPE", "PRECISION", "PREPARE", 
		"PREVIOUS", "PRINT", "PRINTER", "PROGRAM", "PROMPT", "PUT", "QUIT", "QUIT_FLAG", 
		"RECORD", "REAL", "READ", "RED", "RELATIVE", "REMOVE", "REOPTIMIZATION", 
		"REPEATABLE", "REPEAT", "REPORT", "RESIZE", "RETURN", "RETURNING", "REVERSE", 
		"RIGHT", "ROLLBACK", "ROW", "ROWS", "RUN", "SCREEN", "SCROLL", "SECOND", 
		"SKIP2", "SELECT", "SET", "SHARE", "SHOW", "SIZE", "SLEEP", "SMALLFLOAT", 
		"SMALLINT", "SPACE", "SPACES", "SQL", "SQLERROR", "SQLWARNING", "START", 
		"STABILITY", "STATISTICS", "STATUS", "STOP", "SUM", "TABLE", "TABLES", 
		"TERMINATE", "TEMP", "TEXT", "THEN", "THROUGH", "THRU", "TIME", "TO", 
		"TODAY", "TOP", "TRAILER", "TRUE", "TYPE", "UNCONSTRAINED", "UNDERLINE", 
		"UNION", "UNIQUE", "UNITS", "UNLOAD", "UP", "UPDATE", "USER", "USING", 
		"VALIDATE", "VALUES", "VARCHAR", "WEEKDAY", "VIEW", "WAIT", "WAITING", 
		"WARNING", "WHEN", "WHENEVER", "WHERE", "WHILE", "WHITE", "WITH", "WITHOUT", 
		"WINDOW", "WORDWRAP", "WORK", "YEAR", "YELLOW", "PLUS", "MINUS", "STAR", 
		"SLASH", "COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", 
		"GT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "ATSYMBOL", "DOUBLEVERTBAR", 
		"IDENT", "STRING_LITERAL", "NUM_INT", "NUM_REAL", "HEX_DIGIT", "SL_COMMENT", 
		"SL_COMMENT_2", "EOL", "WS", "ESC", "QUOTED_STRING", "STEP", "MEMORY", 
		"SAME", "WRAP", "PRIOR", "SECONDS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "fgl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fglParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Compilation_unitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(fglParser.EOF, 0); }
		public DatabaseDeclarationContext databaseDeclaration() {
			return getRuleContext(DatabaseDeclarationContext.class,0);
		}
		public GlobalDeclarationContext globalDeclaration() {
			return getRuleContext(GlobalDeclarationContext.class,0);
		}
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public FunctionOrReportDefinitionsContext functionOrReportDefinitions() {
			return getRuleContext(FunctionOrReportDefinitionsContext.class,0);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitCompilation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(400);
				databaseDeclaration();
				}
				break;
			}
			setState(404);
			_la = _input.LA(1);
			if (_la==GLOBALS) {
				{
				setState(403);
				globalDeclaration();
				}
			}

			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(406);
				typeDeclarations();
				}
				break;
			}
			setState(410);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DEFER - 67)) | (1L << (DEFINE - 67)) | (1L << (DEF - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MAIN - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT || _la==EOL) {
				{
				setState(409);
				mainBlock();
				}
			}

			setState(413);
			_la = _input.LA(1);
			if (_la==FUNCTION || _la==REPORT) {
				{
				setState(412);
				functionOrReportDefinitions();
				}
			}

			setState(415);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(fglParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainBlockContext extends ParserRuleContext {
		public List<TerminalNode> MAIN() { return getTokens(fglParser.MAIN); }
		public TerminalNode MAIN(int i) {
			return getToken(fglParser.MAIN, i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public MainStatementsContext mainStatements() {
			return getRuleContext(MainStatementsContext.class,0);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitMainBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitMainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainBlock);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				_la = _input.LA(1);
				if (_la==EOL) {
					{
					setState(419);
					eol();
					}
				}

				setState(422);
				match(MAIN);
				setState(423);
				eol();
				setState(425);
				_la = _input.LA(1);
				if (_la==DEFINE || _la==DEF) {
					{
					setState(424);
					typeDeclarations();
					}
				}

				setState(428);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DEFER - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT || _la==EOL) {
					{
					setState(427);
					mainStatements();
					}
				}

				setState(430);
				match(END);
				setState(431);
				match(MAIN);
				setState(432);
				eol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				eol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(435);
					eol();
					}
					break;
				}
				setState(439);
				_la = _input.LA(1);
				if (_la==DEFINE || _la==DEF) {
					{
					setState(438);
					typeDeclarations();
					}
				}

				setState(441);
				mainStatements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainStatementsContext extends ParserRuleContext {
		public List<DeferStatementContext> deferStatement() {
			return getRuleContexts(DeferStatementContext.class);
		}
		public DeferStatementContext deferStatement(int i) {
			return getRuleContext(DeferStatementContext.class,i);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public MainStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterMainStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitMainStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitMainStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainStatementsContext mainStatements() throws RecognitionException {
		MainStatementsContext _localctx = new MainStatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(447);
				switch (_input.LA(1)) {
				case DEFER:
					{
					setState(444);
					deferStatement();
					}
					break;
				case ACCEPT:
				case ALLOCATE:
				case ASCII:
				case ASSIGN:
				case BEGIN:
				case CALL:
				case CASE:
				case CLEAR:
				case CLOSE:
				case COMMIT:
				case CONNECT:
				case CONSTRUCT:
				case CONTINUE:
				case COUNT:
				case CREATE:
				case CURRENT:
				case DATABASE:
				case DEALLOCATE:
				case DECLARE:
				case DELETE:
				case DISPLAY:
				case DROP:
				case ERROR:
				case EXECUTE:
				case EXIT:
				case FALSE:
				case FETCH:
				case FINISH:
				case FIRST:
				case FLUSH:
				case FOR:
				case FOUND:
				case FREE:
				case GOTO:
				case GROUP:
				case HIDE:
				case IF:
				case INDEX:
				case INITIALIZE:
				case INPUT:
				case INSERT:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case LOAD:
				case LOCATE:
				case LOCK:
				case MENU:
				case MESSAGE:
				case MDY:
				case NEED:
				case NEXT:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case OPEN:
				case OPTIONS:
				case OUTPUT:
				case PAGENO:
				case PAUSE:
				case PREPARE:
				case PRINT:
				case PROMPT:
				case PUT:
				case REAL:
				case RESIZE:
				case RETURN:
				case ROLLBACK:
				case RUN:
				case SCROLL:
				case SKIP2:
				case SELECT:
				case SET:
				case SHOW:
				case SIZE:
				case SLEEP:
				case SQL:
				case START:
				case STATUS:
				case TERMINATE:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case UNLOAD:
				case UPDATE:
				case USER:
				case VALIDATE:
				case WEEKDAY:
				case WAIT:
				case WHENEVER:
				case WHILE:
				case WORK:
				case IDENT:
					{
					setState(445);
					codeBlock();
					}
					break;
				case EOL:
					{
					setState(446);
					eol();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(449); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DEFER - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT || _la==EOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeferStatementContext extends ParserRuleContext {
		public TerminalNode DEFER() { return getToken(fglParser.DEFER, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode INTERRUPT() { return getToken(fglParser.INTERRUPT, 0); }
		public TerminalNode QUIT() { return getToken(fglParser.QUIT, 0); }
		public DeferStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDeferStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDeferStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDeferStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeferStatementContext deferStatement() throws RecognitionException {
		DeferStatementContext _localctx = new DeferStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deferStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(DEFER);
			setState(452);
			_la = _input.LA(1);
			if ( !(_la==INTERRUPT || _la==QUIT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(453);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionOrReportDefinitionsContext extends ParserRuleContext {
		public List<ReportDefinitionContext> reportDefinition() {
			return getRuleContexts(ReportDefinitionContext.class);
		}
		public ReportDefinitionContext reportDefinition(int i) {
			return getRuleContext(ReportDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public FunctionOrReportDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionOrReportDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterFunctionOrReportDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitFunctionOrReportDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitFunctionOrReportDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionOrReportDefinitionsContext functionOrReportDefinitions() throws RecognitionException {
		FunctionOrReportDefinitionsContext _localctx = new FunctionOrReportDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionOrReportDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(457);
				switch (_input.LA(1)) {
				case REPORT:
					{
					setState(455);
					reportDefinition();
					}
					break;
				case FUNCTION:
					{
					setState(456);
					functionDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(459); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION || _la==REPORT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(fglParser.RETURN, 0); }
		public VariableOrConstantListContext variableOrConstantList() {
			return getRuleContext(VariableOrConstantListContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(RETURN);
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(462);
				variableOrConstantList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> FUNCTION() { return getTokens(fglParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(fglParser.FUNCTION, i);
		}
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(FUNCTION);
			setState(466);
			functionIdentifier();
			setState(468);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(467);
				parameterList();
				}
			}

			setState(470);
			eol();
			setState(471);
			typeDeclarations();
			setState(473);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT) {
				{
				setState(472);
				codeBlock();
				}
			}

			setState(475);
			match(END);
			setState(476);
			match(FUNCTION);
			setState(477);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public List<ParameterGroupContext> parameterGroup() {
			return getRuleContexts(ParameterGroupContext.class);
		}
		public ParameterGroupContext parameterGroup(int i) {
			return getRuleContext(ParameterGroupContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(LPAREN);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(480);
				parameterGroup();
				}
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(486);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterGroupContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterParameterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitParameterGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitParameterGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameterGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			identifier();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(489);
				match(COMMA);
				setState(490);
				identifier();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> GLOBALS() { return getTokens(fglParser.GLOBALS); }
		public TerminalNode GLOBALS(int i) {
			return getToken(fglParser.GLOBALS, i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public GlobalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterGlobalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitGlobalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitGlobalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDeclarationContext globalDeclaration() throws RecognitionException {
		GlobalDeclarationContext _localctx = new GlobalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_globalDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(GLOBALS);
			setState(503);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(497);
				string();
				}
				break;
			case EOL:
				{
				setState(498);
				eol();
				setState(499);
				typeDeclarations();
				setState(500);
				match(END);
				setState(501);
				match(GLOBALS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(505);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationsContext extends ParserRuleContext {
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public TypeDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterTypeDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitTypeDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitTypeDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationsContext typeDeclarations() throws RecognitionException {
		TypeDeclarationsContext _localctx = new TypeDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeDeclarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			typeDeclaration();
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(508);
					typeDeclaration();
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(fglParser.DEF, 0); }
		public TerminalNode VAR() { return getToken(fglParser.VAR, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode DEFINE() { return getToken(fglParser.DEFINE, 0); }
		public TerminalNode VARIABLE() { return getToken(fglParser.VARIABLE, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeDeclaration);
		try {
			setState(520);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(DEF);
				setState(515);
				match(VAR);
				setState(516);
				variableDeclaration();
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(DEFINE);
				setState(518);
				match(VARIABLE);
				setState(519);
				variableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(fglParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			constantIdentifier();
			setState(523);
			match(AS);
			setState(524);
			type();
			setState(525);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public IndirectTypeContext indirectType() {
			return getRuleContext(IndirectTypeContext.class,0);
		}
		public LargeTypeContext largeType() {
			return getRuleContext(LargeTypeContext.class,0);
		}
		public StructuredTypeContext structuredType() {
			return getRuleContext(StructuredTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(531);
			switch (_input.LA(1)) {
			case BIGINT:
			case CHAR:
			case DATE:
			case DATETIME:
			case DEC:
			case DECIMAL:
			case CHARACTER:
			case DOUBLE:
			case FLOAT:
			case INT:
			case INTEGER:
			case INTERVAL:
			case MONEY:
			case NCHAR:
			case NUMERIC:
			case NVARCHAR:
			case REAL:
			case SMALLFLOAT:
			case SMALLINT:
			case VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				typeIdentifier();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				indirectType();
				}
				break;
			case BYTE:
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				largeType();
				}
				break;
			case ARRAY:
			case DYNAMIC:
			case RECORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				structuredType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndirectTypeContext extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(fglParser.LIKE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(fglParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IndirectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indirectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterIndirectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitIndirectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitIndirectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndirectTypeContext indirectType() throws RecognitionException {
		IndirectTypeContext _localctx = new IndirectTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_indirectType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(LIKE);
			setState(534);
			tableIdentifier();
			setState(535);
			match(DOT);
			setState(536);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdentifierContext extends ParserRuleContext {
		public CharTypeContext charType() {
			return getRuleContext(CharTypeContext.class,0);
		}
		public NumberTypeContext numberType() {
			return getRuleContext(NumberTypeContext.class,0);
		}
		public TimeTypeContext timeType() {
			return getRuleContext(TimeTypeContext.class,0);
		}
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitTypeIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitTypeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeIdentifier);
		try {
			setState(541);
			switch (_input.LA(1)) {
			case CHAR:
			case CHARACTER:
			case NCHAR:
			case NVARCHAR:
			case VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				charType();
				}
				break;
			case BIGINT:
			case DEC:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case INTEGER:
			case MONEY:
			case NUMERIC:
			case REAL:
			case SMALLFLOAT:
			case SMALLINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				numberType();
				}
				break;
			case DATE:
			case DATETIME:
			case INTERVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				timeType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LargeTypeContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(fglParser.TEXT, 0); }
		public TerminalNode BYTE() { return getToken(fglParser.BYTE, 0); }
		public LargeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_largeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterLargeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitLargeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitLargeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LargeTypeContext largeType() throws RecognitionException {
		LargeTypeContext _localctx = new LargeTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_largeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_la = _input.LA(1);
			if ( !(_la==BYTE || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberTypeContext extends ParserRuleContext {
		public TerminalNode BIGINT() { return getToken(fglParser.BIGINT, 0); }
		public TerminalNode INTEGER() { return getToken(fglParser.INTEGER, 0); }
		public TerminalNode INT() { return getToken(fglParser.INT, 0); }
		public TerminalNode SMALLINT() { return getToken(fglParser.SMALLINT, 0); }
		public TerminalNode REAL() { return getToken(fglParser.REAL, 0); }
		public TerminalNode SMALLFLOAT() { return getToken(fglParser.SMALLFLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(fglParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(fglParser.DEC, 0); }
		public TerminalNode NUMERIC() { return getToken(fglParser.NUMERIC, 0); }
		public TerminalNode MONEY() { return getToken(fglParser.MONEY, 0); }
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public List<NumericConstantContext> numericConstant() {
			return getRuleContexts(NumericConstantContext.class);
		}
		public NumericConstantContext numericConstant(int i) {
			return getRuleContext(NumericConstantContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(fglParser.COMMA, 0); }
		public TerminalNode FLOAT() { return getToken(fglParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(fglParser.DOUBLE, 0); }
		public NumberTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterNumberType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitNumberType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitNumberType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberTypeContext numberType() throws RecognitionException {
		NumberTypeContext _localctx = new NumberTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numberType);
		int _la;
		try {
			setState(564);
			switch (_input.LA(1)) {
			case BIGINT:
			case INT:
			case INTEGER:
			case REAL:
			case SMALLFLOAT:
			case SMALLINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				_la = _input.LA(1);
				if ( !(_la==BIGINT || _la==INT || _la==INTEGER || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & ((1L << (REAL - 236)) | (1L << (SMALLFLOAT - 236)) | (1L << (SMALLINT - 236)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case DEC:
			case DECIMAL:
			case MONEY:
			case NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				_la = _input.LA(1);
				if ( !(_la==DEC || _la==DECIMAL || _la==MONEY || _la==NUMERIC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(555);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(547);
					match(LPAREN);
					setState(548);
					numericConstant();
					setState(551);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(549);
						match(COMMA);
						setState(550);
						numericConstant();
						}
					}

					setState(553);
					match(RPAREN);
					}
				}

				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				_la = _input.LA(1);
				if ( !(_la==DOUBLE || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(562);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(558);
					match(LPAREN);
					setState(559);
					numericConstant();
					setState(560);
					match(RPAREN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public List<NumericConstantContext> numericConstant() {
			return getRuleContexts(NumericConstantContext.class);
		}
		public NumericConstantContext numericConstant(int i) {
			return getRuleContext(NumericConstantContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public TerminalNode VARCHAR() { return getToken(fglParser.VARCHAR, 0); }
		public TerminalNode NVARCHAR() { return getToken(fglParser.NVARCHAR, 0); }
		public TerminalNode COMMA() { return getToken(fglParser.COMMA, 0); }
		public TerminalNode CHAR() { return getToken(fglParser.CHAR, 0); }
		public TerminalNode NCHAR() { return getToken(fglParser.NCHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(fglParser.CHARACTER, 0); }
		public CharTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitCharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharTypeContext charType() throws RecognitionException {
		CharTypeContext _localctx = new CharTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_charType);
		int _la;
		try {
			setState(582);
			switch (_input.LA(1)) {
			case NVARCHAR:
			case VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				_la = _input.LA(1);
				if ( !(_la==NVARCHAR || _la==VARCHAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(567);
				match(LPAREN);
				setState(568);
				numericConstant();
				setState(571);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(569);
					match(COMMA);
					setState(570);
					numericConstant();
					}
				}

				setState(573);
				match(RPAREN);
				}
				break;
			case CHAR:
			case CHARACTER:
			case NCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==CHARACTER || _la==NCHAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(580);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(576);
					match(LPAREN);
					setState(577);
					numericConstant();
					setState(578);
					match(RPAREN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeTypeContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(fglParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(fglParser.DATETIME, 0); }
		public DatetimeQualifierContext datetimeQualifier() {
			return getRuleContext(DatetimeQualifierContext.class,0);
		}
		public TerminalNode INTERVAL() { return getToken(fglParser.INTERVAL, 0); }
		public IntervalQualifierContext intervalQualifier() {
			return getRuleContext(IntervalQualifierContext.class,0);
		}
		public TimeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitTimeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitTimeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeTypeContext timeType() throws RecognitionException {
		TimeTypeContext _localctx = new TimeTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_timeType);
		try {
			setState(589);
			switch (_input.LA(1)) {
			case DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(DATETIME);
				setState(586);
				datetimeQualifier();
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(587);
				match(INTERVAL);
				setState(588);
				intervalQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatetimeQualifierContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(fglParser.YEAR, 0); }
		public TerminalNode TO() { return getToken(fglParser.TO, 0); }
		public YearQualifierContext yearQualifier() {
			return getRuleContext(YearQualifierContext.class,0);
		}
		public TerminalNode MONTH() { return getToken(fglParser.MONTH, 0); }
		public MonthQualifierContext monthQualifier() {
			return getRuleContext(MonthQualifierContext.class,0);
		}
		public TerminalNode DAY() { return getToken(fglParser.DAY, 0); }
		public DayQualifierContext dayQualifier() {
			return getRuleContext(DayQualifierContext.class,0);
		}
		public TerminalNode HOUR() { return getToken(fglParser.HOUR, 0); }
		public HourQualifierContext hourQualifier() {
			return getRuleContext(HourQualifierContext.class,0);
		}
		public TerminalNode MINUTE() { return getToken(fglParser.MINUTE, 0); }
		public MinuteQualifierContext minuteQualifier() {
			return getRuleContext(MinuteQualifierContext.class,0);
		}
		public TerminalNode SECOND() { return getToken(fglParser.SECOND, 0); }
		public SecondQualifierContext secondQualifier() {
			return getRuleContext(SecondQualifierContext.class,0);
		}
		public TerminalNode FRACTION() { return getToken(fglParser.FRACTION, 0); }
		public FractionQualifierContext fractionQualifier() {
			return getRuleContext(FractionQualifierContext.class,0);
		}
		public DatetimeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDatetimeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDatetimeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDatetimeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatetimeQualifierContext datetimeQualifier() throws RecognitionException {
		DatetimeQualifierContext _localctx = new DatetimeQualifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_datetimeQualifier);
		try {
			setState(612);
			switch (_input.LA(1)) {
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(YEAR);
				setState(592);
				match(TO);
				setState(593);
				yearQualifier();
				}
				break;
			case MONTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(MONTH);
				setState(595);
				match(TO);
				setState(596);
				monthQualifier();
				}
				break;
			case DAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
				match(DAY);
				setState(598);
				match(TO);
				setState(599);
				dayQualifier();
				}
				break;
			case HOUR:
				enterOuterAlt(_localctx, 4);
				{
				setState(600);
				match(HOUR);
				setState(601);
				match(TO);
				setState(602);
				hourQualifier();
				}
				break;
			case MINUTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(603);
				match(MINUTE);
				setState(604);
				match(TO);
				setState(605);
				minuteQualifier();
				}
				break;
			case SECOND:
				enterOuterAlt(_localctx, 6);
				{
				setState(606);
				match(SECOND);
				setState(607);
				match(TO);
				setState(608);
				secondQualifier();
				}
				break;
			case FRACTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(609);
				match(FRACTION);
				setState(610);
				match(TO);
				setState(611);
				fractionQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalQualifierContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(fglParser.YEAR, 0); }
		public TerminalNode TO() { return getToken(fglParser.TO, 0); }
		public YearQualifierContext yearQualifier() {
			return getRuleContext(YearQualifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public TerminalNode MONTH() { return getToken(fglParser.MONTH, 0); }
		public MonthQualifierContext monthQualifier() {
			return getRuleContext(MonthQualifierContext.class,0);
		}
		public TerminalNode DAY() { return getToken(fglParser.DAY, 0); }
		public DayQualifierContext dayQualifier() {
			return getRuleContext(DayQualifierContext.class,0);
		}
		public TerminalNode HOUR() { return getToken(fglParser.HOUR, 0); }
		public HourQualifierContext hourQualifier() {
			return getRuleContext(HourQualifierContext.class,0);
		}
		public TerminalNode MINUTE() { return getToken(fglParser.MINUTE, 0); }
		public MinuteQualifierContext minuteQualifier() {
			return getRuleContext(MinuteQualifierContext.class,0);
		}
		public TerminalNode SECOND() { return getToken(fglParser.SECOND, 0); }
		public SecondQualifierContext secondQualifier() {
			return getRuleContext(SecondQualifierContext.class,0);
		}
		public TerminalNode FRACTION() { return getToken(fglParser.FRACTION, 0); }
		public FractionQualifierContext fractionQualifier() {
			return getRuleContext(FractionQualifierContext.class,0);
		}
		public IntervalQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterIntervalQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitIntervalQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitIntervalQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalQualifierContext intervalQualifier() throws RecognitionException {
		IntervalQualifierContext _localctx = new IntervalQualifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_intervalQualifier);
		int _la;
		try {
			setState(671);
			switch (_input.LA(1)) {
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				match(YEAR);
				setState(619);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(615);
					match(LPAREN);
					setState(616);
					numericConstant();
					setState(617);
					match(RPAREN);
					}
				}

				setState(621);
				match(TO);
				setState(622);
				yearQualifier();
				}
				break;
			case MONTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(MONTH);
				setState(628);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(624);
					match(LPAREN);
					setState(625);
					numericConstant();
					setState(626);
					match(RPAREN);
					}
				}

				setState(630);
				match(TO);
				setState(631);
				monthQualifier();
				}
				break;
			case DAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				match(DAY);
				setState(637);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(633);
					match(LPAREN);
					setState(634);
					numericConstant();
					setState(635);
					match(RPAREN);
					}
				}

				setState(639);
				match(TO);
				setState(640);
				dayQualifier();
				}
				break;
			case HOUR:
				enterOuterAlt(_localctx, 4);
				{
				setState(641);
				match(HOUR);
				setState(646);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(642);
					match(LPAREN);
					setState(643);
					numericConstant();
					setState(644);
					match(RPAREN);
					}
				}

				setState(648);
				match(TO);
				setState(649);
				hourQualifier();
				}
				break;
			case MINUTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(650);
				match(MINUTE);
				setState(655);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(651);
					match(LPAREN);
					setState(652);
					numericConstant();
					setState(653);
					match(RPAREN);
					}
				}

				setState(657);
				match(TO);
				setState(658);
				minuteQualifier();
				}
				break;
			case SECOND:
				enterOuterAlt(_localctx, 6);
				{
				setState(659);
				match(SECOND);
				setState(664);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(660);
					match(LPAREN);
					setState(661);
					numericConstant();
					setState(662);
					match(RPAREN);
					}
				}

				setState(666);
				match(TO);
				setState(667);
				secondQualifier();
				}
				break;
			case FRACTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(668);
				match(FRACTION);
				setState(669);
				match(TO);
				setState(670);
				fractionQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitTypeContext extends ParserRuleContext {
		public YearQualifierContext yearQualifier() {
			return getRuleContext(YearQualifierContext.class,0);
		}
		public UnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterUnitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitUnitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitUnitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitTypeContext unitType() throws RecognitionException {
		UnitTypeContext _localctx = new UnitTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			yearQualifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YearQualifierContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(fglParser.YEAR, 0); }
		public MonthQualifierContext monthQualifier() {
			return getRuleContext(MonthQualifierContext.class,0);
		}
		public YearQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yearQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterYearQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitYearQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitYearQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearQualifierContext yearQualifier() throws RecognitionException {
		YearQualifierContext _localctx = new YearQualifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_yearQualifier);
		try {
			setState(677);
			switch (_input.LA(1)) {
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				match(YEAR);
				}
				break;
			case DAY:
			case FRACTION:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				monthQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonthQualifierContext extends ParserRuleContext {
		public TerminalNode MONTH() { return getToken(fglParser.MONTH, 0); }
		public DayQualifierContext dayQualifier() {
			return getRuleContext(DayQualifierContext.class,0);
		}
		public MonthQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monthQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterMonthQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitMonthQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitMonthQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthQualifierContext monthQualifier() throws RecognitionException {
		MonthQualifierContext _localctx = new MonthQualifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_monthQualifier);
		try {
			setState(681);
			switch (_input.LA(1)) {
			case MONTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				match(MONTH);
				}
				break;
			case DAY:
			case FRACTION:
			case HOUR:
			case MINUTE:
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				dayQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DayQualifierContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(fglParser.DAY, 0); }
		public HourQualifierContext hourQualifier() {
			return getRuleContext(HourQualifierContext.class,0);
		}
		public DayQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dayQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDayQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDayQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDayQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayQualifierContext dayQualifier() throws RecognitionException {
		DayQualifierContext _localctx = new DayQualifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dayQualifier);
		try {
			setState(685);
			switch (_input.LA(1)) {
			case DAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				match(DAY);
				}
				break;
			case FRACTION:
			case HOUR:
			case MINUTE:
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				hourQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HourQualifierContext extends ParserRuleContext {
		public TerminalNode HOUR() { return getToken(fglParser.HOUR, 0); }
		public MinuteQualifierContext minuteQualifier() {
			return getRuleContext(MinuteQualifierContext.class,0);
		}
		public HourQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hourQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterHourQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitHourQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitHourQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HourQualifierContext hourQualifier() throws RecognitionException {
		HourQualifierContext _localctx = new HourQualifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_hourQualifier);
		try {
			setState(689);
			switch (_input.LA(1)) {
			case HOUR:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				match(HOUR);
				}
				break;
			case FRACTION:
			case MINUTE:
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				minuteQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinuteQualifierContext extends ParserRuleContext {
		public TerminalNode MINUTE() { return getToken(fglParser.MINUTE, 0); }
		public SecondQualifierContext secondQualifier() {
			return getRuleContext(SecondQualifierContext.class,0);
		}
		public MinuteQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minuteQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterMinuteQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitMinuteQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitMinuteQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinuteQualifierContext minuteQualifier() throws RecognitionException {
		MinuteQualifierContext _localctx = new MinuteQualifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_minuteQualifier);
		try {
			setState(693);
			switch (_input.LA(1)) {
			case MINUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				match(MINUTE);
				}
				break;
			case FRACTION:
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				secondQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecondQualifierContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(fglParser.SECOND, 0); }
		public FractionQualifierContext fractionQualifier() {
			return getRuleContext(FractionQualifierContext.class,0);
		}
		public SecondQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSecondQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSecondQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSecondQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondQualifierContext secondQualifier() throws RecognitionException {
		SecondQualifierContext _localctx = new SecondQualifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_secondQualifier);
		try {
			setState(697);
			switch (_input.LA(1)) {
			case SECOND:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				match(SECOND);
				}
				break;
			case FRACTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				fractionQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FractionQualifierContext extends ParserRuleContext {
		public TerminalNode FRACTION() { return getToken(fglParser.FRACTION, 0); }
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public FractionQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fractionQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterFractionQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitFractionQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitFractionQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FractionQualifierContext fractionQualifier() throws RecognitionException {
		FractionQualifierContext _localctx = new FractionQualifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fractionQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(FRACTION);
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(700);
				match(LPAREN);
				setState(701);
				numericConstant();
				setState(702);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuredTypeContext extends ParserRuleContext {
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public DynArrayTypeContext dynArrayType() {
			return getRuleContext(DynArrayTypeContext.class,0);
		}
		public StructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitStructuredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitStructuredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredTypeContext structuredType() throws RecognitionException {
		StructuredTypeContext _localctx = new StructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_structuredType);
		try {
			setState(709);
			switch (_input.LA(1)) {
			case RECORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				recordType();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				arrayType();
				}
				break;
			case DYNAMIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(708);
				dynArrayType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordTypeContext extends ParserRuleContext {
		public List<TerminalNode> RECORD() { return getTokens(fglParser.RECORD); }
		public TerminalNode RECORD(int i) {
			return getToken(fglParser.RECORD, i);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(fglParser.LIKE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(fglParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(fglParser.STAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterRecordType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitRecordType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitRecordType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(RECORD);
			setState(729);
			switch (_input.LA(1)) {
			case EOL:
				{
				setState(712);
				eol();
				{
				setState(713);
				variableDeclaration();
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(714);
					match(COMMA);
					setState(715);
					variableDeclaration();
					}
					}
					setState(720);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(721);
				match(END);
				setState(722);
				match(RECORD);
				}
				break;
			case LIKE:
				{
				{
				setState(724);
				match(LIKE);
				setState(725);
				tableIdentifier();
				setState(726);
				match(DOT);
				setState(727);
				match(STAR);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayIndexerContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(fglParser.LBRACK, 0); }
		public List<NumericConstantContext> numericConstant() {
			return getRuleContexts(NumericConstantContext.class);
		}
		public NumericConstantContext numericConstant(int i) {
			return getRuleContext(NumericConstantContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(fglParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public ArrayIndexerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndexer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterArrayIndexer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitArrayIndexer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitArrayIndexer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexerContext arrayIndexer() throws RecognitionException {
		ArrayIndexerContext _localctx = new ArrayIndexerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayIndexer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(LBRACK);
			setState(732);
			numericConstant();
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(733);
				match(COMMA);
				setState(734);
				numericConstant();
				}
				break;
			case 2:
				{
				setState(735);
				match(COMMA);
				setState(736);
				numericConstant();
				setState(737);
				match(COMMA);
				setState(738);
				numericConstant();
				}
				break;
			}
			setState(742);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(fglParser.ARRAY, 0); }
		public ArrayIndexerContext arrayIndexer() {
			return getRuleContext(ArrayIndexerContext.class,0);
		}
		public TerminalNode OF() { return getToken(fglParser.OF, 0); }
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public LargeTypeContext largeType() {
			return getRuleContext(LargeTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(ARRAY);
			setState(745);
			arrayIndexer();
			setState(746);
			match(OF);
			setState(750);
			switch (_input.LA(1)) {
			case RECORD:
				{
				setState(747);
				recordType();
				}
				break;
			case BIGINT:
			case CHAR:
			case DATE:
			case DATETIME:
			case DEC:
			case DECIMAL:
			case CHARACTER:
			case DOUBLE:
			case FLOAT:
			case INT:
			case INTEGER:
			case INTERVAL:
			case MONEY:
			case NCHAR:
			case NUMERIC:
			case NVARCHAR:
			case REAL:
			case SMALLFLOAT:
			case SMALLINT:
			case VARCHAR:
				{
				setState(748);
				typeIdentifier();
				}
				break;
			case BYTE:
			case TEXT:
				{
				setState(749);
				largeType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynArrayTypeContext extends ParserRuleContext {
		public TerminalNode DYNAMIC() { return getToken(fglParser.DYNAMIC, 0); }
		public TerminalNode ARRAY() { return getToken(fglParser.ARRAY, 0); }
		public TerminalNode WITH() { return getToken(fglParser.WITH, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode DIMENSIONS() { return getToken(fglParser.DIMENSIONS, 0); }
		public TerminalNode OF() { return getToken(fglParser.OF, 0); }
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public DynArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDynArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDynArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDynArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynArrayTypeContext dynArrayType() throws RecognitionException {
		DynArrayTypeContext _localctx = new DynArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dynArrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(DYNAMIC);
			setState(753);
			match(ARRAY);
			setState(754);
			match(WITH);
			setState(755);
			numericConstant();
			setState(756);
			match(DIMENSIONS);
			setState(757);
			match(OF);
			setState(760);
			switch (_input.LA(1)) {
			case RECORD:
				{
				setState(758);
				recordType();
				}
				break;
			case BIGINT:
			case CHAR:
			case DATE:
			case DATETIME:
			case DEC:
			case DECIMAL:
			case CHARACTER:
			case DOUBLE:
			case FLOAT:
			case INT:
			case INTEGER:
			case INTERVAL:
			case MONEY:
			case NCHAR:
			case NUMERIC:
			case NVARCHAR:
			case REAL:
			case SMALLFLOAT:
			case SMALLINT:
			case VARCHAR:
				{
				setState(759);
				typeIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(fglParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public UnlabelledStatementContext unlabelledStatement() {
			return getRuleContext(UnlabelledStatementContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(fglParser.COLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(764);
				label();
				setState(765);
				match(COLON);
				}
				break;
			}
			setState(769);
			unlabelledStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DatabaseDeclarationContext> databaseDeclaration() {
			return getRuleContexts(DatabaseDeclarationContext.class);
		}
		public DatabaseDeclarationContext databaseDeclaration(int i) {
			return getRuleContext(DatabaseDeclarationContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_codeBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(773); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(773);
					switch (_input.LA(1)) {
					case ACCEPT:
					case ALLOCATE:
					case ASCII:
					case ASSIGN:
					case BEGIN:
					case CALL:
					case CASE:
					case CLEAR:
					case CLOSE:
					case COMMIT:
					case CONNECT:
					case CONSTRUCT:
					case CONTINUE:
					case COUNT:
					case CREATE:
					case CURRENT:
					case DEALLOCATE:
					case DECLARE:
					case DELETE:
					case DISPLAY:
					case DROP:
					case ERROR:
					case EXECUTE:
					case EXIT:
					case FALSE:
					case FETCH:
					case FINISH:
					case FIRST:
					case FLUSH:
					case FOR:
					case FOUND:
					case FREE:
					case GOTO:
					case GROUP:
					case HIDE:
					case IF:
					case INDEX:
					case INITIALIZE:
					case INPUT:
					case INSERT:
					case INT_FLAG:
					case INTERRUPT:
					case LAST:
					case LENGTH:
					case LINENO:
					case LOAD:
					case LOCATE:
					case LOCK:
					case MENU:
					case MESSAGE:
					case MDY:
					case NEED:
					case NEXT:
					case NO:
					case NOT:
					case NOTFOUND:
					case NULL:
					case OPEN:
					case OPTIONS:
					case OUTPUT:
					case PAGENO:
					case PAUSE:
					case PREPARE:
					case PRINT:
					case PROMPT:
					case PUT:
					case REAL:
					case RESIZE:
					case RETURN:
					case ROLLBACK:
					case RUN:
					case SCROLL:
					case SKIP2:
					case SELECT:
					case SET:
					case SHOW:
					case SIZE:
					case SLEEP:
					case SQL:
					case START:
					case STATUS:
					case TERMINATE:
					case TEMP:
					case TIME:
					case TODAY:
					case TRUE:
					case UNLOAD:
					case UPDATE:
					case USER:
					case VALIDATE:
					case WEEKDAY:
					case WAIT:
					case WHENEVER:
					case WHILE:
					case WORK:
					case IDENT:
						{
						setState(771);
						statement();
						}
						break;
					case DATABASE:
						{
						setState(772);
						databaseDeclaration();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(775); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnlabelledStatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public UnlabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlabelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterUnlabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitUnlabelledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitUnlabelledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unlabelledStatement);
		try {
			setState(781);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ALLOCATE:
			case ASCII:
			case ASSIGN:
			case BEGIN:
			case CALL:
			case CLEAR:
			case CLOSE:
			case COMMIT:
			case CONNECT:
			case CONSTRUCT:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CURRENT:
			case DEALLOCATE:
			case DECLARE:
			case DELETE:
			case DISPLAY:
			case DROP:
			case ERROR:
			case EXECUTE:
			case EXIT:
			case FALSE:
			case FETCH:
			case FINISH:
			case FIRST:
			case FLUSH:
			case FOUND:
			case FREE:
			case GOTO:
			case GROUP:
			case HIDE:
			case INDEX:
			case INITIALIZE:
			case INPUT:
			case INSERT:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case LOAD:
			case LOCATE:
			case LOCK:
			case MENU:
			case MESSAGE:
			case MDY:
			case NEED:
			case NEXT:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case OPEN:
			case OPTIONS:
			case OUTPUT:
			case PAGENO:
			case PAUSE:
			case PREPARE:
			case PRINT:
			case PROMPT:
			case PUT:
			case REAL:
			case RESIZE:
			case RETURN:
			case ROLLBACK:
			case RUN:
			case SCROLL:
			case SKIP2:
			case SELECT:
			case SET:
			case SHOW:
			case SIZE:
			case SLEEP:
			case SQL:
			case START:
			case STATUS:
			case TERMINATE:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case UNLOAD:
			case UPDATE:
			case USER:
			case VALIDATE:
			case WEEKDAY:
			case WAIT:
			case WHENEVER:
			case WORK:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				simpleStatement();
				}
				break;
			case CASE:
			case FOR:
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				structuredStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public SqlStatementsContext sqlStatements() {
			return getRuleContext(SqlStatementsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(fglParser.SEMI, 0); }
		public OtherFGLStatementContext otherFGLStatement() {
			return getRuleContext(OtherFGLStatementContext.class,0);
		}
		public MenuInsideStatementContext menuInsideStatement() {
			return getRuleContext(MenuInsideStatementContext.class,0);
		}
		public ConstructInsideStatementContext constructInsideStatement() {
			return getRuleContext(ConstructInsideStatementContext.class,0);
		}
		public DisplayInsideStatementContext displayInsideStatement() {
			return getRuleContext(DisplayInsideStatementContext.class,0);
		}
		public InputInsideStatementContext inputInsideStatement() {
			return getRuleContext(InputInsideStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_simpleStatement);
		int _la;
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				sqlStatements();
				setState(787);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(786);
					match(SEMI);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(789);
				otherFGLStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(790);
				menuInsideStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(791);
				constructInsideStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(792);
				displayInsideStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(793);
				inputInsideStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RunStatementContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(fglParser.RUN, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode IN() { return getToken(fglParser.IN, 0); }
		public TerminalNode FORM() { return getToken(fglParser.FORM, 0); }
		public TerminalNode MODE() { return getToken(fglParser.MODE, 0); }
		public TerminalNode LINE() { return getToken(fglParser.LINE, 0); }
		public TerminalNode WITHOUT() { return getToken(fglParser.WITHOUT, 0); }
		public TerminalNode WAITING() { return getToken(fglParser.WAITING, 0); }
		public TerminalNode RETURNING() { return getToken(fglParser.RETURNING, 0); }
		public RunStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterRunStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitRunStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitRunStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunStatementContext runStatement() throws RecognitionException {
		RunStatementContext _localctx = new RunStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_runStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(RUN);
			setState(799);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
				{
				setState(797);
				variable();
				}
				break;
			case STRING_LITERAL:
				{
				setState(798);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(801);
				match(IN);
				setState(802);
				match(FORM);
				setState(803);
				match(MODE);
				}
				break;
			case 2:
				{
				setState(804);
				match(IN);
				setState(805);
				match(LINE);
				setState(806);
				match(MODE);
				}
				break;
			}
			setState(813);
			switch (_input.LA(1)) {
			case WITHOUT:
				{
				setState(809);
				match(WITHOUT);
				setState(810);
				match(WAITING);
				}
				break;
			case RETURNING:
				{
				setState(811);
				match(RETURNING);
				setState(812);
				variable();
				}
				break;
			case EOF:
			case AFTER:
			case ACCEPT:
			case ALLOCATE:
			case ASCII:
			case ASSIGN:
			case BEFORE:
			case BEGIN:
			case CALL:
			case CASE:
			case CLEAR:
			case CLOSE:
			case COMMAND:
			case COMMIT:
			case CONNECT:
			case CONSTRUCT:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CURRENT:
			case DATABASE:
			case DEALLOCATE:
			case DECLARE:
			case DEFER:
			case DELETE:
			case DISPLAY:
			case DROP:
			case ELSE:
			case END:
			case ERROR:
			case EXECUTE:
			case EXIT:
			case FALSE:
			case FETCH:
			case FINISH:
			case FIRST:
			case FLUSH:
			case FOR:
			case FOUND:
			case FREE:
			case FUNCTION:
			case GOTO:
			case GROUP:
			case HIDE:
			case IF:
			case INDEX:
			case INITIALIZE:
			case INPUT:
			case INSERT:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case LOAD:
			case LOCATE:
			case LOCK:
			case MENU:
			case MESSAGE:
			case MDY:
			case NEED:
			case NEXT:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case ON:
			case OPEN:
			case OPTIONS:
			case OUTPUT:
			case OTHERWISE:
			case PAGE:
			case PAGENO:
			case PAUSE:
			case PREPARE:
			case PRINT:
			case PROMPT:
			case PUT:
			case REAL:
			case REPORT:
			case RESIZE:
			case RETURN:
			case ROLLBACK:
			case RUN:
			case SCROLL:
			case SKIP2:
			case SELECT:
			case SET:
			case SHOW:
			case SIZE:
			case SLEEP:
			case SQL:
			case START:
			case STATUS:
			case TERMINATE:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case UNLOAD:
			case UPDATE:
			case USER:
			case VALIDATE:
			case WEEKDAY:
			case WAIT:
			case WHEN:
			case WHENEVER:
			case WHILE:
			case WORK:
			case IDENT:
			case EOL:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(fglParser.EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(fglParser.ASSIGN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(815);
				match(ASSIGN);
				}
			}

			setState(818);
			variable();
			setState(819);
			match(EQUAL);
			setState(820);
			expression();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(821);
				match(COMMA);
				setState(822);
				expression();
				}
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureStatementContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(fglParser.CALL, 0); }
		public ProcedureIdentifierContext procedureIdentifier() {
			return getRuleContext(ProcedureIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public TerminalNode RETURNING() { return getToken(fglParser.RETURNING, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitProcedureStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitProcedureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(CALL);
			setState(829);
			procedureIdentifier();
			setState(842);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(830);
				match(LPAREN);
				setState(839);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (ACCEPT - 3)) | (1L << (ASCII - 3)) | (1L << (AVG - 3)) | (1L << (COLUMN - 3)) | (1L << (COUNT - 3)) | (1L << (CURRENT - 3)) | (1L << (DATE - 3)) | (1L << (DAY - 3)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EXTEND - 106)) | (1L << (FALSE - 106)) | (1L << (FIRST - 106)) | (1L << (FOUND - 106)) | (1L << (GROUP - 106)) | (1L << (HIDE - 106)) | (1L << (INDEX - 106)) | (1L << (INFIELD - 106)) | (1L << (INT_FLAG - 106)) | (1L << (INTERRUPT - 106)) | (1L << (LAST - 106)) | (1L << (LENGTH - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (LINENO - 170)) | (1L << (MAX - 170)) | (1L << (MDY - 170)) | (1L << (MIN - 170)) | (1L << (MONTH - 170)) | (1L << (NO - 170)) | (1L << (NOT - 170)) | (1L << (NOTFOUND - 170)) | (1L << (NULL - 170)) | (1L << (PAGENO - 170)) | (1L << (PREPARE - 170)))) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & ((1L << (REAL - 236)) | (1L << (SIZE - 236)) | (1L << (SQL - 236)) | (1L << (STATUS - 236)) | (1L << (SUM - 236)) | (1L << (TEMP - 236)) | (1L << (TIME - 236)) | (1L << (TODAY - 236)) | (1L << (TRUE - 236)))) != 0) || ((((_la - 300)) & ~0x3f) == 0 && ((1L << (_la - 300)) & ((1L << (USER - 300)) | (1L << (WEEKDAY - 300)) | (1L << (WAIT - 300)) | (1L << (WORK - 300)) | (1L << (YEAR - 300)) | (1L << (PLUS - 300)) | (1L << (MINUS - 300)) | (1L << (STAR - 300)) | (1L << (LPAREN - 300)) | (1L << (IDENT - 300)) | (1L << (STRING_LITERAL - 300)) | (1L << (NUM_INT - 300)) | (1L << (NUM_REAL - 300)))) != 0)) {
					{
					setState(831);
					actualParameter();
					setState(836);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(832);
						match(COMMA);
						setState(833);
						actualParameter();
						}
						}
						setState(838);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(841);
				match(RPAREN);
				}
			}

			setState(853);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(844);
				match(RETURNING);
				setState(845);
				variable();
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(846);
					match(COMMA);
					setState(847);
					variable();
					}
					}
					setState(852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public ProcedureIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterProcedureIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitProcedureIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitProcedureIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureIdentifierContext procedureIdentifier() throws RecognitionException {
		ProcedureIdentifierContext _localctx = new ProcedureIdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_procedureIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			functionIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualParameterContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(fglParser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitActualParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitActualParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_actualParameter);
		try {
			setState(859);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				match(STAR);
				}
				break;
			case ACCEPT:
			case ASCII:
			case AVG:
			case COLUMN:
			case COUNT:
			case CURRENT:
			case DATE:
			case DAY:
			case EXTEND:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INFIELD:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MAX:
			case MDY:
			case MIN:
			case MONTH:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case PREPARE:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case SUM:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case YEAR:
			case PLUS:
			case MINUS:
			case LPAREN:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(fglParser.GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode COLON() { return getToken(fglParser.COLON, 0); }
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_gotoStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(GOTO);
			setState(863);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(862);
				match(COLON);
				}
			}

			setState(865);
			label();
			setState(866);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(fglParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(fglParser.FALSE, 0); }
		public List<LogicalTermContext> logicalTerm() {
			return getRuleContexts(LogicalTermContext.class);
		}
		public LogicalTermContext logicalTerm(int i) {
			return getRuleContext(LogicalTermContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(fglParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(fglParser.OR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_condition);
		int _la;
		try {
			int _alt;
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				logicalTerm();
				setState(874);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(870);
						match(OR);
						setState(871);
						logicalTerm();
						}
						} 
					}
					setState(876);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalTermContext extends ParserRuleContext {
		public List<LogicalFactorContext> logicalFactor() {
			return getRuleContexts(LogicalFactorContext.class);
		}
		public LogicalFactorContext logicalFactor(int i) {
			return getRuleContext(LogicalFactorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(fglParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(fglParser.AND, i);
		}
		public LogicalTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterLogicalTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitLogicalTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitLogicalTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalTermContext logicalTerm() throws RecognitionException {
		LogicalTermContext _localctx = new LogicalTermContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_logicalTerm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			logicalFactor();
			setState(884);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(880);
					match(AND);
					setState(881);
					logicalFactor();
					}
					} 
				}
				setState(886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalFactorContext extends ParserRuleContext {
		public List<SqlExpressionContext> sqlExpression() {
			return getRuleContexts(SqlExpressionContext.class);
		}
		public SqlExpressionContext sqlExpression(int i) {
			return getRuleContext(SqlExpressionContext.class,i);
		}
		public List<TerminalNode> LIKE() { return getTokens(fglParser.LIKE); }
		public TerminalNode LIKE(int i) {
			return getToken(fglParser.LIKE, i);
		}
		public List<TerminalNode> NOT() { return getTokens(fglParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(fglParser.NOT, i);
		}
		public TerminalNode ESC() { return getToken(fglParser.ESC, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(fglParser.QUOTED_STRING, 0); }
		public List<TerminalNode> BETWEEN() { return getTokens(fglParser.BETWEEN); }
		public TerminalNode BETWEEN(int i) {
			return getToken(fglParser.BETWEEN, i);
		}
		public TerminalNode AND() { return getToken(fglParser.AND, 0); }
		public List<TerminalNode> IS() { return getTokens(fglParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(fglParser.IS, i);
		}
		public List<TerminalNode> NULL() { return getTokens(fglParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(fglParser.NULL, i);
		}
		public List<QuantifiedFactorContext> quantifiedFactor() {
			return getRuleContexts(QuantifiedFactorContext.class);
		}
		public QuantifiedFactorContext quantifiedFactor(int i) {
			return getRuleContext(QuantifiedFactorContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public LogicalFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterLogicalFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitLogicalFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitLogicalFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalFactorContext logicalFactor() throws RecognitionException {
		LogicalFactorContext _localctx = new LogicalFactorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_logicalFactor);
		int _la;
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(888);
				sqlExpression();
				setState(890);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(889);
					match(NOT);
					}
				}

				setState(892);
				match(LIKE);
				}
				setState(894);
				sqlExpression();
				setState(896);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(895);
					match(NOT);
					}
				}

				setState(898);
				match(LIKE);
				setState(899);
				sqlExpression();
				setState(902);
				_la = _input.LA(1);
				if (_la==ESC) {
					{
					setState(900);
					match(ESC);
					setState(901);
					match(QUOTED_STRING);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(904);
				sqlExpression();
				setState(906);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(905);
					match(NOT);
					}
				}

				setState(908);
				match(BETWEEN);
				}
				setState(910);
				sqlExpression();
				setState(912);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(911);
					match(NOT);
					}
				}

				setState(914);
				match(BETWEEN);
				setState(915);
				sqlExpression();
				setState(916);
				match(AND);
				setState(917);
				sqlExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(919);
				sqlExpression();
				setState(920);
				match(IS);
				setState(922);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(921);
					match(NOT);
					}
				}

				setState(924);
				match(NULL);
				}
				setState(926);
				sqlExpression();
				setState(927);
				match(IS);
				setState(929);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(928);
					match(NOT);
					}
				}

				setState(931);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(933);
				quantifiedFactor();
				setState(934);
				quantifiedFactor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(936);
				match(NOT);
				setState(937);
				condition();
				}
				setState(939);
				match(NOT);
				setState(940);
				condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(942);
				match(LPAREN);
				setState(943);
				condition();
				setState(944);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(946);
				sqlExpression();
				setState(947);
				relationalOperator();
				setState(948);
				sqlExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifiedFactorContext extends ParserRuleContext {
		public List<SqlExpressionContext> sqlExpression() {
			return getRuleContexts(SqlExpressionContext.class);
		}
		public SqlExpressionContext sqlExpression(int i) {
			return getRuleContext(SqlExpressionContext.class,i);
		}
		public List<RelationalOperatorContext> relationalOperator() {
			return getRuleContexts(RelationalOperatorContext.class);
		}
		public RelationalOperatorContext relationalOperator(int i) {
			return getRuleContext(RelationalOperatorContext.class,i);
		}
		public List<SubqueryContext> subquery() {
			return getRuleContexts(SubqueryContext.class);
		}
		public SubqueryContext subquery(int i) {
			return getRuleContext(SubqueryContext.class,i);
		}
		public List<TerminalNode> ALL() { return getTokens(fglParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(fglParser.ALL, i);
		}
		public List<TerminalNode> ANY() { return getTokens(fglParser.ANY); }
		public TerminalNode ANY(int i) {
			return getToken(fglParser.ANY, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(fglParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(fglParser.EXISTS, i);
		}
		public List<TerminalNode> NOT() { return getTokens(fglParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(fglParser.NOT, i);
		}
		public QuantifiedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterQuantifiedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitQuantifiedFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitQuantifiedFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifiedFactorContext quantifiedFactor() throws RecognitionException {
		QuantifiedFactorContext _localctx = new QuantifiedFactorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_quantifiedFactor);
		int _la;
		try {
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(952);
				sqlExpression();
				setState(953);
				relationalOperator();
				setState(955);
				_la = _input.LA(1);
				if (_la==ALL || _la==ANY) {
					{
					setState(954);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==ANY) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(957);
				subquery();
				}
				setState(959);
				sqlExpression();
				setState(960);
				relationalOperator();
				setState(962);
				_la = _input.LA(1);
				if (_la==ALL || _la==ANY) {
					{
					setState(961);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==ANY) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(964);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(967);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(966);
					match(NOT);
					}
				}

				setState(969);
				match(EXISTS);
				setState(970);
				subquery();
				}
				setState(973);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(972);
					match(NOT);
					}
				}

				setState(975);
				match(EXISTS);
				setState(976);
				subquery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(978);
				subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSetContext extends ParserRuleContext {
		public List<SqlExpressionContext> sqlExpression() {
			return getRuleContexts(SqlExpressionContext.class);
		}
		public SqlExpressionContext sqlExpression(int i) {
			return getRuleContext(SqlExpressionContext.class,i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ExpressionSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterExpressionSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitExpressionSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitExpressionSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSetContext expressionSet() throws RecognitionException {
		ExpressionSetContext _localctx = new ExpressionSetContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expressionSet);
		try {
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				sqlExpression();
				setState(982);
				sqlExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public SqlSelectStatementContext sqlSelectStatement() {
			return getRuleContext(SqlSelectStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(LPAREN);
			setState(988);
			sqlSelectStatement();
			setState(989);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlExpressionContext extends ParserRuleContext {
		public List<SqlTermContext> sqlTerm() {
			return getRuleContexts(SqlTermContext.class);
		}
		public SqlTermContext sqlTerm(int i) {
			return getRuleContext(SqlTermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(fglParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(fglParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(fglParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(fglParser.MINUS, i);
		}
		public SqlExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExpressionContext sqlExpression() throws RecognitionException {
		SqlExpressionContext _localctx = new SqlExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_sqlExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			sqlTerm();
			setState(996);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(992);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(993);
					sqlTerm();
					}
					} 
				}
				setState(998);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(fglParser.AS, 0); }
		public SqlAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlAliasContext sqlAlias() throws RecognitionException {
		SqlAliasContext _localctx = new SqlAliasContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_sqlAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(999);
				match(AS);
				}
			}

			setState(1002);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlTermContext extends ParserRuleContext {
		public List<SqlFactorContext> sqlFactor() {
			return getRuleContexts(SqlFactorContext.class);
		}
		public SqlFactorContext sqlFactor(int i) {
			return getRuleContext(SqlFactorContext.class,i);
		}
		public List<SqlMultiplyContext> sqlMultiply() {
			return getRuleContexts(SqlMultiplyContext.class);
		}
		public SqlMultiplyContext sqlMultiply(int i) {
			return getRuleContext(SqlMultiplyContext.class,i);
		}
		public List<TerminalNode> DIV() { return getTokens(fglParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(fglParser.DIV, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(fglParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(fglParser.SLASH, i);
		}
		public SqlTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlTermContext sqlTerm() throws RecognitionException {
		SqlTermContext _localctx = new SqlTermContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_sqlTerm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			sqlFactor();
			setState(1013);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1008);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(1005);
						sqlMultiply();
						}
						break;
					case DIV:
						{
						setState(1006);
						match(DIV);
						}
						break;
					case SLASH:
						{
						setState(1007);
						match(SLASH);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1010);
					sqlFactor();
					}
					} 
				}
				setState(1015);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlMultiplyContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(fglParser.STAR, 0); }
		public SqlMultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlMultiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlMultiply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlMultiplyContext sqlMultiply() throws RecognitionException {
		SqlMultiplyContext _localctx = new SqlMultiplyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_sqlMultiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			match(STAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlFactorContext extends ParserRuleContext {
		public List<SqlFactor2Context> sqlFactor2() {
			return getRuleContexts(SqlFactor2Context.class);
		}
		public SqlFactor2Context sqlFactor2(int i) {
			return getRuleContext(SqlFactor2Context.class,i);
		}
		public List<TerminalNode> DOUBLEVERTBAR() { return getTokens(fglParser.DOUBLEVERTBAR); }
		public TerminalNode DOUBLEVERTBAR(int i) {
			return getToken(fglParser.DOUBLEVERTBAR, i);
		}
		public SqlFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlFactorContext sqlFactor() throws RecognitionException {
		SqlFactorContext _localctx = new SqlFactorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_sqlFactor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			sqlFactor2();
			setState(1023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1019);
					match(DOUBLEVERTBAR);
					setState(1020);
					sqlFactor2();
					}
					} 
				}
				setState(1025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlFactor2Context extends ParserRuleContext {
		public List<SqlVariableContext> sqlVariable() {
			return getRuleContexts(SqlVariableContext.class);
		}
		public SqlVariableContext sqlVariable(int i) {
			return getRuleContext(SqlVariableContext.class,i);
		}
		public List<TerminalNode> UNITS() { return getTokens(fglParser.UNITS); }
		public TerminalNode UNITS(int i) {
			return getToken(fglParser.UNITS, i);
		}
		public List<UnitTypeContext> unitType() {
			return getRuleContexts(UnitTypeContext.class);
		}
		public UnitTypeContext unitType(int i) {
			return getRuleContext(UnitTypeContext.class,i);
		}
		public List<SqlLiteralContext> sqlLiteral() {
			return getRuleContexts(SqlLiteralContext.class);
		}
		public SqlLiteralContext sqlLiteral(int i) {
			return getRuleContext(SqlLiteralContext.class,i);
		}
		public List<GroupFunctionContext> groupFunction() {
			return getRuleContexts(GroupFunctionContext.class);
		}
		public GroupFunctionContext groupFunction(int i) {
			return getRuleContext(GroupFunctionContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(fglParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(fglParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(fglParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(fglParser.RPAREN, i);
		}
		public List<SqlExpressionContext> sqlExpression() {
			return getRuleContexts(SqlExpressionContext.class);
		}
		public SqlExpressionContext sqlExpression(int i) {
			return getRuleContext(SqlExpressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(fglParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(fglParser.STAR, i);
		}
		public List<TerminalNode> ALL() { return getTokens(fglParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(fglParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(fglParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(fglParser.DISTINCT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public List<SqlFunctionContext> sqlFunction() {
			return getRuleContexts(SqlFunctionContext.class);
		}
		public SqlFunctionContext sqlFunction(int i) {
			return getRuleContext(SqlFunctionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(fglParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(fglParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(fglParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(fglParser.MINUS, i);
		}
		public SqlExpressionListContext sqlExpressionList() {
			return getRuleContext(SqlExpressionListContext.class,0);
		}
		public SqlFactor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlFactor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlFactor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlFactor2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlFactor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlFactor2Context sqlFactor2() throws RecognitionException {
		SqlFactor2Context _localctx = new SqlFactor2Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_sqlFactor2);
		int _la;
		try {
			setState(1119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1026);
				sqlVariable();
				setState(1029);
				_la = _input.LA(1);
				if (_la==UNITS) {
					{
					setState(1027);
					match(UNITS);
					setState(1028);
					unitType();
					}
				}

				}
				setState(1031);
				sqlVariable();
				setState(1034);
				_la = _input.LA(1);
				if (_la==UNITS) {
					{
					setState(1032);
					match(UNITS);
					setState(1033);
					unitType();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1036);
				sqlLiteral();
				setState(1039);
				_la = _input.LA(1);
				if (_la==UNITS) {
					{
					setState(1037);
					match(UNITS);
					setState(1038);
					unitType();
					}
				}

				}
				setState(1041);
				sqlLiteral();
				setState(1044);
				_la = _input.LA(1);
				if (_la==UNITS) {
					{
					setState(1042);
					match(UNITS);
					setState(1043);
					unitType();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1046);
				groupFunction();
				setState(1047);
				match(LPAREN);
				setState(1049);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1048);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT || _la==STAR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(1059);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ASCII) | (1L << AVG) | (1L << COUNT) | (1L << CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATE - 64)) | (1L << (DAY - 64)) | (1L << (DECODE - 64)) | (1L << (FALSE - 64)) | (1L << (FIRST - 64)) | (1L << (FOUND - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (GROUP - 134)) | (1L << (HIDE - 134)) | (1L << (INDEX - 134)) | (1L << (INT_FLAG - 134)) | (1L << (INTERRUPT - 134)) | (1L << (LAST - 134)) | (1L << (LENGTH - 134)) | (1L << (LINENO - 134)) | (1L << (MAX - 134)) | (1L << (MDY - 134)) | (1L << (MIN - 134)) | (1L << (MOD - 134)) | (1L << (MONTH - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (NVL - 198)) | (1L << (PAGENO - 198)) | (1L << (REAL - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SQL - 262)) | (1L << (STATUS - 262)) | (1L << (SUM - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (USER - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WORK - 262)) | (1L << (YEAR - 262)) | (1L << (PLUS - 262)) | (1L << (MINUS - 262)) | (1L << (STAR - 262)))) != 0) || ((((_la - 335)) & ~0x3f) == 0 && ((1L << (_la - 335)) & ((1L << (LPAREN - 335)) | (1L << (IDENT - 335)) | (1L << (STRING_LITERAL - 335)) | (1L << (NUM_INT - 335)) | (1L << (NUM_REAL - 335)))) != 0)) {
					{
					setState(1051);
					sqlExpression();
					setState(1056);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1052);
						match(COMMA);
						setState(1053);
						sqlExpression();
						}
						}
						setState(1058);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1061);
				match(RPAREN);
				}
				setState(1063);
				groupFunction();
				setState(1064);
				match(LPAREN);
				setState(1066);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(1065);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT || _la==STAR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(1076);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ASCII) | (1L << AVG) | (1L << COUNT) | (1L << CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATE - 64)) | (1L << (DAY - 64)) | (1L << (DECODE - 64)) | (1L << (FALSE - 64)) | (1L << (FIRST - 64)) | (1L << (FOUND - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (GROUP - 134)) | (1L << (HIDE - 134)) | (1L << (INDEX - 134)) | (1L << (INT_FLAG - 134)) | (1L << (INTERRUPT - 134)) | (1L << (LAST - 134)) | (1L << (LENGTH - 134)) | (1L << (LINENO - 134)) | (1L << (MAX - 134)) | (1L << (MDY - 134)) | (1L << (MIN - 134)) | (1L << (MOD - 134)) | (1L << (MONTH - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (NVL - 198)) | (1L << (PAGENO - 198)) | (1L << (REAL - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SQL - 262)) | (1L << (STATUS - 262)) | (1L << (SUM - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (USER - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WORK - 262)) | (1L << (YEAR - 262)) | (1L << (PLUS - 262)) | (1L << (MINUS - 262)) | (1L << (STAR - 262)))) != 0) || ((((_la - 335)) & ~0x3f) == 0 && ((1L << (_la - 335)) & ((1L << (LPAREN - 335)) | (1L << (IDENT - 335)) | (1L << (STRING_LITERAL - 335)) | (1L << (NUM_INT - 335)) | (1L << (NUM_REAL - 335)))) != 0)) {
					{
					setState(1068);
					sqlExpression();
					setState(1073);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1069);
						match(COMMA);
						setState(1070);
						sqlExpression();
						}
						}
						setState(1075);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1078);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1080);
				sqlFunction();
				{
				setState(1081);
				match(LPAREN);
				setState(1082);
				sqlExpression();
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1083);
					match(COMMA);
					setState(1084);
					sqlExpression();
					}
					}
					setState(1089);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1090);
				match(RPAREN);
				}
				}
				setState(1092);
				sqlFunction();
				{
				setState(1093);
				match(LPAREN);
				setState(1094);
				sqlExpression();
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1095);
					match(COMMA);
					setState(1096);
					sqlExpression();
					}
					}
					setState(1101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1102);
				match(RPAREN);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1104);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1105);
				sqlExpression();
				}
				setState(1107);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1108);
				sqlExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1110);
				match(LPAREN);
				setState(1111);
				sqlExpression();
				setState(1112);
				match(RPAREN);
				}
				setState(1114);
				match(LPAREN);
				setState(1115);
				sqlExpression();
				setState(1116);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1118);
				sqlExpressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlExpressionListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public List<SqlExpressionContext> sqlExpression() {
			return getRuleContexts(SqlExpressionContext.class);
		}
		public SqlExpressionContext sqlExpression(int i) {
			return getRuleContext(SqlExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public SqlExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExpressionListContext sqlExpressionList() throws RecognitionException {
		SqlExpressionListContext _localctx = new SqlExpressionListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_sqlExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			match(LPAREN);
			setState(1122);
			sqlExpression();
			setState(1125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1123);
				match(COMMA);
				setState(1124);
				sqlExpression();
				}
				}
				setState(1127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(1129);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlLiteralContext extends ParserRuleContext {
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NULL() { return getToken(fglParser.NULL, 0); }
		public TerminalNode FALSE() { return getToken(fglParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(fglParser.TRUE, 0); }
		public SqlLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlLiteralContext sqlLiteral() throws RecognitionException {
		SqlLiteralContext _localctx = new SqlLiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_sqlLiteral);
		try {
			setState(1136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				unsignedConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1133);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1134);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1135);
				match(TRUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlVariableContext extends ParserRuleContext {
		public List<ColumnsTableIdContext> columnsTableId() {
			return getRuleContexts(ColumnsTableIdContext.class);
		}
		public ColumnsTableIdContext columnsTableId(int i) {
			return getRuleContext(ColumnsTableIdContext.class,i);
		}
		public SqlVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlVariableContext sqlVariable() throws RecognitionException {
		SqlVariableContext _localctx = new SqlVariableContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_sqlVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			columnsTableId();
			setState(1139);
			columnsTableId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlFunctionContext extends ParserRuleContext {
		public NumberFunctionContext numberFunction() {
			return getRuleContext(NumberFunctionContext.class,0);
		}
		public CharFunctionContext charFunction() {
			return getRuleContext(CharFunctionContext.class,0);
		}
		public DateFunctionContext dateFunction() {
			return getRuleContext(DateFunctionContext.class,0);
		}
		public OtherFunctionContext otherFunction() {
			return getRuleContext(OtherFunctionContext.class,0);
		}
		public SqlFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlFunctionContext sqlFunction() throws RecognitionException {
		SqlFunctionContext _localctx = new SqlFunctionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sqlFunction);
		try {
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1141);
				numberFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1142);
				charFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1143);
				dateFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1144);
				otherFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateFunctionContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(fglParser.YEAR, 0); }
		public TerminalNode DATE() { return getToken(fglParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(fglParser.DAY, 0); }
		public TerminalNode MONTH() { return getToken(fglParser.MONTH, 0); }
		public DateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateFunctionContext dateFunction() throws RecognitionException {
		DateFunctionContext _localctx = new DateFunctionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_dateFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			_la = _input.LA(1);
			if ( !(_la==DATE || _la==DAY || _la==MONTH || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberFunctionContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(fglParser.MOD, 0); }
		public NumberFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterNumberFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitNumberFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitNumberFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberFunctionContext numberFunction() throws RecognitionException {
		NumberFunctionContext _localctx = new NumberFunctionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_numberFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			match(MOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharFunctionContext extends ParserRuleContext {
		public TerminalNode LENGTH() { return getToken(fglParser.LENGTH, 0); }
		public CharFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterCharFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitCharFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitCharFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharFunctionContext charFunction() throws RecognitionException {
		CharFunctionContext _localctx = new CharFunctionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_charFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(LENGTH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupFunctionContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(fglParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(fglParser.COUNT, 0); }
		public TerminalNode MAX() { return getToken(fglParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(fglParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(fglParser.SUM, 0); }
		public GroupFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterGroupFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitGroupFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitGroupFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupFunctionContext groupFunction() throws RecognitionException {
		GroupFunctionContext _localctx = new GroupFunctionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_groupFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			_la = _input.LA(1);
			if ( !(_la==AVG || _la==COUNT || _la==MAX || _la==MIN || _la==SUM) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherFunctionContext extends ParserRuleContext {
		public TerminalNode DECODE() { return getToken(fglParser.DECODE, 0); }
		public TerminalNode NVL() { return getToken(fglParser.NVL, 0); }
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public OtherFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterOtherFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitOtherFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitOtherFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherFunctionContext otherFunction() throws RecognitionException {
		OtherFunctionContext _localctx = new OtherFunctionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_otherFunction);
		int _la;
		try {
			setState(1157);
			switch (_input.LA(1)) {
			case DECODE:
			case NVL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				_la = _input.LA(1);
				if ( !(_la==DECODE || _la==NVL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156);
				constantIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlPseudoColumnContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(fglParser.USER, 0); }
		public SqlPseudoColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlPseudoColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlPseudoColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlPseudoColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlPseudoColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlPseudoColumnContext sqlPseudoColumn() throws RecognitionException {
		SqlPseudoColumnContext _localctx = new SqlPseudoColumnContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_sqlPseudoColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(fglParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(fglParser.NOT_EQUAL, 0); }
		public TerminalNode LE() { return getToken(fglParser.LE, 0); }
		public TerminalNode LT() { return getToken(fglParser.LT, 0); }
		public TerminalNode GE() { return getToken(fglParser.GE, 0); }
		public TerminalNode GT() { return getToken(fglParser.GT, 0); }
		public TerminalNode LIKE() { return getToken(fglParser.LIKE, 0); }
		public TerminalNode MATCHES() { return getToken(fglParser.MATCHES, 0); }
		public TerminalNode NOT() { return getToken(fglParser.NOT, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitRelationalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_relationalOperator);
		int _la;
		try {
			setState(1172);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				match(EQUAL);
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				match(NOT_EQUAL);
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1163);
				match(LE);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1164);
				match(LT);
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1165);
				match(GE);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1166);
				match(GT);
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1167);
				match(LIKE);
				}
				break;
			case MATCHES:
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1169);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1168);
					match(NOT);
					}
				}

				setState(1171);
				match(MATCHES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(fglParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(fglParser.FALSE, 0); }
		public List<IfCondition2Context> ifCondition2() {
			return getRuleContexts(IfCondition2Context.class);
		}
		public IfCondition2Context ifCondition2(int i) {
			return getRuleContext(IfCondition2Context.class,i);
		}
		public List<RelationalOperatorContext> relationalOperator() {
			return getRuleContexts(RelationalOperatorContext.class);
		}
		public RelationalOperatorContext relationalOperator(int i) {
			return getRuleContext(RelationalOperatorContext.class,i);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ifCondition);
		try {
			int _alt;
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1174);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1175);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1176);
				ifCondition2();
				setState(1182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1177);
						relationalOperator();
						setState(1178);
						ifCondition2();
						}
						} 
					}
					setState(1184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfCondition2Context extends ParserRuleContext {
		public List<IfLogicalTermContext> ifLogicalTerm() {
			return getRuleContexts(IfLogicalTermContext.class);
		}
		public IfLogicalTermContext ifLogicalTerm(int i) {
			return getRuleContext(IfLogicalTermContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(fglParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(fglParser.OR, i);
		}
		public IfCondition2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterIfCondition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitIfCondition2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitIfCondition2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfCondition2Context ifCondition2() throws RecognitionException {
		IfCondition2Context _localctx = new IfCondition2Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_ifCondition2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			ifLogicalTerm();
			setState(1192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1188);
					match(OR);
					setState(1189);
					ifLogicalTerm();
					}
					} 
				}
				setState(1194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfLogicalTermContext extends ParserRuleContext {
		public List<IfLogicalFactorContext> ifLogicalFactor() {
			return getRuleContexts(IfLogicalFactorContext.class);
		}
		public IfLogicalFactorContext ifLogicalFactor(int i) {
			return getRuleContext(IfLogicalFactorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(fglParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(fglParser.AND, i);
		}
		public IfLogicalTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLogicalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterIfLogicalTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitIfLogicalTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitIfLogicalTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfLogicalTermContext ifLogicalTerm() throws RecognitionException {
		IfLogicalTermContext _localctx = new IfLogicalTermContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ifLogicalTerm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			ifLogicalFactor();
			setState(1200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1196);
					match(AND);
					setState(1197);
					ifLogicalFactor();
					}
					} 
				}
				setState(1202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public List<TerminalNode> CLIPPED() { return getTokens(fglParser.CLIPPED); }
		public TerminalNode CLIPPED(int i) {
			return getToken(fglParser.CLIPPED, i);
		}
		public List<TerminalNode> USING() { return getTokens(fglParser.USING); }
		public TerminalNode USING(int i) {
			return getToken(fglParser.USING, i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			simpleExpression();
			setState(1209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1207);
					switch (_input.LA(1)) {
					case CLIPPED:
						{
						setState(1204);
						match(CLIPPED);
						}
						break;
					case USING:
						{
						setState(1205);
						match(USING);
						setState(1206);
						string();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfLogicalFactorContext extends ParserRuleContext {
		public List<TerminalNode> NOT() { return getTokens(fglParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(fglParser.NOT, i);
		}
		public List<IfConditionContext> ifCondition() {
			return getRuleContexts(IfConditionContext.class);
		}
		public IfConditionContext ifCondition(int i) {
			return getRuleContext(IfConditionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public IfLogicalFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLogicalFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterIfLogicalFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitIfLogicalFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitIfLogicalFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfLogicalFactorContext ifLogicalFactor() throws RecognitionException {
		IfLogicalFactorContext _localctx = new IfLogicalFactorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_ifLogicalFactor);
		try {
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1213);
				match(NOT);
				setState(1214);
				ifCondition();
				}
				setState(1216);
				match(NOT);
				setState(1217);
				ifCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1219);
				match(LPAREN);
				setState(1220);
				ifCondition();
				setState(1221);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1223);
				simpleExpression();
				setState(1224);
				simpleExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public List<AddingOperatorContext> addingOperator() {
			return getRuleContexts(AddingOperatorContext.class);
		}
		public AddingOperatorContext addingOperator(int i) {
			return getRuleContext(AddingOperatorContext.class,i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_simpleExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1228);
				sign();
				}
				break;
			}
			setState(1231);
			term();
			setState(1237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1232);
					addingOperator();
					setState(1233);
					term();
					}
					} 
				}
				setState(1239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddingOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(fglParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(fglParser.MINUS, 0); }
		public AddingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterAddingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitAddingOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitAddingOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddingOperatorContext addingOperator() throws RecognitionException {
		AddingOperatorContext _localctx = new AddingOperatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_addingOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MultiplyingOperatorContext> multiplyingOperator() {
			return getRuleContexts(MultiplyingOperatorContext.class);
		}
		public MultiplyingOperatorContext multiplyingOperator(int i) {
			return getRuleContext(MultiplyingOperatorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			factor();
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV || _la==MOD || _la==STAR || _la==SLASH) {
				{
				{
				setState(1243);
				multiplyingOperator();
				setState(1244);
				factor();
				}
				}
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplyingOperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(fglParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(fglParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(fglParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(fglParser.MOD, 0); }
		public MultiplyingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterMultiplyingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitMultiplyingOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitMultiplyingOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingOperatorContext multiplyingOperator() throws RecognitionException {
		MultiplyingOperatorContext _localctx = new MultiplyingOperatorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_multiplyingOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			_la = _input.LA(1);
			if ( !(_la==DIV || _la==MOD || _la==STAR || _la==SLASH) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(fglParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode UNITS() { return getToken(fglParser.UNITS, 0); }
		public UnitTypeContext unitType() {
			return getRuleContext(UnitTypeContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(fglParser.GROUP, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1253);
					match(GROUP);
					}
					break;
				}
				setState(1256);
				functionDesignator();
				}
				break;
			case 2:
				{
				setState(1257);
				variable();
				}
				break;
			case 3:
				{
				setState(1258);
				constant();
				}
				break;
			case 4:
				{
				setState(1259);
				match(LPAREN);
				setState(1260);
				expression();
				setState(1261);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(1263);
				match(NOT);
				setState(1264);
				factor();
				}
				break;
			}
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1267);
				match(UNITS);
				setState(1268);
				unitType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDesignatorContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterFunctionDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitFunctionDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitFunctionDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_functionDesignator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			functionIdentifier();
			setState(1284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1272);
				match(LPAREN);
				setState(1281);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (ACCEPT - 3)) | (1L << (ASCII - 3)) | (1L << (AVG - 3)) | (1L << (COLUMN - 3)) | (1L << (COUNT - 3)) | (1L << (CURRENT - 3)) | (1L << (DATE - 3)) | (1L << (DAY - 3)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EXTEND - 106)) | (1L << (FALSE - 106)) | (1L << (FIRST - 106)) | (1L << (FOUND - 106)) | (1L << (GROUP - 106)) | (1L << (HIDE - 106)) | (1L << (INDEX - 106)) | (1L << (INFIELD - 106)) | (1L << (INT_FLAG - 106)) | (1L << (INTERRUPT - 106)) | (1L << (LAST - 106)) | (1L << (LENGTH - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (LINENO - 170)) | (1L << (MAX - 170)) | (1L << (MDY - 170)) | (1L << (MIN - 170)) | (1L << (MONTH - 170)) | (1L << (NO - 170)) | (1L << (NOT - 170)) | (1L << (NOTFOUND - 170)) | (1L << (NULL - 170)) | (1L << (PAGENO - 170)) | (1L << (PREPARE - 170)))) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & ((1L << (REAL - 236)) | (1L << (SIZE - 236)) | (1L << (SQL - 236)) | (1L << (STATUS - 236)) | (1L << (SUM - 236)) | (1L << (TEMP - 236)) | (1L << (TIME - 236)) | (1L << (TODAY - 236)) | (1L << (TRUE - 236)))) != 0) || ((((_la - 300)) & ~0x3f) == 0 && ((1L << (_la - 300)) & ((1L << (USER - 300)) | (1L << (WEEKDAY - 300)) | (1L << (WAIT - 300)) | (1L << (WORK - 300)) | (1L << (YEAR - 300)) | (1L << (PLUS - 300)) | (1L << (MINUS - 300)) | (1L << (STAR - 300)) | (1L << (LPAREN - 300)) | (1L << (IDENT - 300)) | (1L << (STRING_LITERAL - 300)) | (1L << (NUM_INT - 300)) | (1L << (NUM_REAL - 300)))) != 0)) {
					{
					setState(1273);
					actualParameter();
					setState(1278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1274);
						match(COMMA);
						setState(1275);
						actualParameter();
						}
						}
						setState(1280);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1283);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(fglParser.DAY, 0); }
		public TerminalNode YEAR() { return getToken(fglParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(fglParser.MONTH, 0); }
		public TerminalNode TODAY() { return getToken(fglParser.TODAY, 0); }
		public TerminalNode WEEKDAY() { return getToken(fglParser.WEEKDAY, 0); }
		public TerminalNode MDY() { return getToken(fglParser.MDY, 0); }
		public TerminalNode COLUMN() { return getToken(fglParser.COLUMN, 0); }
		public TerminalNode SUM() { return getToken(fglParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(fglParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(fglParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(fglParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(fglParser.MAX, 0); }
		public TerminalNode EXTEND() { return getToken(fglParser.EXTEND, 0); }
		public TerminalNode DATE() { return getToken(fglParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(fglParser.TIME, 0); }
		public TerminalNode INFIELD() { return getToken(fglParser.INFIELD, 0); }
		public TerminalNode PREPARE() { return getToken(fglParser.PREPARE, 0); }
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_functionIdentifier);
		int _la;
		try {
			setState(1288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1286);
				_la = _input.LA(1);
				if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AVG - 18)) | (1L << (COLUMN - 18)) | (1L << (COUNT - 18)) | (1L << (DATE - 18)) | (1L << (DAY - 18)))) != 0) || _la==EXTEND || _la==INFIELD || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (MAX - 183)) | (1L << (MDY - 183)) | (1L << (MIN - 183)) | (1L << (MONTH - 183)) | (1L << (PREPARE - 183)))) != 0) || ((((_la - 276)) & ~0x3f) == 0 && ((1L << (_la - 276)) & ((1L << (SUM - 276)) | (1L << (TIME - 276)) | (1L << (TODAY - 276)) | (1L << (WEEKDAY - 276)) | (1L << (YEAR - 276)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1287);
				constantIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public TerminalNode NULL() { return getToken(fglParser.NULL, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitUnsignedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitUnsignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_unsignedConstant);
		try {
			setState(1294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1291);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1292);
				constantIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1293);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_constant);
		try {
			setState(1302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1296);
				numericConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1297);
				constantIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1298);
				sign();
				setState(1299);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1301);
				string();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumericConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterNumericConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitNumericConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitNumericConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericConstantContext numericConstant() throws RecognitionException {
		NumericConstantContext _localctx = new NumericConstantContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_numericConstant);
		try {
			setState(1308);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				unsignedNumber();
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				sign();
				setState(1306);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public EntireVariableContext entireVariable() {
			return getRuleContext(EntireVariableContext.class,0);
		}
		public ComponentVariableContext componentVariable() {
			return getRuleContext(ComponentVariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_variable);
		try {
			setState(1312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				entireVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				componentVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntireVariableContext extends ParserRuleContext {
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class,0);
		}
		public EntireVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entireVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterEntireVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitEntireVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitEntireVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntireVariableContext entireVariable() throws RecognitionException {
		EntireVariableContext _localctx = new EntireVariableContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_entireVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			variableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableIdentifierContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public VariableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitVariableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitVariableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIdentifierContext variableIdentifier() throws RecognitionException {
		VariableIdentifierContext _localctx = new VariableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_variableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			constantIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexingVariableContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(fglParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(fglParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public IndexingVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexingVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterIndexingVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitIndexingVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitIndexingVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexingVariableContext indexingVariable() throws RecognitionException {
		IndexingVariableContext _localctx = new IndexingVariableContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_indexingVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			match(LBRACK);
			setState(1319);
			expression();
			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1320);
				match(COMMA);
				setState(1321);
				expression();
				}
				}
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1327);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentVariableContext extends ParserRuleContext {
		public RecordVariableContext recordVariable() {
			return getRuleContext(RecordVariableContext.class,0);
		}
		public IndexingVariableContext indexingVariable() {
			return getRuleContext(IndexingVariableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(fglParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(fglParser.STAR, 0); }
		public List<ComponentVariableContext> componentVariable() {
			return getRuleContexts(ComponentVariableContext.class);
		}
		public ComponentVariableContext componentVariable(int i) {
			return getRuleContext(ComponentVariableContext.class,i);
		}
		public TerminalNode THROUGH() { return getToken(fglParser.THROUGH, 0); }
		public TerminalNode THRU() { return getToken(fglParser.THRU, 0); }
		public ComponentVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterComponentVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitComponentVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitComponentVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentVariableContext componentVariable() throws RecognitionException {
		ComponentVariableContext _localctx = new ComponentVariableContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_componentVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1329);
			recordVariable();
			setState(1331);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(1330);
				indexingVariable();
				}
			}

			}
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				{
				setState(1333);
				match(DOT);
				setState(1334);
				match(STAR);
				}
				}
				break;
			case 2:
				{
				{
				setState(1335);
				match(DOT);
				setState(1336);
				componentVariable();
				setState(1339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1337);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1338);
					componentVariable();
					}
					break;
				}
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordVariableContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public RecordVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterRecordVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitRecordVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitRecordVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordVariableContext recordVariable() throws RecognitionException {
		RecordVariableContext _localctx = new RecordVariableContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_recordVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			constantIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldIdentifierContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public FieldIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterFieldIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitFieldIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitFieldIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldIdentifierContext fieldIdentifier() throws RecognitionException {
		FieldIdentifierContext _localctx = new FieldIdentifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_fieldIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			constantIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuredStatementContext extends ParserRuleContext {
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public RepetetiveStatementContext repetetiveStatement() {
			return getRuleContext(RepetetiveStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterStructuredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitStructuredStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitStructuredStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_structuredStatement);
		try {
			setState(1349);
			switch (_input.LA(1)) {
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1347);
				conditionalStatement();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1348);
				repetetiveStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_conditionalStatement);
		try {
			setState(1353);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1351);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1352);
				caseStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(fglParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(fglParser.IF, i);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(fglParser.THEN, 0); }
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(fglParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			match(IF);
			setState(1356);
			ifCondition();
			setState(1357);
			match(THEN);
			setState(1359);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT) {
				{
				setState(1358);
				codeBlock();
				}
			}

			setState(1365);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1361);
				match(ELSE);
				setState(1363);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT) {
					{
					setState(1362);
					codeBlock();
					}
				}

				}
			}

			setState(1367);
			match(END);
			setState(1368);
			match(IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepetetiveStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForEachStatementContext forEachStatement() {
			return getRuleContext(ForEachStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepetetiveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetetiveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterRepetetiveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitRepetetiveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitRepetetiveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetetiveStatementContext repetetiveStatement() throws RecognitionException {
		RepetetiveStatementContext _localctx = new RepetetiveStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_repetetiveStatement);
		try {
			setState(1373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1370);
				whileStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1371);
				forEachStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1372);
				forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public List<TerminalNode> WHILE() { return getTokens(fglParser.WHILE); }
		public TerminalNode WHILE(int i) {
			return getToken(fglParser.WHILE, i);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			match(WHILE);
			setState(1376);
			ifCondition();
			setState(1378);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT) {
				{
				setState(1377);
				codeBlock();
				}
			}

			setState(1380);
			match(END);
			setState(1381);
			match(WHILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public List<TerminalNode> FOR() { return getTokens(fglParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(fglParser.FOR, i);
		}
		public ControlVariableContext controlVariable() {
			return getRuleContext(ControlVariableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(fglParser.EQUAL, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public TerminalNode STEP() { return getToken(fglParser.STEP, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			match(FOR);
			setState(1384);
			controlVariable();
			setState(1385);
			match(EQUAL);
			setState(1386);
			forList();
			setState(1389);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(1387);
				match(STEP);
				setState(1388);
				numericConstant();
				}
			}

			setState(1391);
			eol();
			setState(1393);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT) {
				{
				setState(1392);
				codeBlock();
				}
			}

			setState(1395);
			match(END);
			setState(1396);
			match(FOR);
			setState(1397);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForListContext extends ParserRuleContext {
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(fglParser.TO, 0); }
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitForList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitForList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_forList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			initialValue();
			setState(1400);
			match(TO);
			setState(1401);
			finalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlVariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ControlVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterControlVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitControlVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitControlVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlVariableContext controlVariable() throws RecognitionException {
		ControlVariableContext _localctx = new ControlVariableContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_controlVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitInitialValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitInitialValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitFinalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitFinalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForEachStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(fglParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(fglParser.EACH, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(fglParser.COLON, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode USING() { return getToken(fglParser.USING, 0); }
		public List<VariableListContext> variableList() {
			return getRuleContexts(VariableListContext.class);
		}
		public VariableListContext variableList(int i) {
			return getRuleContext(VariableListContext.class,i);
		}
		public TerminalNode INTO() { return getToken(fglParser.INTO, 0); }
		public TerminalNode WITH() { return getToken(fglParser.WITH, 0); }
		public TerminalNode REOPTIMIZATION() { return getToken(fglParser.REOPTIMIZATION, 0); }
		public TerminalNode WHERE() { return getToken(fglParser.WHERE, 0); }
		public TerminalNode NOLOCK() { return getToken(fglParser.NOLOCK, 0); }
		public TerminalNode NOWAIT() { return getToken(fglParser.NOWAIT, 0); }
		public ForEachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitForEachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitForEachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachStatementContext forEachStatement() throws RecognitionException {
		ForEachStatementContext _localctx = new ForEachStatementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_forEachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			match(FOR);
			setState(1410);
			match(EACH);
			setState(1411);
			expression();
			setState(1414);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1412);
				match(USING);
				setState(1413);
				variableList();
				}
			}

			setState(1418);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1416);
				match(INTO);
				setState(1417);
				variableList();
				}
			}

			setState(1422);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1420);
				match(WITH);
				setState(1421);
				match(REOPTIMIZATION);
				}
			}

			setState(1426);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1424);
				match(WHERE);
				setState(1425);
				expression();
				}
			}

			setState(1429);
			_la = _input.LA(1);
			if (_la==NOLOCK) {
				{
				setState(1428);
				match(NOLOCK);
				}
			}

			setState(1432);
			_la = _input.LA(1);
			if (_la==NOWAIT) {
				{
				setState(1431);
				match(NOWAIT);
				}
			}

			setState(1434);
			match(COLON);
			setState(1435);
			codeBlock();
			setState(1436);
			match(END);
			setState(1437);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableListContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public VariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitVariableList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitVariableList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableListContext variableList() throws RecognitionException {
		VariableListContext _localctx = new VariableListContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_variableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			variable();
			setState(1444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1440);
				match(COMMA);
				setState(1441);
				variable();
				}
				}
				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableOrConstantListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public VariableOrConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterVariableOrConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitVariableOrConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitVariableOrConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrConstantListContext variableOrConstantList() throws RecognitionException {
		VariableOrConstantListContext _localctx = new VariableOrConstantListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_variableOrConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			expression();
			setState(1452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1448);
				match(COMMA);
				setState(1449);
				expression();
				}
				}
				setState(1454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(fglParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(fglParser.CASE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(fglParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(fglParser.WHEN, i);
		}
		public TerminalNode OTHERWISE() { return getToken(fglParser.OTHERWISE, 0); }
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public List<IfConditionContext> ifCondition() {
			return getRuleContexts(IfConditionContext.class);
		}
		public IfConditionContext ifCondition(int i) {
			return getRuleContext(IfConditionContext.class,i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_caseStatement);
		int _la;
		try {
			setState(1492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				match(CASE);
				setState(1456);
				expression();
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1457);
					match(WHEN);
					setState(1458);
					expression();
					setState(1460);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT) {
						{
						setState(1459);
						codeBlock();
						}
					}

					}
					}
					setState(1466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1471);
				_la = _input.LA(1);
				if (_la==OTHERWISE) {
					{
					setState(1467);
					match(OTHERWISE);
					setState(1469);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT) {
						{
						setState(1468);
						codeBlock();
						}
					}

					}
				}

				setState(1473);
				match(END);
				setState(1474);
				match(CASE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1476);
				match(CASE);
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1477);
					match(WHEN);
					setState(1478);
					ifCondition();
					setState(1479);
					codeBlock();
					}
					}
					setState(1485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1488);
				_la = _input.LA(1);
				if (_la==OTHERWISE) {
					{
					setState(1486);
					match(OTHERWISE);
					setState(1487);
					codeBlock();
					}
				}

				setState(1490);
				match(END);
				setState(1491);
				match(CASE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherFGLStatementContext extends ParserRuleContext {
		public OtherProgramFlowStatementContext otherProgramFlowStatement() {
			return getRuleContext(OtherProgramFlowStatementContext.class,0);
		}
		public OtherStorageStatementContext otherStorageStatement() {
			return getRuleContext(OtherStorageStatementContext.class,0);
		}
		public ReportStatementContext reportStatement() {
			return getRuleContext(ReportStatementContext.class,0);
		}
		public ScreenStatementContext screenStatement() {
			return getRuleContext(ScreenStatementContext.class,0);
		}
		public OtherFGLStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherFGLStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterOtherFGLStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitOtherFGLStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitOtherFGLStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherFGLStatementContext otherFGLStatement() throws RecognitionException {
		OtherFGLStatementContext _localctx = new OtherFGLStatementContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_otherFGLStatement);
		try {
			setState(1498);
			switch (_input.LA(1)) {
			case CONTINUE:
			case EXIT:
			case GOTO:
			case RETURN:
			case RUN:
			case SLEEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1494);
				otherProgramFlowStatement();
				}
				break;
			case ALLOCATE:
			case DEALLOCATE:
			case FREE:
			case INITIALIZE:
			case LOCATE:
			case RESIZE:
			case VALIDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1495);
				otherStorageStatement();
				}
				break;
			case FINISH:
			case NEED:
			case OUTPUT:
			case PAUSE:
			case PRINT:
			case SKIP2:
			case START:
			case TERMINATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1496);
				reportStatement();
				}
				break;
			case CLEAR:
			case CLOSE:
			case CONSTRUCT:
			case CURRENT:
			case DISPLAY:
			case ERROR:
			case INPUT:
			case MENU:
			case MESSAGE:
			case OPEN:
			case OPTIONS:
			case PROMPT:
			case SCROLL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1497);
				screenStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherProgramFlowStatementContext extends ParserRuleContext {
		public RunStatementContext runStatement() {
			return getRuleContext(RunStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public TerminalNode SLEEP() { return getToken(fglParser.SLEEP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExitStatementsContext exitStatements() {
			return getRuleContext(ExitStatementsContext.class,0);
		}
		public ContinueStatementsContext continueStatements() {
			return getRuleContext(ContinueStatementsContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public OtherProgramFlowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherProgramFlowStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterOtherProgramFlowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitOtherProgramFlowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitOtherProgramFlowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherProgramFlowStatementContext otherProgramFlowStatement() throws RecognitionException {
		OtherProgramFlowStatementContext _localctx = new OtherProgramFlowStatementContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_otherProgramFlowStatement);
		try {
			setState(1507);
			switch (_input.LA(1)) {
			case RUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1500);
				runStatement();
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(1501);
				gotoStatement();
				}
				break;
			case SLEEP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1502);
				match(SLEEP);
				setState(1503);
				expression();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1504);
				exitStatements();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1505);
				continueStatements();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1506);
				returnStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitTypesContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(fglParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(fglParser.EACH, 0); }
		public TerminalNode CASE() { return getToken(fglParser.CASE, 0); }
		public TerminalNode CONSTRUCT() { return getToken(fglParser.CONSTRUCT, 0); }
		public TerminalNode DISPLAY() { return getToken(fglParser.DISPLAY, 0); }
		public TerminalNode INPUT() { return getToken(fglParser.INPUT, 0); }
		public TerminalNode MENU() { return getToken(fglParser.MENU, 0); }
		public TerminalNode REPORT() { return getToken(fglParser.REPORT, 0); }
		public TerminalNode WHILE() { return getToken(fglParser.WHILE, 0); }
		public ExitTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterExitTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitExitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitExitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitTypesContext exitTypes() throws RecognitionException {
		ExitTypesContext _localctx = new ExitTypesContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_exitTypes);
		try {
			setState(1519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1509);
				match(FOR);
				setState(1510);
				match(EACH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1511);
				match(FOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1512);
				match(CASE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1513);
				match(CONSTRUCT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1514);
				match(DISPLAY);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1515);
				match(INPUT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1516);
				match(MENU);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1517);
				match(REPORT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1518);
				match(WHILE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitStatementsContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(fglParser.EXIT, 0); }
		public ExitTypesContext exitTypes() {
			return getRuleContext(ExitTypesContext.class,0);
		}
		public TerminalNode PROGRAM() { return getToken(fglParser.PROGRAM, 0); }
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public ExitStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterExitStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitExitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitExitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitStatementsContext exitStatements() throws RecognitionException {
		ExitStatementsContext _localctx = new ExitStatementsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_exitStatements);
		try {
			setState(1532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				match(EXIT);
				setState(1522);
				exitTypes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1523);
				match(EXIT);
				setState(1524);
				match(PROGRAM);
				setState(1530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1525);
					match(LPAREN);
					setState(1526);
					expression();
					setState(1527);
					match(RPAREN);
					}
					break;
				case 2:
					{
					setState(1529);
					expression();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementsContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(fglParser.CONTINUE, 0); }
		public ExitTypesContext exitTypes() {
			return getRuleContext(ExitTypesContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public ContinueStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterContinueStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitContinueStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitContinueStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementsContext continueStatements() throws RecognitionException {
		ContinueStatementsContext _localctx = new ContinueStatementsContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_continueStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			match(CONTINUE);
			setState(1535);
			exitTypes();
			setState(1536);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherStorageStatementContext extends ParserRuleContext {
		public TerminalNode ALLOCATE() { return getToken(fglParser.ALLOCATE, 0); }
		public TerminalNode ARRAY() { return getToken(fglParser.ARRAY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayIndexerContext arrayIndexer() {
			return getRuleContext(ArrayIndexerContext.class,0);
		}
		public TerminalNode LOCATE() { return getToken(fglParser.LOCATE, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public TerminalNode IN() { return getToken(fglParser.IN, 0); }
		public TerminalNode MEMORY() { return getToken(fglParser.MEMORY, 0); }
		public TerminalNode FILE() { return getToken(fglParser.FILE, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DEALLOCATE() { return getToken(fglParser.DEALLOCATE, 0); }
		public TerminalNode RESIZE() { return getToken(fglParser.RESIZE, 0); }
		public TerminalNode FREE() { return getToken(fglParser.FREE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public TerminalNode INITIALIZE() { return getToken(fglParser.INITIALIZE, 0); }
		public TerminalNode TO() { return getToken(fglParser.TO, 0); }
		public TerminalNode NULL() { return getToken(fglParser.NULL, 0); }
		public TerminalNode LIKE() { return getToken(fglParser.LIKE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode VALIDATE() { return getToken(fglParser.VALIDATE, 0); }
		public OtherStorageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherStorageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterOtherStorageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitOtherStorageStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitOtherStorageStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherStorageStatementContext otherStorageStatement() throws RecognitionException {
		OtherStorageStatementContext _localctx = new OtherStorageStatementContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_otherStorageStatement);
		int _la;
		try {
			setState(1611);
			switch (_input.LA(1)) {
			case ALLOCATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1538);
				match(ALLOCATE);
				setState(1539);
				match(ARRAY);
				setState(1540);
				identifier();
				setState(1541);
				arrayIndexer();
				}
				break;
			case LOCATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1543);
				match(LOCATE);
				setState(1544);
				variableList();
				setState(1545);
				match(IN);
				setState(1552);
				switch (_input.LA(1)) {
				case MEMORY:
					{
					setState(1546);
					match(MEMORY);
					}
					break;
				case FILE:
					{
					setState(1547);
					match(FILE);
					setState(1550);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
					case 1:
						{
						setState(1548);
						variable();
						}
						break;
					case 2:
						{
						setState(1549);
						string();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DEALLOCATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1554);
				match(DEALLOCATE);
				setState(1555);
				match(ARRAY);
				setState(1556);
				identifier();
				}
				break;
			case RESIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1557);
				match(RESIZE);
				setState(1558);
				match(ARRAY);
				setState(1559);
				identifier();
				setState(1560);
				arrayIndexer();
				}
				break;
			case FREE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1562);
				match(FREE);
				setState(1563);
				variable();
				setState(1568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1564);
					match(COMMA);
					setState(1565);
					variable();
					}
					}
					setState(1570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case INITIALIZE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1571);
				match(INITIALIZE);
				setState(1572);
				variable();
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1573);
					match(COMMA);
					setState(1574);
					variable();
					}
					}
					setState(1579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1591);
				switch (_input.LA(1)) {
				case TO:
					{
					setState(1580);
					match(TO);
					setState(1581);
					match(NULL);
					}
					break;
				case LIKE:
					{
					setState(1582);
					match(LIKE);
					setState(1583);
					expression();
					setState(1588);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1584);
						match(COMMA);
						setState(1585);
						expression();
						}
						}
						setState(1590);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case VALIDATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1593);
				match(VALIDATE);
				setState(1594);
				variable();
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1595);
					match(COMMA);
					setState(1596);
					variable();
					}
					}
					setState(1601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1602);
				match(LIKE);
				setState(1603);
				expression();
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1604);
					match(COMMA);
					setState(1605);
					expression();
					}
					}
					setState(1610);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintExpressionItemContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(fglParser.COLUMN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAGENO() { return getToken(fglParser.PAGENO, 0); }
		public TerminalNode LINENO() { return getToken(fglParser.LINENO, 0); }
		public TerminalNode BYTE() { return getToken(fglParser.BYTE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(fglParser.TEXT, 0); }
		public TerminalNode WORDWRAP() { return getToken(fglParser.WORDWRAP, 0); }
		public TerminalNode SPACE() { return getToken(fglParser.SPACE, 0); }
		public TerminalNode SPACES() { return getToken(fglParser.SPACES, 0); }
		public TerminalNode RIGHT() { return getToken(fglParser.RIGHT, 0); }
		public TerminalNode MARGIN() { return getToken(fglParser.MARGIN, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public PrintExpressionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpressionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterPrintExpressionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitPrintExpressionItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitPrintExpressionItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpressionItemContext printExpressionItem() throws RecognitionException {
		PrintExpressionItemContext _localctx = new PrintExpressionItemContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_printExpressionItem);
		int _la;
		try {
			setState(1632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1613);
				match(COLUMN);
				setState(1614);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1615);
				_la = _input.LA(1);
				if ( !(_la==LINENO || _la==PAGENO) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1616);
				match(BYTE);
				setState(1617);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1618);
				match(TEXT);
				setState(1619);
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1620);
				expression();
				setState(1622);
				_la = _input.LA(1);
				if (_la==SPACE || _la==SPACES) {
					{
					setState(1621);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==SPACES) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1630);
				_la = _input.LA(1);
				if (_la==WORDWRAP) {
					{
					setState(1624);
					match(WORDWRAP);
					setState(1628);
					_la = _input.LA(1);
					if (_la==RIGHT) {
						{
						setState(1625);
						match(RIGHT);
						setState(1626);
						match(MARGIN);
						setState(1627);
						numericConstant();
						}
					}

					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintExpressionListContext extends ParserRuleContext {
		public List<PrintExpressionItemContext> printExpressionItem() {
			return getRuleContexts(PrintExpressionItemContext.class);
		}
		public PrintExpressionItemContext printExpressionItem(int i) {
			return getRuleContext(PrintExpressionItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public PrintExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterPrintExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitPrintExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitPrintExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpressionListContext printExpressionList() throws RecognitionException {
		PrintExpressionListContext _localctx = new PrintExpressionListContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_printExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			printExpressionItem();
			setState(1639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1635);
				match(COMMA);
				setState(1636);
				printExpressionItem();
				}
				}
				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReportStatementContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(fglParser.START, 0); }
		public TerminalNode REPORT() { return getToken(fglParser.REPORT, 0); }
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public TerminalNode TO() { return getToken(fglParser.TO, 0); }
		public TerminalNode WITH() { return getToken(fglParser.WITH, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PIPE() { return getToken(fglParser.PIPE, 0); }
		public TerminalNode PRINTER() { return getToken(fglParser.PRINTER, 0); }
		public List<TerminalNode> LEFT() { return getTokens(fglParser.LEFT); }
		public TerminalNode LEFT(int i) {
			return getToken(fglParser.LEFT, i);
		}
		public List<TerminalNode> MARGIN() { return getTokens(fglParser.MARGIN); }
		public TerminalNode MARGIN(int i) {
			return getToken(fglParser.MARGIN, i);
		}
		public List<NumericConstantContext> numericConstant() {
			return getRuleContexts(NumericConstantContext.class);
		}
		public NumericConstantContext numericConstant(int i) {
			return getRuleContext(NumericConstantContext.class,i);
		}
		public List<TerminalNode> RIGHT() { return getTokens(fglParser.RIGHT); }
		public TerminalNode RIGHT(int i) {
			return getToken(fglParser.RIGHT, i);
		}
		public List<TerminalNode> TOP() { return getTokens(fglParser.TOP); }
		public TerminalNode TOP(int i) {
			return getToken(fglParser.TOP, i);
		}
		public List<TerminalNode> BOTTOM() { return getTokens(fglParser.BOTTOM); }
		public TerminalNode BOTTOM(int i) {
			return getToken(fglParser.BOTTOM, i);
		}
		public List<TerminalNode> PAGE() { return getTokens(fglParser.PAGE); }
		public TerminalNode PAGE(int i) {
			return getToken(fglParser.PAGE, i);
		}
		public List<TerminalNode> LENGTH() { return getTokens(fglParser.LENGTH); }
		public TerminalNode LENGTH(int i) {
			return getToken(fglParser.LENGTH, i);
		}
		public List<TerminalNode> OF() { return getTokens(fglParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(fglParser.OF, i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode TERMINATE() { return getToken(fglParser.TERMINATE, 0); }
		public TerminalNode FINISH() { return getToken(fglParser.FINISH, 0); }
		public TerminalNode PAUSE() { return getToken(fglParser.PAUSE, 0); }
		public TerminalNode NEED() { return getToken(fglParser.NEED, 0); }
		public TerminalNode LINES() { return getToken(fglParser.LINES, 0); }
		public TerminalNode PRINT() { return getToken(fglParser.PRINT, 0); }
		public TerminalNode FILE() { return getToken(fglParser.FILE, 0); }
		public PrintExpressionListContext printExpressionList() {
			return getRuleContext(PrintExpressionListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(fglParser.SEMI, 0); }
		public TerminalNode SKIP2() { return getToken(fglParser.SKIP2, 0); }
		public TerminalNode LINE() { return getToken(fglParser.LINE, 0); }
		public TerminalNode OUTPUT() { return getToken(fglParser.OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public ReportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterReportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitReportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitReportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReportStatementContext reportStatement() throws RecognitionException {
		ReportStatementContext _localctx = new ReportStatementContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_reportStatement);
		int _la;
		try {
			int _alt;
			setState(1733);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(1642);
				match(START);
				setState(1643);
				match(REPORT);
				setState(1644);
				constantIdentifier();
				setState(1652);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(1645);
					match(TO);
					setState(1650);
					switch (_input.LA(1)) {
					case ACCEPT:
					case ASCII:
					case AVG:
					case COLUMN:
					case COUNT:
					case CURRENT:
					case DATE:
					case DAY:
					case EXTEND:
					case FALSE:
					case FIRST:
					case FOUND:
					case GROUP:
					case HIDE:
					case INDEX:
					case INFIELD:
					case INT_FLAG:
					case INTERRUPT:
					case LAST:
					case LENGTH:
					case LINENO:
					case MAX:
					case MDY:
					case MIN:
					case MONTH:
					case NO:
					case NOT:
					case NOTFOUND:
					case NULL:
					case PAGENO:
					case PREPARE:
					case REAL:
					case SIZE:
					case SQL:
					case STATUS:
					case SUM:
					case TEMP:
					case TIME:
					case TODAY:
					case TRUE:
					case USER:
					case WEEKDAY:
					case WAIT:
					case WORK:
					case YEAR:
					case PLUS:
					case MINUS:
					case LPAREN:
					case IDENT:
					case STRING_LITERAL:
					case NUM_INT:
					case NUM_REAL:
						{
						setState(1646);
						expression();
						}
						break;
					case PIPE:
						{
						setState(1647);
						match(PIPE);
						setState(1648);
						expression();
						}
						break;
					case PRINTER:
						{
						setState(1649);
						match(PRINTER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(1679);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1654);
					match(WITH);
					setState(1676);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							setState(1674);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
							case 1:
								{
								{
								setState(1655);
								match(LEFT);
								setState(1656);
								match(MARGIN);
								setState(1657);
								numericConstant();
								}
								}
								break;
							case 2:
								{
								{
								setState(1658);
								match(RIGHT);
								setState(1659);
								match(MARGIN);
								setState(1660);
								numericConstant();
								}
								}
								break;
							case 3:
								{
								{
								setState(1661);
								match(TOP);
								setState(1662);
								match(MARGIN);
								setState(1663);
								numericConstant();
								}
								}
								break;
							case 4:
								{
								{
								setState(1664);
								match(BOTTOM);
								setState(1665);
								match(MARGIN);
								setState(1666);
								numericConstant();
								}
								}
								break;
							case 5:
								{
								{
								setState(1667);
								match(PAGE);
								setState(1668);
								match(LENGTH);
								setState(1669);
								numericConstant();
								}
								}
								break;
							case 6:
								{
								{
								setState(1670);
								match(TOP);
								setState(1671);
								match(OF);
								setState(1672);
								match(PAGE);
								setState(1673);
								string();
								}
								}
								break;
							}
							} 
						}
						setState(1678);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
					}
					}
				}

				}
				break;
			case TERMINATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
				match(TERMINATE);
				setState(1682);
				match(REPORT);
				setState(1683);
				constantIdentifier();
				}
				break;
			case FINISH:
				enterOuterAlt(_localctx, 3);
				{
				setState(1684);
				match(FINISH);
				setState(1685);
				match(REPORT);
				setState(1686);
				constantIdentifier();
				}
				break;
			case PAUSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1687);
				match(PAUSE);
				setState(1689);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL) {
					{
					setState(1688);
					string();
					}
				}

				}
				break;
			case NEED:
				enterOuterAlt(_localctx, 5);
				{
				setState(1691);
				match(NEED);
				setState(1692);
				expression();
				setState(1693);
				match(LINES);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1695);
				match(PRINT);
				setState(1704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1697);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
					case 1:
						{
						setState(1696);
						printExpressionList();
						}
						break;
					}
					setState(1700);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1699);
						match(SEMI);
						}
					}

					}
					break;
				case 2:
					{
					setState(1702);
					match(FILE);
					setState(1703);
					string();
					}
					break;
				}
				}
				break;
			case SKIP2:
				enterOuterAlt(_localctx, 7);
				{
				setState(1706);
				match(SKIP2);
				setState(1714);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case AVG:
				case COLUMN:
				case COUNT:
				case CURRENT:
				case DATE:
				case DAY:
				case EXTEND:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INFIELD:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MAX:
				case MDY:
				case MIN:
				case MONTH:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case PAGENO:
				case PREPARE:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case SUM:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case YEAR:
				case PLUS:
				case MINUS:
				case LPAREN:
				case IDENT:
				case STRING_LITERAL:
				case NUM_INT:
				case NUM_REAL:
					{
					setState(1707);
					expression();
					setState(1708);
					_la = _input.LA(1);
					if ( !(_la==LINE || _la==LINES) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case TO:
					{
					setState(1710);
					match(TO);
					setState(1711);
					match(TOP);
					setState(1712);
					match(OF);
					setState(1713);
					match(PAGE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1716);
				match(OUTPUT);
				setState(1717);
				match(TO);
				setState(1718);
				match(REPORT);
				setState(1719);
				constantIdentifier();
				setState(1720);
				match(LPAREN);
				setState(1729);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (ACCEPT - 3)) | (1L << (ASCII - 3)) | (1L << (AVG - 3)) | (1L << (COLUMN - 3)) | (1L << (COUNT - 3)) | (1L << (CURRENT - 3)) | (1L << (DATE - 3)) | (1L << (DAY - 3)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EXTEND - 106)) | (1L << (FALSE - 106)) | (1L << (FIRST - 106)) | (1L << (FOUND - 106)) | (1L << (GROUP - 106)) | (1L << (HIDE - 106)) | (1L << (INDEX - 106)) | (1L << (INFIELD - 106)) | (1L << (INT_FLAG - 106)) | (1L << (INTERRUPT - 106)) | (1L << (LAST - 106)) | (1L << (LENGTH - 106)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (LINENO - 170)) | (1L << (MAX - 170)) | (1L << (MDY - 170)) | (1L << (MIN - 170)) | (1L << (MONTH - 170)) | (1L << (NO - 170)) | (1L << (NOT - 170)) | (1L << (NOTFOUND - 170)) | (1L << (NULL - 170)) | (1L << (PAGENO - 170)) | (1L << (PREPARE - 170)))) != 0) || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & ((1L << (REAL - 236)) | (1L << (SIZE - 236)) | (1L << (SQL - 236)) | (1L << (STATUS - 236)) | (1L << (SUM - 236)) | (1L << (TEMP - 236)) | (1L << (TIME - 236)) | (1L << (TODAY - 236)) | (1L << (TRUE - 236)))) != 0) || ((((_la - 300)) & ~0x3f) == 0 && ((1L << (_la - 300)) & ((1L << (USER - 300)) | (1L << (WEEKDAY - 300)) | (1L << (WAIT - 300)) | (1L << (WORK - 300)) | (1L << (YEAR - 300)) | (1L << (PLUS - 300)) | (1L << (MINUS - 300)) | (1L << (LPAREN - 300)) | (1L << (IDENT - 300)) | (1L << (STRING_LITERAL - 300)) | (1L << (NUM_INT - 300)) | (1L << (NUM_REAL - 300)))) != 0)) {
					{
					setState(1721);
					expression();
					setState(1726);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1722);
						match(COMMA);
						setState(1723);
						expression();
						}
						}
						setState(1728);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1731);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(fglParser.DOT, 0); }
		public TerminalNode LBRACK() { return getToken(fglParser.LBRACK, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(fglParser.RBRACK, 0); }
		public TerminalNode STAR() { return getToken(fglParser.STAR, 0); }
		public ThruNotationContext thruNotation() {
			return getRuleContext(ThruNotationContext.class,0);
		}
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_fieldName);
		int _la;
		try {
			setState(1762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					{
					setState(1735);
					identifier();
					setState(1740);
					_la = _input.LA(1);
					if (_la==LBRACK) {
						{
						setState(1736);
						match(LBRACK);
						setState(1737);
						numericConstant();
						setState(1738);
						match(RBRACK);
						}
					}

					}
					setState(1742);
					match(DOT);
					}
					break;
				}
				setState(1746);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1747);
				identifier();
				setState(1752);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(1748);
					match(LBRACK);
					setState(1749);
					numericConstant();
					setState(1750);
					match(RBRACK);
					}
				}

				}
				setState(1754);
				match(DOT);
				setState(1760);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(1755);
					match(STAR);
					}
					break;
				case IDENT:
					{
					setState(1756);
					identifier();
					setState(1758);
					_la = _input.LA(1);
					if (_la==THROUGH || _la==THRU) {
						{
						setState(1757);
						thruNotation();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThruNotationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode THROUGH() { return getToken(fglParser.THROUGH, 0); }
		public TerminalNode THRU() { return getToken(fglParser.THRU, 0); }
		public TerminalNode SAME() { return getToken(fglParser.SAME, 0); }
		public TerminalNode DOT() { return getToken(fglParser.DOT, 0); }
		public ThruNotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thruNotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterThruNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitThruNotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitThruNotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThruNotationContext thruNotation() throws RecognitionException {
		ThruNotationContext _localctx = new ThruNotationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_thruNotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			_la = _input.LA(1);
			if ( !(_la==THROUGH || _la==THRU) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1767);
			_la = _input.LA(1);
			if (_la==SAME) {
				{
				setState(1765);
				match(SAME);
				setState(1766);
				match(DOT);
				}
			}

			setState(1769);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_fieldList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			expression();
			setState(1776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1772);
					match(COMMA);
					setState(1773);
					expression();
					}
					} 
				}
				setState(1778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public KeyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterKeyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitKeyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitKeyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyListContext keyList() throws RecognitionException {
		KeyListContext _localctx = new KeyListContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_keyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			expression();
			setState(1784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1780);
				match(COMMA);
				setState(1781);
				expression();
				}
				}
				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructEventsContext extends ParserRuleContext {
		public TerminalNode BEFORE() { return getToken(fglParser.BEFORE, 0); }
		public TerminalNode CONSTRUCT() { return getToken(fglParser.CONSTRUCT, 0); }
		public TerminalNode AFTER() { return getToken(fglParser.AFTER, 0); }
		public TerminalNode FIELD() { return getToken(fglParser.FIELD, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode ON() { return getToken(fglParser.ON, 0); }
		public TerminalNode KEY() { return getToken(fglParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public KeyListContext keyList() {
			return getRuleContext(KeyListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public ConstructEventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructEvents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterConstructEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitConstructEvents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitConstructEvents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructEventsContext constructEvents() throws RecognitionException {
		ConstructEventsContext _localctx = new ConstructEventsContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_constructEvents);
		try {
			setState(1803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1787);
				match(BEFORE);
				setState(1788);
				match(CONSTRUCT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1789);
				match(AFTER);
				setState(1790);
				match(CONSTRUCT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1791);
				match(BEFORE);
				setState(1792);
				match(FIELD);
				setState(1793);
				fieldList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1794);
				match(AFTER);
				setState(1795);
				match(FIELD);
				setState(1796);
				fieldList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1797);
				match(ON);
				setState(1798);
				match(KEY);
				setState(1799);
				match(LPAREN);
				setState(1800);
				keyList();
				setState(1801);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructInsideStatementContext extends ParserRuleContext {
		public List<TerminalNode> NEXT() { return getTokens(fglParser.NEXT); }
		public TerminalNode NEXT(int i) {
			return getToken(fglParser.NEXT, i);
		}
		public TerminalNode FIELD() { return getToken(fglParser.FIELD, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode PREVIOUS() { return getToken(fglParser.PREVIOUS, 0); }
		public TerminalNode CONTINUE() { return getToken(fglParser.CONTINUE, 0); }
		public TerminalNode CONSTRUCT() { return getToken(fglParser.CONSTRUCT, 0); }
		public TerminalNode EXIT() { return getToken(fglParser.EXIT, 0); }
		public ConstructInsideStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructInsideStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterConstructInsideStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitConstructInsideStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitConstructInsideStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructInsideStatementContext constructInsideStatement() throws RecognitionException {
		ConstructInsideStatementContext _localctx = new ConstructInsideStatementContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_constructInsideStatement);
		try {
			setState(1819);
			switch (_input.LA(1)) {
			case NEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1805);
				match(NEXT);
				setState(1806);
				match(FIELD);
				setState(1810);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(1807);
					fieldName();
					}
					break;
				case NEXT:
					{
					setState(1808);
					match(NEXT);
					}
					break;
				case PREVIOUS:
					{
					setState(1809);
					match(PREVIOUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1812);
				eol();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1813);
				match(CONTINUE);
				setState(1814);
				match(CONSTRUCT);
				setState(1815);
				eol();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1816);
				match(EXIT);
				setState(1817);
				match(CONSTRUCT);
				setState(1818);
				eol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialAttributeContext extends ParserRuleContext {
		public TerminalNode REVERSE() { return getToken(fglParser.REVERSE, 0); }
		public TerminalNode BLINK() { return getToken(fglParser.BLINK, 0); }
		public TerminalNode UNDERLINE() { return getToken(fglParser.UNDERLINE, 0); }
		public SpecialAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSpecialAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSpecialAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSpecialAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialAttributeContext specialAttribute() throws RecognitionException {
		SpecialAttributeContext _localctx = new SpecialAttributeContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_specialAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1821);
			_la = _input.LA(1);
			if ( !(_la==BLINK || _la==REVERSE || _la==UNDERLINE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public List<SpecialAttributeContext> specialAttribute() {
			return getRuleContexts(SpecialAttributeContext.class);
		}
		public SpecialAttributeContext specialAttribute(int i) {
			return getRuleContext(SpecialAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public TerminalNode BLACK() { return getToken(fglParser.BLACK, 0); }
		public TerminalNode BLUE() { return getToken(fglParser.BLUE, 0); }
		public TerminalNode CYAN() { return getToken(fglParser.CYAN, 0); }
		public TerminalNode GREEN() { return getToken(fglParser.GREEN, 0); }
		public TerminalNode MAGENTA() { return getToken(fglParser.MAGENTA, 0); }
		public TerminalNode RED() { return getToken(fglParser.RED, 0); }
		public TerminalNode WHITE() { return getToken(fglParser.WHITE, 0); }
		public TerminalNode YELLOW() { return getToken(fglParser.YELLOW, 0); }
		public TerminalNode BOLD() { return getToken(fglParser.BOLD, 0); }
		public TerminalNode DIM() { return getToken(fglParser.DIM, 0); }
		public TerminalNode NORMAL() { return getToken(fglParser.NORMAL, 0); }
		public TerminalNode INVISIBLE() { return getToken(fglParser.INVISIBLE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (BLACK - 24)) | (1L << (BLUE - 24)) | (1L << (BOLD - 24)) | (1L << (CYAN - 24)) | (1L << (DIM - 24)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (GREEN - 133)) | (1L << (INVISIBLE - 133)) | (1L << (MAGENTA - 133)))) != 0) || _la==NORMAL || _la==RED || _la==WHITE || _la==YELLOW) {
				{
				setState(1823);
				_la = _input.LA(1);
				if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (BLACK - 24)) | (1L << (BLUE - 24)) | (1L << (BOLD - 24)) | (1L << (CYAN - 24)) | (1L << (DIM - 24)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (GREEN - 133)) | (1L << (INVISIBLE - 133)) | (1L << (MAGENTA - 133)))) != 0) || _la==NORMAL || _la==RED || _la==WHITE || _la==YELLOW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1826);
			specialAttribute();
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1827);
				match(COMMA);
				setState(1828);
				specialAttribute();
				}
				}
				setState(1833);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(fglParser.ATTRIBUTE, 0); }
		public TerminalNode ATTRIBUTES() { return getToken(fglParser.ATTRIBUTES, 0); }
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			_la = _input.LA(1);
			if ( !(_la==ATTRIBUTE || _la==ATTRIBUTES) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1835);
			match(LPAREN);
			setState(1836);
			attribute();
			setState(1837);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructGroupStatementContext extends ParserRuleContext {
		public ConstructEventsContext constructEvents() {
			return getRuleContext(ConstructEventsContext.class,0);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public ConstructGroupStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructGroupStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterConstructGroupStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitConstructGroupStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitConstructGroupStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructGroupStatementContext constructGroupStatement() throws RecognitionException {
		ConstructGroupStatementContext _localctx = new ConstructGroupStatementContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_constructGroupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			constructEvents();
			setState(1841); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1840);
				codeBlock();
				}
				}
				setState(1843); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructStatementContext extends ParserRuleContext {
		public List<TerminalNode> CONSTRUCT() { return getTokens(fglParser.CONSTRUCT); }
		public TerminalNode CONSTRUCT(int i) {
			return getToken(fglParser.CONSTRUCT, i);
		}
		public TerminalNode BY() { return getToken(fglParser.BY, 0); }
		public TerminalNode NAME() { return getToken(fglParser.NAME, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ON() { return getToken(fglParser.ON, 0); }
		public ColumnsListContext columnsList() {
			return getRuleContext(ColumnsListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(fglParser.FROM, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public TerminalNode HELP() { return getToken(fglParser.HELP, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public List<ConstructGroupStatementContext> constructGroupStatement() {
			return getRuleContexts(ConstructGroupStatementContext.class);
		}
		public ConstructGroupStatementContext constructGroupStatement(int i) {
			return getRuleContext(ConstructGroupStatementContext.class,i);
		}
		public ConstructStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterConstructStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitConstructStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitConstructStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructStatementContext constructStatement() throws RecognitionException {
		ConstructStatementContext _localctx = new ConstructStatementContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_constructStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			match(CONSTRUCT);
			setState(1858);
			switch (_input.LA(1)) {
			case BY:
				{
				setState(1846);
				match(BY);
				setState(1847);
				match(NAME);
				setState(1848);
				variable();
				setState(1849);
				match(ON);
				setState(1850);
				columnsList();
				}
				break;
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
				{
				setState(1852);
				variable();
				setState(1853);
				match(ON);
				setState(1854);
				columnsList();
				setState(1855);
				match(FROM);
				setState(1856);
				fieldList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1861);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1860);
				attributeList();
				}
			}

			setState(1865);
			_la = _input.LA(1);
			if (_la==HELP) {
				{
				setState(1863);
				match(HELP);
				setState(1864);
				numericConstant();
				}
			}

			setState(1875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1868); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1867);
					constructGroupStatement();
					}
					}
					setState(1870); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AFTER || _la==BEFORE || _la==ON );
				setState(1872);
				match(END);
				setState(1873);
				match(CONSTRUCT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayArrayStatementContext extends ParserRuleContext {
		public List<TerminalNode> DISPLAY() { return getTokens(fglParser.DISPLAY); }
		public TerminalNode DISPLAY(int i) {
			return getToken(fglParser.DISPLAY, i);
		}
		public TerminalNode ARRAY() { return getToken(fglParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(fglParser.TO, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public List<DisplayEventsContext> displayEvents() {
			return getRuleContexts(DisplayEventsContext.class);
		}
		public DisplayEventsContext displayEvents(int i) {
			return getRuleContext(DisplayEventsContext.class,i);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public DisplayArrayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayArrayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDisplayArrayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDisplayArrayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDisplayArrayStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayArrayStatementContext displayArrayStatement() throws RecognitionException {
		DisplayArrayStatementContext _localctx = new DisplayArrayStatementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_displayArrayStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1877);
			match(DISPLAY);
			setState(1878);
			match(ARRAY);
			setState(1879);
			expression();
			setState(1880);
			match(TO);
			setState(1881);
			expression();
			setState(1883);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1882);
				attributeList();
				}
			}

			setState(1888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1885);
					displayEvents();
					}
					} 
				}
				setState(1890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			}
			setState(1893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1891);
				match(END);
				setState(1892);
				match(DISPLAY);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayInsideStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(fglParser.CONTINUE, 0); }
		public TerminalNode DISPLAY() { return getToken(fglParser.DISPLAY, 0); }
		public TerminalNode EXIT() { return getToken(fglParser.EXIT, 0); }
		public DisplayInsideStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayInsideStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDisplayInsideStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDisplayInsideStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDisplayInsideStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayInsideStatementContext displayInsideStatement() throws RecognitionException {
		DisplayInsideStatementContext _localctx = new DisplayInsideStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_displayInsideStatement);
		try {
			setState(1899);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1895);
				match(CONTINUE);
				setState(1896);
				match(DISPLAY);
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1897);
				match(EXIT);
				setState(1898);
				match(DISPLAY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayEventsContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(fglParser.ON, 0); }
		public TerminalNode KEY() { return getToken(fglParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public KeyListContext keyList() {
			return getRuleContext(KeyListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public DisplayEventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayEvents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDisplayEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDisplayEvents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDisplayEvents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayEventsContext displayEvents() throws RecognitionException {
		DisplayEventsContext _localctx = new DisplayEventsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_displayEvents);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			match(ON);
			setState(1902);
			match(KEY);
			setState(1903);
			match(LPAREN);
			setState(1904);
			keyList();
			setState(1905);
			match(RPAREN);
			setState(1907); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1906);
					codeBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1909); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayStatementContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(fglParser.DISPLAY, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode BY() { return getToken(fglParser.BY, 0); }
		public TerminalNode NAME() { return getToken(fglParser.NAME, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(fglParser.TO, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode AT() { return getToken(fglParser.AT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public DisplayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDisplayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDisplayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDisplayStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayStatementContext displayStatement() throws RecognitionException {
		DisplayStatementContext _localctx = new DisplayStatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_displayStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			match(DISPLAY);
			setState(1939);
			switch (_input.LA(1)) {
			case BY:
				{
				setState(1912);
				match(BY);
				setState(1913);
				match(NAME);
				{
				setState(1914);
				expression();
				setState(1919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1915);
					match(COMMA);
					setState(1916);
					expression();
					}
					}
					setState(1921);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ACCEPT:
			case ASCII:
			case AVG:
			case COLUMN:
			case COUNT:
			case CURRENT:
			case DATE:
			case DAY:
			case EXTEND:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INFIELD:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MAX:
			case MDY:
			case MIN:
			case MONTH:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case PREPARE:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case SUM:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case YEAR:
			case PLUS:
			case MINUS:
			case LPAREN:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				{
				{
				setState(1922);
				expression();
				setState(1927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1923);
					match(COMMA);
					setState(1924);
					expression();
					}
					}
					setState(1929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1937);
				switch (_input.LA(1)) {
				case TO:
					{
					setState(1930);
					match(TO);
					setState(1931);
					fieldList();
					}
					break;
				case AT:
					{
					setState(1932);
					match(AT);
					setState(1933);
					expression();
					setState(1934);
					match(COMMA);
					setState(1935);
					expression();
					}
					break;
				case ATTRIBUTE:
				case ATTRIBUTES:
				case EOL:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1942);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1941);
				attributeList();
				}
			}

			setState(1944);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorStatementContext extends ParserRuleContext {
		public TerminalNode ERROR() { return getToken(fglParser.ERROR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public ErrorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterErrorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitErrorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitErrorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorStatementContext errorStatement() throws RecognitionException {
		ErrorStatementContext _localctx = new ErrorStatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_errorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			match(ERROR);
			setState(1947);
			expression();
			setState(1952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1948);
				match(COMMA);
				setState(1949);
				expression();
				}
				}
				setState(1954);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1956);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1955);
				attributeList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageStatementContext extends ParserRuleContext {
		public TerminalNode MESSAGE() { return getToken(fglParser.MESSAGE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public MessageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterMessageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitMessageStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitMessageStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageStatementContext messageStatement() throws RecognitionException {
		MessageStatementContext _localctx = new MessageStatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_messageStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			match(MESSAGE);
			setState(1959);
			expression();
			setState(1964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1960);
				match(COMMA);
				setState(1961);
				expression();
				}
				}
				setState(1966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1968);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1967);
				attributeList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PromptStatementContext extends ParserRuleContext {
		public List<TerminalNode> PROMPT() { return getTokens(fglParser.PROMPT); }
		public TerminalNode PROMPT(int i) {
			return getToken(fglParser.PROMPT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(fglParser.FOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public List<AttributeListContext> attributeList() {
			return getRuleContexts(AttributeListContext.class);
		}
		public AttributeListContext attributeList(int i) {
			return getRuleContext(AttributeListContext.class,i);
		}
		public TerminalNode CHAR() { return getToken(fglParser.CHAR, 0); }
		public TerminalNode HELP() { return getToken(fglParser.HELP, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public List<TerminalNode> ON() { return getTokens(fglParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(fglParser.ON, i);
		}
		public List<TerminalNode> KEY() { return getTokens(fglParser.KEY); }
		public TerminalNode KEY(int i) {
			return getToken(fglParser.KEY, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(fglParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(fglParser.LPAREN, i);
		}
		public List<KeyListContext> keyList() {
			return getRuleContexts(KeyListContext.class);
		}
		public KeyListContext keyList(int i) {
			return getRuleContext(KeyListContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(fglParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(fglParser.RPAREN, i);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public PromptStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_promptStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterPromptStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitPromptStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitPromptStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PromptStatementContext promptStatement() throws RecognitionException {
		PromptStatementContext _localctx = new PromptStatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_promptStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			match(PROMPT);
			setState(1971);
			expression();
			setState(1976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1972);
				match(COMMA);
				setState(1973);
				expression();
				}
				}
				setState(1978);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1980);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1979);
				attributeList();
				}
			}

			setState(1982);
			match(FOR);
			setState(1984);
			_la = _input.LA(1);
			if (_la==CHAR) {
				{
				setState(1983);
				match(CHAR);
				}
			}

			setState(1986);
			variable();
			setState(1989);
			_la = _input.LA(1);
			if (_la==HELP) {
				{
				setState(1987);
				match(HELP);
				setState(1988);
				numericConstant();
				}
			}

			setState(1992);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1991);
				attributeList();
				}
			}

			setState(2009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(2004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(1994);
					match(ON);
					setState(1995);
					match(KEY);
					setState(1996);
					match(LPAREN);
					setState(1997);
					keyList();
					setState(1998);
					match(RPAREN);
					setState(2000);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT) {
						{
						setState(1999);
						codeBlock();
						}
					}

					}
					}
					setState(2006);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2007);
				match(END);
				setState(2008);
				match(PROMPT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputEventsContext extends ParserRuleContext {
		public TerminalNode BEFORE() { return getToken(fglParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(fglParser.AFTER, 0); }
		public TerminalNode INPUT() { return getToken(fglParser.INPUT, 0); }
		public TerminalNode ROW() { return getToken(fglParser.ROW, 0); }
		public TerminalNode INSERT() { return getToken(fglParser.INSERT, 0); }
		public TerminalNode DELETE() { return getToken(fglParser.DELETE, 0); }
		public TerminalNode FIELD() { return getToken(fglParser.FIELD, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode ON() { return getToken(fglParser.ON, 0); }
		public TerminalNode KEY() { return getToken(fglParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public KeyListContext keyList() {
			return getRuleContext(KeyListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public InputEventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputEvents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterInputEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitInputEvents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitInputEvents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputEventsContext inputEvents() throws RecognitionException {
		InputEventsContext _localctx = new InputEventsContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_inputEvents);
		int _la;
		try {
			setState(2025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2011);
				_la = _input.LA(1);
				if ( !(_la==AFTER || _la==BEFORE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2012);
				_la = _input.LA(1);
				if ( !(_la==DELETE || _la==INPUT || _la==INSERT || _la==ROW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2013);
				match(BEFORE);
				setState(2014);
				match(FIELD);
				setState(2015);
				fieldList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2016);
				match(AFTER);
				setState(2017);
				match(FIELD);
				setState(2018);
				fieldList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2019);
				match(ON);
				setState(2020);
				match(KEY);
				setState(2021);
				match(LPAREN);
				setState(2022);
				keyList();
				setState(2023);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputInsideStatementContext extends ParserRuleContext {
		public List<TerminalNode> NEXT() { return getTokens(fglParser.NEXT); }
		public TerminalNode NEXT(int i) {
			return getToken(fglParser.NEXT, i);
		}
		public TerminalNode FIELD() { return getToken(fglParser.FIELD, 0); }
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode PREVIOUS() { return getToken(fglParser.PREVIOUS, 0); }
		public TerminalNode CONTINUE() { return getToken(fglParser.CONTINUE, 0); }
		public TerminalNode INPUT() { return getToken(fglParser.INPUT, 0); }
		public TerminalNode EXIT() { return getToken(fglParser.EXIT, 0); }
		public InputInsideStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputInsideStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterInputInsideStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitInputInsideStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitInputInsideStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputInsideStatementContext inputInsideStatement() throws RecognitionException {
		InputInsideStatementContext _localctx = new InputInsideStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_inputInsideStatement);
		int _la;
		try {
			setState(2039);
			switch (_input.LA(1)) {
			case NEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2027);
				match(NEXT);
				setState(2028);
				match(FIELD);
				setState(2031);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(2029);
					fieldName();
					}
					break;
				case NEXT:
				case PREVIOUS:
					{
					setState(2030);
					_la = _input.LA(1);
					if ( !(_la==NEXT || _la==PREVIOUS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case CONTINUE:
			case EXIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					setState(2033);
					match(CONTINUE);
					setState(2034);
					match(INPUT);
					}
					break;
				case EXIT:
					{
					setState(2035);
					match(EXIT);
					setState(2036);
					match(INPUT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputGroupStatementContext extends ParserRuleContext {
		public InputEventsContext inputEvents() {
			return getRuleContext(InputEventsContext.class,0);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public InputGroupStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputGroupStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterInputGroupStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitInputGroupStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitInputGroupStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputGroupStatementContext inputGroupStatement() throws RecognitionException {
		InputGroupStatementContext _localctx = new InputGroupStatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_inputGroupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2041);
			inputEvents();
			setState(2045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT) {
				{
				{
				setState(2042);
				codeBlock();
				}
				}
				setState(2047);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputStatementContext extends ParserRuleContext {
		public List<TerminalNode> INPUT() { return getTokens(fglParser.INPUT); }
		public TerminalNode INPUT(int i) {
			return getToken(fglParser.INPUT, i);
		}
		public TerminalNode BY() { return getToken(fglParser.BY, 0); }
		public TerminalNode NAME() { return getToken(fglParser.NAME, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(fglParser.FROM, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public TerminalNode HELP() { return getToken(fglParser.HELP, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public TerminalNode WITHOUT() { return getToken(fglParser.WITHOUT, 0); }
		public TerminalNode DEFAULTS() { return getToken(fglParser.DEFAULTS, 0); }
		public List<InputGroupStatementContext> inputGroupStatement() {
			return getRuleContexts(InputGroupStatementContext.class);
		}
		public InputGroupStatementContext inputGroupStatement(int i) {
			return getRuleContext(InputGroupStatementContext.class,i);
		}
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_inputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
			match(INPUT);
			setState(2078);
			switch (_input.LA(1)) {
			case BY:
				{
				setState(2049);
				match(BY);
				setState(2050);
				match(NAME);
				setState(2051);
				expression();
				setState(2056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2052);
					match(COMMA);
					setState(2053);
					expression();
					}
					}
					setState(2058);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2061);
				_la = _input.LA(1);
				if (_la==WITHOUT) {
					{
					setState(2059);
					match(WITHOUT);
					setState(2060);
					match(DEFAULTS);
					}
				}

				}
				break;
			case ACCEPT:
			case ASCII:
			case AVG:
			case COLUMN:
			case COUNT:
			case CURRENT:
			case DATE:
			case DAY:
			case EXTEND:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INFIELD:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MAX:
			case MDY:
			case MIN:
			case MONTH:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case PREPARE:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case SUM:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case YEAR:
			case PLUS:
			case MINUS:
			case LPAREN:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				{
				setState(2063);
				expression();
				setState(2068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2064);
					match(COMMA);
					setState(2065);
					expression();
					}
					}
					setState(2070);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2073);
				_la = _input.LA(1);
				if (_la==WITHOUT) {
					{
					setState(2071);
					match(WITHOUT);
					setState(2072);
					match(DEFAULTS);
					}
				}

				setState(2075);
				match(FROM);
				setState(2076);
				fieldList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2081);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(2080);
				attributeList();
				}
			}

			setState(2085);
			_la = _input.LA(1);
			if (_la==HELP) {
				{
				setState(2083);
				match(HELP);
				setState(2084);
				numericConstant();
				}
			}

			setState(2095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(2088); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2087);
					inputGroupStatement();
					}
					}
					setState(2090); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AFTER || _la==BEFORE || _la==ON );
				setState(2092);
				match(END);
				setState(2093);
				match(INPUT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputArrayStatementContext extends ParserRuleContext {
		public List<TerminalNode> INPUT() { return getTokens(fglParser.INPUT); }
		public TerminalNode INPUT(int i) {
			return getToken(fglParser.INPUT, i);
		}
		public TerminalNode ARRAY() { return getToken(fglParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(fglParser.FROM, 0); }
		public TerminalNode WITHOUT() { return getToken(fglParser.WITHOUT, 0); }
		public TerminalNode DEFAULTS() { return getToken(fglParser.DEFAULTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public TerminalNode HELP() { return getToken(fglParser.HELP, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public List<InputGroupStatementContext> inputGroupStatement() {
			return getRuleContexts(InputGroupStatementContext.class);
		}
		public InputGroupStatementContext inputGroupStatement(int i) {
			return getRuleContext(InputGroupStatementContext.class,i);
		}
		public InputArrayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputArrayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterInputArrayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitInputArrayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitInputArrayStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputArrayStatementContext inputArrayStatement() throws RecognitionException {
		InputArrayStatementContext _localctx = new InputArrayStatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_inputArrayStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			match(INPUT);
			setState(2098);
			match(ARRAY);
			setState(2099);
			expression();
			setState(2102);
			_la = _input.LA(1);
			if (_la==WITHOUT) {
				{
				setState(2100);
				match(WITHOUT);
				setState(2101);
				match(DEFAULTS);
				}
			}

			setState(2104);
			match(FROM);
			setState(2105);
			expression();
			setState(2110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2106);
				match(COMMA);
				setState(2107);
				expression();
				}
				}
				setState(2112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2115);
			_la = _input.LA(1);
			if (_la==HELP) {
				{
				setState(2113);
				match(HELP);
				setState(2114);
				numericConstant();
				}
			}

			setState(2118);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(2117);
				attributeList();
				}
			}

			setState(2128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2120);
					inputGroupStatement();
					}
					}
					setState(2123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AFTER || _la==BEFORE || _la==ON );
				setState(2125);
				match(END);
				setState(2126);
				match(INPUT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenuEventsContext extends ParserRuleContext {
		public TerminalNode BEFORE() { return getToken(fglParser.BEFORE, 0); }
		public TerminalNode MENU() { return getToken(fglParser.MENU, 0); }
		public TerminalNode COMMAND() { return getToken(fglParser.COMMAND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KEY() { return getToken(fglParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public KeyListContext keyList() {
			return getRuleContext(KeyListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public TerminalNode HELP() { return getToken(fglParser.HELP, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public MenuEventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuEvents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterMenuEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitMenuEvents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitMenuEvents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenuEventsContext menuEvents() throws RecognitionException {
		MenuEventsContext _localctx = new MenuEventsContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_menuEvents);
		int _la;
		try {
			setState(2148);
			switch (_input.LA(1)) {
			case BEFORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2130);
				match(BEFORE);
				setState(2131);
				match(MENU);
				}
				break;
			case COMMAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(2132);
				match(COMMAND);
				{
				setState(2138);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(2133);
					match(KEY);
					setState(2134);
					match(LPAREN);
					setState(2135);
					keyList();
					setState(2136);
					match(RPAREN);
					}
				}

				setState(2140);
				expression();
				setState(2142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(2141);
					expression();
					}
					break;
				}
				setState(2146);
				_la = _input.LA(1);
				if (_la==HELP) {
					{
					setState(2144);
					match(HELP);
					setState(2145);
					numericConstant();
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenuInsideStatementContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(fglParser.NEXT, 0); }
		public TerminalNode OPTION() { return getToken(fglParser.OPTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(fglParser.ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public TerminalNode SHOW() { return getToken(fglParser.SHOW, 0); }
		public TerminalNode HIDE() { return getToken(fglParser.HIDE, 0); }
		public TerminalNode CONTINUE() { return getToken(fglParser.CONTINUE, 0); }
		public TerminalNode MENU() { return getToken(fglParser.MENU, 0); }
		public TerminalNode EXIT() { return getToken(fglParser.EXIT, 0); }
		public MenuInsideStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuInsideStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterMenuInsideStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitMenuInsideStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitMenuInsideStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenuInsideStatementContext menuInsideStatement() throws RecognitionException {
		MenuInsideStatementContext _localctx = new MenuInsideStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_menuInsideStatement);
		int _la;
		try {
			setState(2193);
			switch (_input.LA(1)) {
			case NEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2150);
				match(NEXT);
				setState(2151);
				match(OPTION);
				setState(2154);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case AVG:
				case COLUMN:
				case COUNT:
				case CURRENT:
				case DATE:
				case DAY:
				case EXTEND:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INFIELD:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MAX:
				case MDY:
				case MIN:
				case MONTH:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case PAGENO:
				case PREPARE:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case SUM:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case YEAR:
				case PLUS:
				case MINUS:
				case LPAREN:
				case IDENT:
				case STRING_LITERAL:
				case NUM_INT:
				case NUM_REAL:
					{
					setState(2152);
					expression();
					}
					break;
				case ALL:
					{
					setState(2153);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2156);
					match(COMMA);
					setState(2157);
					expression();
					}
					}
					setState(2162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(2163);
				match(SHOW);
				setState(2164);
				match(OPTION);
				setState(2167);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case AVG:
				case COLUMN:
				case COUNT:
				case CURRENT:
				case DATE:
				case DAY:
				case EXTEND:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INFIELD:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MAX:
				case MDY:
				case MIN:
				case MONTH:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case PAGENO:
				case PREPARE:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case SUM:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case YEAR:
				case PLUS:
				case MINUS:
				case LPAREN:
				case IDENT:
				case STRING_LITERAL:
				case NUM_INT:
				case NUM_REAL:
					{
					setState(2165);
					expression();
					}
					break;
				case ALL:
					{
					setState(2166);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2169);
					match(COMMA);
					setState(2170);
					expression();
					}
					}
					setState(2175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case HIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2176);
				match(HIDE);
				setState(2177);
				match(OPTION);
				setState(2180);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case AVG:
				case COLUMN:
				case COUNT:
				case CURRENT:
				case DATE:
				case DAY:
				case EXTEND:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INFIELD:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MAX:
				case MDY:
				case MIN:
				case MONTH:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case PAGENO:
				case PREPARE:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case SUM:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case YEAR:
				case PLUS:
				case MINUS:
				case LPAREN:
				case IDENT:
				case STRING_LITERAL:
				case NUM_INT:
				case NUM_REAL:
					{
					setState(2178);
					expression();
					}
					break;
				case ALL:
					{
					setState(2179);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2182);
					match(COMMA);
					setState(2183);
					expression();
					}
					}
					setState(2188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2189);
				match(CONTINUE);
				setState(2190);
				match(MENU);
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2191);
				match(EXIT);
				setState(2192);
				match(MENU);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenuGroupStatementContext extends ParserRuleContext {
		public MenuEventsContext menuEvents() {
			return getRuleContext(MenuEventsContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public MenuGroupStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuGroupStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterMenuGroupStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitMenuGroupStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitMenuGroupStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenuGroupStatementContext menuGroupStatement() throws RecognitionException {
		MenuGroupStatementContext _localctx = new MenuGroupStatementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_menuGroupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2195);
			menuEvents();
			setState(2197);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALLOCATE) | (1L << ASCII) | (1L << ASSIGN) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONNECT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DEALLOCATE - 67)) | (1L << (DECLARE - 67)) | (1L << (DELETE - 67)) | (1L << (DISPLAY - 67)) | (1L << (DROP - 67)) | (1L << (ERROR - 67)) | (1L << (EXECUTE - 67)) | (1L << (EXIT - 67)) | (1L << (FALSE - 67)) | (1L << (FETCH - 67)) | (1L << (FINISH - 67)) | (1L << (FIRST - 67)) | (1L << (FLUSH - 67)) | (1L << (FOR - 67)) | (1L << (FOUND - 67)) | (1L << (FREE - 67)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (GOTO - 132)) | (1L << (GROUP - 132)) | (1L << (HIDE - 132)) | (1L << (IF - 132)) | (1L << (INDEX - 132)) | (1L << (INITIALIZE - 132)) | (1L << (INPUT - 132)) | (1L << (INSERT - 132)) | (1L << (INT_FLAG - 132)) | (1L << (INTERRUPT - 132)) | (1L << (LAST - 132)) | (1L << (LENGTH - 132)) | (1L << (LINENO - 132)) | (1L << (LOAD - 132)) | (1L << (LOCATE - 132)) | (1L << (LOCK - 132)) | (1L << (MENU - 132)) | (1L << (MESSAGE - 132)) | (1L << (MDY - 132)) | (1L << (NEED - 132)) | (1L << (NEXT - 132)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (NO - 198)) | (1L << (NOT - 198)) | (1L << (NOTFOUND - 198)) | (1L << (NULL - 198)) | (1L << (OPEN - 198)) | (1L << (OPTIONS - 198)) | (1L << (OUTPUT - 198)) | (1L << (PAGENO - 198)) | (1L << (PAUSE - 198)) | (1L << (PREPARE - 198)) | (1L << (PRINT - 198)) | (1L << (PROMPT - 198)) | (1L << (PUT - 198)) | (1L << (REAL - 198)) | (1L << (RESIZE - 198)) | (1L << (RETURN - 198)) | (1L << (ROLLBACK - 198)) | (1L << (RUN - 198)) | (1L << (SCROLL - 198)) | (1L << (SKIP2 - 198)) | (1L << (SELECT - 198)) | (1L << (SET - 198)) | (1L << (SHOW - 198)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SLEEP - 262)) | (1L << (SQL - 262)) | (1L << (START - 262)) | (1L << (STATUS - 262)) | (1L << (TERMINATE - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (UNLOAD - 262)) | (1L << (UPDATE - 262)) | (1L << (USER - 262)) | (1L << (VALIDATE - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WHENEVER - 262)) | (1L << (WHILE - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT) {
				{
				setState(2196);
				codeBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenuStatementContext extends ParserRuleContext {
		public List<TerminalNode> MENU() { return getTokens(fglParser.MENU); }
		public TerminalNode MENU(int i) {
			return getToken(fglParser.MENU, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public List<MenuGroupStatementContext> menuGroupStatement() {
			return getRuleContexts(MenuGroupStatementContext.class);
		}
		public MenuGroupStatementContext menuGroupStatement(int i) {
			return getRuleContext(MenuGroupStatementContext.class,i);
		}
		public MenuStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterMenuStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitMenuStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitMenuStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenuStatementContext menuStatement() throws RecognitionException {
		MenuStatementContext _localctx = new MenuStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_menuStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2199);
			match(MENU);
			setState(2200);
			expression();
			setState(2204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEFORE || _la==COMMAND) {
				{
				{
				setState(2201);
				menuGroupStatement();
				}
				}
				setState(2206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2207);
			match(END);
			setState(2208);
			match(MENU);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReservedLinePositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(fglParser.FIRST, 0); }
		public TerminalNode PLUS() { return getToken(fglParser.PLUS, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode LAST() { return getToken(fglParser.LAST, 0); }
		public TerminalNode MINUS() { return getToken(fglParser.MINUS, 0); }
		public ReservedLinePositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedLinePosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterReservedLinePosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitReservedLinePosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitReservedLinePosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedLinePositionContext reservedLinePosition() throws RecognitionException {
		ReservedLinePositionContext _localctx = new ReservedLinePositionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_reservedLinePosition);
		int _la;
		try {
			setState(2221);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2210);
				match(FIRST);
				setState(2213);
				_la = _input.LA(1);
				if (_la==PLUS) {
					{
					setState(2211);
					match(PLUS);
					setState(2212);
					numericConstant();
					}
				}

				}
				break;
			case PLUS:
			case MINUS:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2215);
				numericConstant();
				}
				break;
			case LAST:
				enterOuterAlt(_localctx, 3);
				{
				setState(2216);
				match(LAST);
				setState(2219);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2217);
					match(MINUS);
					setState(2218);
					numericConstant();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialWindowAttributeContext extends ParserRuleContext {
		public TerminalNode BLACK() { return getToken(fglParser.BLACK, 0); }
		public TerminalNode BLUE() { return getToken(fglParser.BLUE, 0); }
		public TerminalNode CYAN() { return getToken(fglParser.CYAN, 0); }
		public TerminalNode GREEN() { return getToken(fglParser.GREEN, 0); }
		public TerminalNode MAGENTA() { return getToken(fglParser.MAGENTA, 0); }
		public TerminalNode RED() { return getToken(fglParser.RED, 0); }
		public TerminalNode WHITE() { return getToken(fglParser.WHITE, 0); }
		public TerminalNode YELLOW() { return getToken(fglParser.YELLOW, 0); }
		public TerminalNode BOLD() { return getToken(fglParser.BOLD, 0); }
		public TerminalNode DIM() { return getToken(fglParser.DIM, 0); }
		public TerminalNode NORMAL() { return getToken(fglParser.NORMAL, 0); }
		public TerminalNode INVISIBLE() { return getToken(fglParser.INVISIBLE, 0); }
		public TerminalNode REVERSE() { return getToken(fglParser.REVERSE, 0); }
		public TerminalNode BORDER() { return getToken(fglParser.BORDER, 0); }
		public TerminalNode LINE() { return getToken(fglParser.LINE, 0); }
		public ReservedLinePositionContext reservedLinePosition() {
			return getRuleContext(ReservedLinePositionContext.class,0);
		}
		public TerminalNode PROMPT() { return getToken(fglParser.PROMPT, 0); }
		public TerminalNode FORM() { return getToken(fglParser.FORM, 0); }
		public TerminalNode MENU() { return getToken(fglParser.MENU, 0); }
		public TerminalNode MESSAGE() { return getToken(fglParser.MESSAGE, 0); }
		public TerminalNode COMMENT() { return getToken(fglParser.COMMENT, 0); }
		public TerminalNode OFF() { return getToken(fglParser.OFF, 0); }
		public SpecialWindowAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialWindowAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSpecialWindowAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSpecialWindowAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSpecialWindowAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialWindowAttributeContext specialWindowAttribute() throws RecognitionException {
		SpecialWindowAttributeContext _localctx = new SpecialWindowAttributeContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_specialWindowAttribute);
		int _la;
		try {
			setState(2235);
			switch (_input.LA(1)) {
			case BLACK:
			case BLUE:
			case BOLD:
			case CYAN:
			case DIM:
			case GREEN:
			case INVISIBLE:
			case MAGENTA:
			case NORMAL:
			case RED:
			case WHITE:
			case YELLOW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2223);
				_la = _input.LA(1);
				if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (BLACK - 24)) | (1L << (BLUE - 24)) | (1L << (BOLD - 24)) | (1L << (CYAN - 24)) | (1L << (DIM - 24)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (GREEN - 133)) | (1L << (INVISIBLE - 133)) | (1L << (MAGENTA - 133)))) != 0) || _la==NORMAL || _la==RED || _la==WHITE || _la==YELLOW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case REVERSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2224);
				match(REVERSE);
				}
				break;
			case BORDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2225);
				match(BORDER);
				}
				break;
			case FORM:
			case MENU:
			case MESSAGE:
			case PROMPT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2226);
				_la = _input.LA(1);
				if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (FORM - 120)) | (1L << (MENU - 120)) | (1L << (MESSAGE - 120)))) != 0) || _la==PROMPT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2227);
				match(LINE);
				setState(2228);
				reservedLinePosition();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2229);
				match(COMMENT);
				setState(2230);
				match(LINE);
				setState(2233);
				switch (_input.LA(1)) {
				case FIRST:
				case LAST:
				case PLUS:
				case MINUS:
				case NUM_INT:
				case NUM_REAL:
					{
					setState(2231);
					reservedLinePosition();
					}
					break;
				case OFF:
					{
					setState(2232);
					match(OFF);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowAttributeContext extends ParserRuleContext {
		public List<SpecialWindowAttributeContext> specialWindowAttribute() {
			return getRuleContexts(SpecialWindowAttributeContext.class);
		}
		public SpecialWindowAttributeContext specialWindowAttribute(int i) {
			return getRuleContext(SpecialWindowAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public WindowAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterWindowAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitWindowAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitWindowAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowAttributeContext windowAttribute() throws RecognitionException {
		WindowAttributeContext _localctx = new WindowAttributeContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_windowAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2237);
			specialWindowAttribute();
			setState(2242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2238);
				match(COMMA);
				setState(2239);
				specialWindowAttribute();
				}
				}
				setState(2244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowAttributeListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public WindowAttributeContext windowAttribute() {
			return getRuleContext(WindowAttributeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(fglParser.ATTRIBUTE, 0); }
		public TerminalNode ATTRIBUTES() { return getToken(fglParser.ATTRIBUTES, 0); }
		public WindowAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterWindowAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitWindowAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitWindowAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowAttributeListContext windowAttributeList() throws RecognitionException {
		WindowAttributeListContext _localctx = new WindowAttributeListContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_windowAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2245);
			_la = _input.LA(1);
			if ( !(_la==ATTRIBUTE || _la==ATTRIBUTES) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2246);
			match(LPAREN);
			setState(2247);
			windowAttribute();
			setState(2248);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionStatementContext extends ParserRuleContext {
		public TerminalNode MESSAGE() { return getToken(fglParser.MESSAGE, 0); }
		public TerminalNode LINE() { return getToken(fglParser.LINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PROMPT() { return getToken(fglParser.PROMPT, 0); }
		public TerminalNode MENU() { return getToken(fglParser.MENU, 0); }
		public TerminalNode COMMENT() { return getToken(fglParser.COMMENT, 0); }
		public TerminalNode ERROR() { return getToken(fglParser.ERROR, 0); }
		public TerminalNode FORM() { return getToken(fglParser.FORM, 0); }
		public TerminalNode INPUT() { return getToken(fglParser.INPUT, 0); }
		public TerminalNode INSERT() { return getToken(fglParser.INSERT, 0); }
		public TerminalNode KEY() { return getToken(fglParser.KEY, 0); }
		public TerminalNode DELETE() { return getToken(fglParser.DELETE, 0); }
		public TerminalNode NEXT() { return getToken(fglParser.NEXT, 0); }
		public TerminalNode PREVIOUS() { return getToken(fglParser.PREVIOUS, 0); }
		public TerminalNode ACCEPT() { return getToken(fglParser.ACCEPT, 0); }
		public TerminalNode HELP() { return getToken(fglParser.HELP, 0); }
		public TerminalNode FILE() { return getToken(fglParser.FILE, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public TerminalNode DISPLAY() { return getToken(fglParser.DISPLAY, 0); }
		public TerminalNode SQL() { return getToken(fglParser.SQL, 0); }
		public TerminalNode INTERRUPT() { return getToken(fglParser.INTERRUPT, 0); }
		public TerminalNode FIELD() { return getToken(fglParser.FIELD, 0); }
		public TerminalNode ORDER() { return getToken(fglParser.ORDER, 0); }
		public TerminalNode ON() { return getToken(fglParser.ON, 0); }
		public TerminalNode OFF() { return getToken(fglParser.OFF, 0); }
		public TerminalNode CONSTRAINED() { return getToken(fglParser.CONSTRAINED, 0); }
		public TerminalNode UNCONSTRAINED() { return getToken(fglParser.UNCONSTRAINED, 0); }
		public TerminalNode WRAP() { return getToken(fglParser.WRAP, 0); }
		public TerminalNode NO() { return getToken(fglParser.NO, 0); }
		public OptionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterOptionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitOptionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitOptionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionStatementContext optionStatement() throws RecognitionException {
		OptionStatementContext _localctx = new OptionStatementContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_optionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(2250);
				match(MESSAGE);
				setState(2251);
				match(LINE);
				setState(2252);
				expression();
				}
				break;
			case 2:
				{
				setState(2253);
				match(PROMPT);
				setState(2254);
				match(LINE);
				setState(2255);
				expression();
				}
				break;
			case 3:
				{
				setState(2256);
				match(MENU);
				setState(2257);
				match(LINE);
				setState(2258);
				expression();
				}
				break;
			case 4:
				{
				setState(2259);
				match(COMMENT);
				setState(2260);
				match(LINE);
				setState(2261);
				expression();
				}
				break;
			case 5:
				{
				setState(2262);
				match(ERROR);
				setState(2263);
				match(LINE);
				setState(2264);
				expression();
				}
				break;
			case 6:
				{
				setState(2265);
				match(FORM);
				setState(2266);
				match(LINE);
				setState(2267);
				expression();
				}
				break;
			case 7:
				{
				setState(2268);
				match(INPUT);
				setState(2272);
				switch (_input.LA(1)) {
				case WRAP:
					{
					setState(2269);
					match(WRAP);
					}
					break;
				case NO:
					{
					setState(2270);
					match(NO);
					setState(2271);
					match(WRAP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				{
				setState(2274);
				match(INSERT);
				setState(2275);
				match(KEY);
				setState(2276);
				expression();
				}
				break;
			case 9:
				{
				setState(2277);
				match(DELETE);
				setState(2278);
				match(KEY);
				setState(2279);
				expression();
				}
				break;
			case 10:
				{
				setState(2280);
				match(NEXT);
				setState(2281);
				match(KEY);
				setState(2282);
				expression();
				}
				break;
			case 11:
				{
				setState(2283);
				match(PREVIOUS);
				setState(2284);
				match(KEY);
				setState(2285);
				expression();
				}
				break;
			case 12:
				{
				setState(2286);
				match(ACCEPT);
				setState(2287);
				match(KEY);
				setState(2288);
				expression();
				}
				break;
			case 13:
				{
				setState(2289);
				match(HELP);
				setState(2290);
				match(FILE);
				setState(2291);
				expression();
				}
				break;
			case 14:
				{
				setState(2292);
				match(HELP);
				setState(2293);
				match(KEY);
				setState(2294);
				expression();
				}
				break;
			case 15:
				{
				setState(2295);
				match(INPUT);
				setState(2296);
				attributeList();
				}
				break;
			case 16:
				{
				setState(2297);
				match(DISPLAY);
				setState(2298);
				attributeList();
				}
				break;
			case 17:
				{
				setState(2299);
				match(SQL);
				setState(2300);
				match(INTERRUPT);
				setState(2301);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 18:
				{
				setState(2302);
				match(FIELD);
				setState(2303);
				match(ORDER);
				setState(2304);
				_la = _input.LA(1);
				if ( !(_la==CONSTRAINED || _la==UNCONSTRAINED) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionsStatementContext extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(fglParser.OPTIONS, 0); }
		public List<OptionStatementContext> optionStatement() {
			return getRuleContexts(OptionStatementContext.class);
		}
		public OptionStatementContext optionStatement(int i) {
			return getRuleContext(OptionStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public OptionsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterOptionsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitOptionsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitOptionsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionsStatementContext optionsStatement() throws RecognitionException {
		OptionsStatementContext _localctx = new OptionsStatementContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_optionsStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2307);
			match(OPTIONS);
			setState(2308);
			optionStatement();
			setState(2313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2309);
				match(COMMA);
				setState(2310);
				optionStatement();
				}
				}
				setState(2315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScreenStatementContext extends ParserRuleContext {
		public TerminalNode CLEAR() { return getToken(fglParser.CLEAR, 0); }
		public TerminalNode FORM() { return getToken(fglParser.FORM, 0); }
		public TerminalNode WINDOW() { return getToken(fglParser.WINDOW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SCREEN() { return getToken(fglParser.SCREEN, 0); }
		public List<FieldListContext> fieldList() {
			return getRuleContexts(FieldListContext.class);
		}
		public FieldListContext fieldList(int i) {
			return getRuleContext(FieldListContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(fglParser.CLOSE, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public ConstructStatementContext constructStatement() {
			return getRuleContext(ConstructStatementContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(fglParser.CURRENT, 0); }
		public TerminalNode IS() { return getToken(fglParser.IS, 0); }
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public DisplayArrayStatementContext displayArrayStatement() {
			return getRuleContext(DisplayArrayStatementContext.class,0);
		}
		public TerminalNode DISPLAY() { return getToken(fglParser.DISPLAY, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public ErrorStatementContext errorStatement() {
			return getRuleContext(ErrorStatementContext.class,0);
		}
		public MessageStatementContext messageStatement() {
			return getRuleContext(MessageStatementContext.class,0);
		}
		public PromptStatementContext promptStatement() {
			return getRuleContext(PromptStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public InputArrayStatementContext inputArrayStatement() {
			return getRuleContext(InputArrayStatementContext.class,0);
		}
		public MenuStatementContext menuStatement() {
			return getRuleContext(MenuStatementContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(fglParser.OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(fglParser.FROM, 0); }
		public TerminalNode AT() { return getToken(fglParser.AT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(fglParser.WITH, 0); }
		public TerminalNode ROWS() { return getToken(fglParser.ROWS, 0); }
		public TerminalNode COLUMNS() { return getToken(fglParser.COLUMNS, 0); }
		public WindowAttributeListContext windowAttributeList() {
			return getRuleContext(WindowAttributeListContext.class,0);
		}
		public OptionsStatementContext optionsStatement() {
			return getRuleContext(OptionsStatementContext.class,0);
		}
		public TerminalNode SCROLL() { return getToken(fglParser.SCROLL, 0); }
		public TerminalNode UP() { return getToken(fglParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(fglParser.DOWN, 0); }
		public TerminalNode BY() { return getToken(fglParser.BY, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public ScreenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_screenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterScreenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitScreenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitScreenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScreenStatementContext screenStatement() throws RecognitionException {
		ScreenStatementContext _localctx = new ScreenStatementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_screenStatement);
		int _la;
		try {
			setState(2405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2316);
				match(CLEAR);
				setState(2325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(2317);
					match(FORM);
					}
					break;
				case 2:
					{
					setState(2318);
					match(WINDOW);
					setState(2319);
					identifier();
					}
					break;
				case 3:
					{
					setState(2321);
					_la = _input.LA(1);
					if (_la==WINDOW) {
						{
						setState(2320);
						match(WINDOW);
						}
					}

					setState(2323);
					match(SCREEN);
					}
					break;
				case 4:
					{
					setState(2324);
					fieldList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2327);
				match(CLOSE);
				setState(2328);
				match(WINDOW);
				setState(2329);
				identifier();
				setState(2330);
				eol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2332);
				match(CLOSE);
				setState(2333);
				match(FORM);
				setState(2334);
				identifier();
				setState(2335);
				eol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2337);
				constructStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2338);
				match(CURRENT);
				setState(2339);
				match(WINDOW);
				setState(2340);
				match(IS);
				setState(2343);
				switch (_input.LA(1)) {
				case SCREEN:
					{
					setState(2341);
					match(SCREEN);
					}
					break;
				case IDENT:
					{
					setState(2342);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2345);
				eol();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2346);
				displayStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2347);
				displayArrayStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2348);
				match(DISPLAY);
				setState(2349);
				match(FORM);
				setState(2350);
				identifier();
				setState(2352);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
					{
					setState(2351);
					attributeList();
					}
				}

				setState(2354);
				eol();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2356);
				errorStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2357);
				messageStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2358);
				promptStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2359);
				inputStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2360);
				inputArrayStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2361);
				menuStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2362);
				match(OPEN);
				setState(2363);
				match(FORM);
				setState(2364);
				expression();
				setState(2365);
				match(FROM);
				setState(2366);
				expression();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2368);
				match(OPEN);
				setState(2369);
				match(WINDOW);
				setState(2370);
				expression();
				setState(2371);
				match(AT);
				setState(2372);
				expression();
				setState(2373);
				match(COMMA);
				setState(2374);
				expression();
				setState(2385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2375);
					match(WITH);
					setState(2376);
					match(FORM);
					setState(2377);
					expression();
					}
					break;
				case 2:
					{
					setState(2378);
					match(WITH);
					setState(2379);
					expression();
					setState(2380);
					match(ROWS);
					setState(2381);
					match(COMMA);
					setState(2382);
					expression();
					setState(2383);
					match(COLUMNS);
					}
					break;
				}
				setState(2388);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
					{
					setState(2387);
					windowAttributeList();
					}
				}

				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2390);
				optionsStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2391);
				match(SCROLL);
				setState(2392);
				fieldList();
				setState(2397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2393);
					match(COMMA);
					setState(2394);
					fieldList();
					}
					}
					setState(2399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2400);
				_la = _input.LA(1);
				if ( !(_la==DOWN || _la==UP) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2403);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(2401);
					match(BY);
					setState(2402);
					numericConstant();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlStatementsContext extends ParserRuleContext {
		public CursorManipulationStatementContext cursorManipulationStatement() {
			return getRuleContext(CursorManipulationStatementContext.class,0);
		}
		public DataDefinitionStatementContext dataDefinitionStatement() {
			return getRuleContext(DataDefinitionStatementContext.class,0);
		}
		public DataManipulationStatementContext dataManipulationStatement() {
			return getRuleContext(DataManipulationStatementContext.class,0);
		}
		public DynamicManagementStatementContext dynamicManagementStatement() {
			return getRuleContext(DynamicManagementStatementContext.class,0);
		}
		public QueryOptimizationStatementContext queryOptimizationStatement() {
			return getRuleContext(QueryOptimizationStatementContext.class,0);
		}
		public DataIntegrityStatementContext dataIntegrityStatement() {
			return getRuleContext(DataIntegrityStatementContext.class,0);
		}
		public ClientServerStatementContext clientServerStatement() {
			return getRuleContext(ClientServerStatementContext.class,0);
		}
		public SqlStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementsContext sqlStatements() throws RecognitionException {
		SqlStatementsContext _localctx = new SqlStatementsContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_sqlStatements);
		try {
			setState(2414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2407);
				cursorManipulationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2408);
				dataDefinitionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2409);
				dataManipulationStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2410);
				dynamicManagementStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2411);
				queryOptimizationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2412);
				dataIntegrityStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2413);
				clientServerStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CursorManipulationStatementContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(fglParser.CLOSE, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode DECLARE() { return getToken(fglParser.DECLARE, 0); }
		public TerminalNode CURSOR() { return getToken(fglParser.CURSOR, 0); }
		public List<TerminalNode> FOR() { return getTokens(fglParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(fglParser.FOR, i);
		}
		public TerminalNode SCROLL() { return getToken(fglParser.SCROLL, 0); }
		public SqlSelectStatementContext sqlSelectStatement() {
			return getRuleContext(SqlSelectStatementContext.class,0);
		}
		public SqlInsertStatementContext sqlInsertStatement() {
			return getRuleContext(SqlInsertStatementContext.class,0);
		}
		public StatementIdContext statementId() {
			return getRuleContext(StatementIdContext.class,0);
		}
		public TerminalNode WITH() { return getToken(fglParser.WITH, 0); }
		public TerminalNode HOLD() { return getToken(fglParser.HOLD, 0); }
		public TerminalNode UPDATE() { return getToken(fglParser.UPDATE, 0); }
		public TerminalNode OF() { return getToken(fglParser.OF, 0); }
		public ColumnsListContext columnsList() {
			return getRuleContext(ColumnsListContext.class,0);
		}
		public TerminalNode FETCH() { return getToken(fglParser.FETCH, 0); }
		public TerminalNode NEXT() { return getToken(fglParser.NEXT, 0); }
		public TerminalNode FIRST() { return getToken(fglParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(fglParser.LAST, 0); }
		public TerminalNode CURRENT() { return getToken(fglParser.CURRENT, 0); }
		public TerminalNode RELATIVE() { return getToken(fglParser.RELATIVE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ABSOLUTE() { return getToken(fglParser.ABSOLUTE, 0); }
		public TerminalNode INTO() { return getToken(fglParser.INTO, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public TerminalNode PREVIOUS() { return getToken(fglParser.PREVIOUS, 0); }
		public TerminalNode PRIOR() { return getToken(fglParser.PRIOR, 0); }
		public TerminalNode FLUSH() { return getToken(fglParser.FLUSH, 0); }
		public TerminalNode OPEN() { return getToken(fglParser.OPEN, 0); }
		public TerminalNode USING() { return getToken(fglParser.USING, 0); }
		public TerminalNode PUT() { return getToken(fglParser.PUT, 0); }
		public TerminalNode FROM() { return getToken(fglParser.FROM, 0); }
		public VariableOrConstantListContext variableOrConstantList() {
			return getRuleContext(VariableOrConstantListContext.class,0);
		}
		public CursorManipulationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorManipulationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterCursorManipulationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitCursorManipulationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitCursorManipulationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursorManipulationStatementContext cursorManipulationStatement() throws RecognitionException {
		CursorManipulationStatementContext _localctx = new CursorManipulationStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_cursorManipulationStatement);
		int _la;
		try {
			setState(2487);
			switch (_input.LA(1)) {
			case CLOSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2416);
				match(CLOSE);
				setState(2417);
				cursorName();
				setState(2418);
				eol();
				}
				break;
			case DECLARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2420);
				match(DECLARE);
				setState(2421);
				cursorName();
				setState(2452);
				switch (_input.LA(1)) {
				case CURSOR:
					{
					setState(2422);
					match(CURSOR);
					setState(2425);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(2423);
						match(WITH);
						setState(2424);
						match(HOLD);
						}
					}

					setState(2427);
					match(FOR);
					setState(2439);
					switch (_input.LA(1)) {
					case SELECT:
						{
						setState(2428);
						sqlSelectStatement();
						setState(2435);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
						case 1:
							{
							setState(2429);
							match(FOR);
							setState(2430);
							match(UPDATE);
							setState(2433);
							_la = _input.LA(1);
							if (_la==OF) {
								{
								setState(2431);
								match(OF);
								setState(2432);
								columnsList();
								}
							}

							}
							break;
						}
						}
						break;
					case INSERT:
						{
						setState(2437);
						sqlInsertStatement();
						}
						break;
					case ACCEPT:
					case ASCII:
					case COUNT:
					case CURRENT:
					case FALSE:
					case FIRST:
					case FOUND:
					case GROUP:
					case HIDE:
					case INDEX:
					case INT_FLAG:
					case INTERRUPT:
					case LAST:
					case LENGTH:
					case LINENO:
					case MDY:
					case NO:
					case NOT:
					case NOTFOUND:
					case NULL:
					case PAGENO:
					case REAL:
					case SIZE:
					case SQL:
					case STATUS:
					case TEMP:
					case TIME:
					case TODAY:
					case TRUE:
					case USER:
					case WEEKDAY:
					case WAIT:
					case WORK:
					case IDENT:
						{
						setState(2438);
						statementId();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case SCROLL:
					{
					setState(2441);
					match(SCROLL);
					setState(2442);
					match(CURSOR);
					setState(2445);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(2443);
						match(WITH);
						setState(2444);
						match(HOLD);
						}
					}

					setState(2447);
					match(FOR);
					setState(2450);
					switch (_input.LA(1)) {
					case SELECT:
						{
						setState(2448);
						sqlSelectStatement();
						}
						break;
					case ACCEPT:
					case ASCII:
					case COUNT:
					case CURRENT:
					case FALSE:
					case FIRST:
					case FOUND:
					case GROUP:
					case HIDE:
					case INDEX:
					case INT_FLAG:
					case INTERRUPT:
					case LAST:
					case LENGTH:
					case LINENO:
					case MDY:
					case NO:
					case NOT:
					case NOTFOUND:
					case NULL:
					case PAGENO:
					case REAL:
					case SIZE:
					case SQL:
					case STATUS:
					case TEMP:
					case TIME:
					case TODAY:
					case TRUE:
					case USER:
					case WEEKDAY:
					case WAIT:
					case WORK:
					case IDENT:
						{
						setState(2449);
						statementId();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(2454);
				match(FETCH);
				setState(2464);
				switch (_input.LA(1)) {
				case NEXT:
					{
					setState(2455);
					match(NEXT);
					}
					break;
				case PREVIOUS:
				case PRIOR:
					{
					setState(2456);
					_la = _input.LA(1);
					if ( !(_la==PREVIOUS || _la==PRIOR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case FIRST:
					{
					setState(2457);
					match(FIRST);
					}
					break;
				case LAST:
					{
					setState(2458);
					match(LAST);
					}
					break;
				case CURRENT:
					{
					setState(2459);
					match(CURRENT);
					}
					break;
				case RELATIVE:
					{
					setState(2460);
					match(RELATIVE);
					setState(2461);
					expression();
					}
					break;
				case ABSOLUTE:
					{
					setState(2462);
					match(ABSOLUTE);
					setState(2463);
					expression();
					}
					break;
				case IDENT:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2466);
				cursorName();
				setState(2469);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(2467);
					match(INTO);
					setState(2468);
					variableList();
					}
				}

				}
				break;
			case FLUSH:
				enterOuterAlt(_localctx, 4);
				{
				setState(2471);
				match(FLUSH);
				setState(2472);
				cursorName();
				setState(2473);
				eol();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(2475);
				match(OPEN);
				setState(2476);
				cursorName();
				setState(2479);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(2477);
					match(USING);
					setState(2478);
					variableList();
					}
				}

				}
				break;
			case PUT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2481);
				match(PUT);
				setState(2482);
				cursorName();
				setState(2485);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(2483);
					match(FROM);
					setState(2484);
					variableOrConstantList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsListContext extends ParserRuleContext {
		public List<ColumnsTableIdContext> columnsTableId() {
			return getRuleContexts(ColumnsTableIdContext.class);
		}
		public ColumnsTableIdContext columnsTableId(int i) {
			return getRuleContext(ColumnsTableIdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public ColumnsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterColumnsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitColumnsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitColumnsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsListContext columnsList() throws RecognitionException {
		ColumnsListContext _localctx = new ColumnsListContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_columnsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2489);
			columnsTableId();
			setState(2494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2490);
				match(COMMA);
				setState(2491);
				columnsTableId();
				}
				}
				setState(2496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementIdContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public StatementIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterStatementId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitStatementId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitStatementId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementIdContext statementId() throws RecognitionException {
		StatementIdContext _localctx = new StatementIdContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_statementId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2497);
			constantIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CursorNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CursorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterCursorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitCursorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitCursorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursorNameContext cursorName() throws RecognitionException {
		CursorNameContext _localctx = new CursorNameContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_cursorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2499);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_dataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2501);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnItemContext extends ParserRuleContext {
		public List<ConstantIdentifierContext> constantIdentifier() {
			return getRuleContexts(ConstantIdentifierContext.class);
		}
		public ConstantIdentifierContext constantIdentifier(int i) {
			return getRuleContext(ConstantIdentifierContext.class,i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode BYTE() { return getToken(fglParser.BYTE, 0); }
		public TerminalNode TEXT() { return getToken(fglParser.TEXT, 0); }
		public TerminalNode NOT() { return getToken(fglParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(fglParser.NULL, 0); }
		public TerminalNode IN() { return getToken(fglParser.IN, 0); }
		public TerminalNode TABLE() { return getToken(fglParser.TABLE, 0); }
		public TerminalNode UNIQUE() { return getToken(fglParser.UNIQUE, 0); }
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public TerminalNode CONSTRAINT() { return getToken(fglParser.CONSTRAINT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public ColumnItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterColumnItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitColumnItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitColumnItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnItemContext columnItem() throws RecognitionException {
		ColumnItemContext _localctx = new ColumnItemContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_columnItem);
		int _la;
		try {
			setState(2536);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2503);
				constantIdentifier();
				setState(2513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(2504);
					dataType();
					}
					break;
				case 2:
					{
					setState(2505);
					_la = _input.LA(1);
					if ( !(_la==BYTE || _la==TEXT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2511);
					_la = _input.LA(1);
					if (_la==IN) {
						{
						setState(2506);
						match(IN);
						setState(2509);
						switch (_input.LA(1)) {
						case TABLE:
							{
							setState(2507);
							match(TABLE);
							}
							break;
						case ACCEPT:
						case ASCII:
						case COUNT:
						case CURRENT:
						case FALSE:
						case FIRST:
						case FOUND:
						case GROUP:
						case HIDE:
						case INDEX:
						case INT_FLAG:
						case INTERRUPT:
						case LAST:
						case LENGTH:
						case LINENO:
						case MDY:
						case NO:
						case NOT:
						case NOTFOUND:
						case NULL:
						case PAGENO:
						case REAL:
						case SIZE:
						case SQL:
						case STATUS:
						case TEMP:
						case TIME:
						case TODAY:
						case TRUE:
						case USER:
						case WEEKDAY:
						case WAIT:
						case WORK:
						case IDENT:
							{
							setState(2508);
							constantIdentifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
					}

					}
					break;
				}
				setState(2517);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2515);
					match(NOT);
					setState(2516);
					match(NULL);
					}
				}

				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2519);
				match(UNIQUE);
				setState(2520);
				match(LPAREN);
				setState(2529);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ASCII) | (1L << COUNT) | (1L << CURRENT))) != 0) || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (FALSE - 109)) | (1L << (FIRST - 109)) | (1L << (FOUND - 109)) | (1L << (GROUP - 109)) | (1L << (HIDE - 109)) | (1L << (INDEX - 109)) | (1L << (INT_FLAG - 109)) | (1L << (INTERRUPT - 109)) | (1L << (LAST - 109)) | (1L << (LENGTH - 109)) | (1L << (LINENO - 109)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (MDY - 184)) | (1L << (NO - 184)) | (1L << (NOT - 184)) | (1L << (NOTFOUND - 184)) | (1L << (NULL - 184)) | (1L << (PAGENO - 184)) | (1L << (REAL - 184)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SQL - 262)) | (1L << (STATUS - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (USER - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WORK - 262)))) != 0) || _la==IDENT) {
					{
					setState(2521);
					constantIdentifier();
					setState(2526);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2522);
						match(COMMA);
						setState(2523);
						constantIdentifier();
						}
						}
						setState(2528);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2531);
				match(RPAREN);
				setState(2534);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(2532);
					match(CONSTRAINT);
					setState(2533);
					constantIdentifier();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDefinitionStatementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(fglParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(fglParser.TABLE, 0); }
		public List<ConstantIdentifierContext> constantIdentifier() {
			return getRuleContexts(ConstantIdentifierContext.class);
		}
		public ConstantIdentifierContext constantIdentifier(int i) {
			return getRuleContext(ConstantIdentifierContext.class,i);
		}
		public TerminalNode CREATE() { return getToken(fglParser.CREATE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(fglParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(fglParser.LPAREN, i);
		}
		public List<ColumnItemContext> columnItem() {
			return getRuleContexts(ColumnItemContext.class);
		}
		public ColumnItemContext columnItem(int i) {
			return getRuleContext(ColumnItemContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(fglParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(fglParser.RPAREN, i);
		}
		public TerminalNode TEMP() { return getToken(fglParser.TEMP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(fglParser.WITH, 0); }
		public TerminalNode NO() { return getToken(fglParser.NO, 0); }
		public TerminalNode LOG() { return getToken(fglParser.LOG, 0); }
		public TerminalNode IN() { return getToken(fglParser.IN, 0); }
		public TerminalNode EXTENT() { return getToken(fglParser.EXTENT, 0); }
		public List<TerminalNode> SIZE() { return getTokens(fglParser.SIZE); }
		public TerminalNode SIZE(int i) {
			return getToken(fglParser.SIZE, i);
		}
		public List<NumericConstantContext> numericConstant() {
			return getRuleContexts(NumericConstantContext.class);
		}
		public NumericConstantContext numericConstant(int i) {
			return getRuleContext(NumericConstantContext.class,i);
		}
		public TerminalNode NEXT() { return getToken(fglParser.NEXT, 0); }
		public TerminalNode LOCK() { return getToken(fglParser.LOCK, 0); }
		public TerminalNode MODE() { return getToken(fglParser.MODE, 0); }
		public TerminalNode PAGE() { return getToken(fglParser.PAGE, 0); }
		public TerminalNode ROW() { return getToken(fglParser.ROW, 0); }
		public TerminalNode INDEX() { return getToken(fglParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(fglParser.ON, 0); }
		public TerminalNode UNIQUE() { return getToken(fglParser.UNIQUE, 0); }
		public TerminalNode CLUSTER() { return getToken(fglParser.CLUSTER, 0); }
		public List<TerminalNode> ASC() { return getTokens(fglParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(fglParser.ASC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(fglParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(fglParser.DESC, i);
		}
		public TerminalNode CONNECT() { return getToken(fglParser.CONNECT, 0); }
		public DataDefinitionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDefinitionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDataDefinitionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDataDefinitionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDataDefinitionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDefinitionStatementContext dataDefinitionStatement() throws RecognitionException {
		DataDefinitionStatementContext _localctx = new DataDefinitionStatementContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_dataDefinitionStatement);
		int _la;
		try {
			setState(2616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2538);
				match(DROP);
				setState(2539);
				match(TABLE);
				setState(2540);
				constantIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2541);
				match(CREATE);
				setState(2543);
				_la = _input.LA(1);
				if (_la==TEMP) {
					{
					setState(2542);
					match(TEMP);
					}
				}

				setState(2545);
				match(TABLE);
				setState(2546);
				constantIdentifier();
				setState(2547);
				match(LPAREN);
				setState(2548);
				columnItem();
				setState(2553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2549);
					match(COMMA);
					setState(2550);
					columnItem();
					}
					}
					setState(2555);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2556);
				match(RPAREN);
				setState(2560);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2557);
					match(WITH);
					setState(2558);
					match(NO);
					setState(2559);
					match(LOG);
					}
				}

				setState(2564);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(2562);
					match(IN);
					setState(2563);
					constantIdentifier();
					}
				}

				setState(2569);
				_la = _input.LA(1);
				if (_la==EXTENT) {
					{
					setState(2566);
					match(EXTENT);
					setState(2567);
					match(SIZE);
					setState(2568);
					numericConstant();
					}
				}

				setState(2574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
				case 1:
					{
					setState(2571);
					match(NEXT);
					setState(2572);
					match(SIZE);
					setState(2573);
					numericConstant();
					}
					break;
				}
				setState(2581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2576);
					match(LOCK);
					setState(2577);
					match(MODE);
					setState(2578);
					match(LPAREN);
					setState(2579);
					_la = _input.LA(1);
					if ( !(_la==PAGE || _la==ROW) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2580);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2583);
				match(CREATE);
				setState(2585);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(2584);
					match(UNIQUE);
					}
				}

				setState(2588);
				_la = _input.LA(1);
				if (_la==CLUSTER) {
					{
					setState(2587);
					match(CLUSTER);
					}
				}

				setState(2590);
				match(INDEX);
				setState(2591);
				constantIdentifier();
				setState(2592);
				match(ON);
				setState(2593);
				constantIdentifier();
				setState(2594);
				match(LPAREN);
				setState(2595);
				constantIdentifier();
				setState(2597);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(2596);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(2606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2599);
					match(COMMA);
					setState(2600);
					constantIdentifier();
					setState(2602);
					_la = _input.LA(1);
					if (_la==ASC || _la==DESC) {
						{
						setState(2601);
						_la = _input.LA(1);
						if ( !(_la==ASC || _la==DESC) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
					}

					}
					}
					setState(2608);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2609);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2611);
				match(DROP);
				setState(2612);
				match(INDEX);
				setState(2613);
				constantIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2614);
				match(CONNECT);
				setState(2615);
				constantIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataManipulationStatementContext extends ParserRuleContext {
		public SqlInsertStatementContext sqlInsertStatement() {
			return getRuleContext(SqlInsertStatementContext.class,0);
		}
		public SqlDeleteStatementContext sqlDeleteStatement() {
			return getRuleContext(SqlDeleteStatementContext.class,0);
		}
		public SqlSelectStatementContext sqlSelectStatement() {
			return getRuleContext(SqlSelectStatementContext.class,0);
		}
		public SqlUpdateStatementContext sqlUpdateStatement() {
			return getRuleContext(SqlUpdateStatementContext.class,0);
		}
		public SqlLoadStatementContext sqlLoadStatement() {
			return getRuleContext(SqlLoadStatementContext.class,0);
		}
		public SqlUnLoadStatementContext sqlUnLoadStatement() {
			return getRuleContext(SqlUnLoadStatementContext.class,0);
		}
		public DataManipulationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataManipulationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDataManipulationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDataManipulationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDataManipulationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataManipulationStatementContext dataManipulationStatement() throws RecognitionException {
		DataManipulationStatementContext _localctx = new DataManipulationStatementContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_dataManipulationStatement);
		try {
			setState(2624);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2618);
				sqlInsertStatement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2619);
				sqlDeleteStatement();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2620);
				sqlSelectStatement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2621);
				sqlUpdateStatement();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 5);
				{
				setState(2622);
				sqlLoadStatement();
				}
				break;
			case UNLOAD:
				enterOuterAlt(_localctx, 6);
				{
				setState(2623);
				sqlUnLoadStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlSelectStatementContext extends ParserRuleContext {
		public MainSelectStatementContext mainSelectStatement() {
			return getRuleContext(MainSelectStatementContext.class,0);
		}
		public SqlSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlSelectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlSelectStatementContext sqlSelectStatement() throws RecognitionException {
		SqlSelectStatementContext _localctx = new SqlSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_sqlSelectStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2626);
			mainSelectStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsTableIdContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(fglParser.STAR, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(fglParser.DOT, 0); }
		public ColumnsTableIdContext columnsTableId() {
			return getRuleContext(ColumnsTableIdContext.class,0);
		}
		public IndexingVariableContext indexingVariable() {
			return getRuleContext(IndexingVariableContext.class,0);
		}
		public ColumnsTableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsTableId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterColumnsTableId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitColumnsTableId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitColumnsTableId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsTableIdContext columnsTableId() throws RecognitionException {
		ColumnsTableIdContext _localctx = new ColumnsTableIdContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_columnsTableId);
		int _la;
		try {
			setState(2639);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2628);
				match(STAR);
				}
				break;
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2629);
				tableIdentifier();
				setState(2631);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(2630);
					indexingVariable();
					}
				}

				}
				setState(2637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
				case 1:
					{
					setState(2633);
					match(DOT);
					setState(2634);
					match(STAR);
					}
					break;
				case 2:
					{
					setState(2635);
					match(DOT);
					setState(2636);
					columnsTableId();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListContext extends ParserRuleContext {
		public List<SqlExpressionContext> sqlExpression() {
			return getRuleContexts(SqlExpressionContext.class);
		}
		public SqlExpressionContext sqlExpression(int i) {
			return getRuleContext(SqlExpressionContext.class,i);
		}
		public List<SqlAliasContext> sqlAlias() {
			return getRuleContexts(SqlAliasContext.class);
		}
		public SqlAliasContext sqlAlias(int i) {
			return getRuleContext(SqlAliasContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_selectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2641);
			sqlExpression();
			setState(2643);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENT) {
				{
				setState(2642);
				sqlAlias();
				}
			}

			setState(2652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2645);
				match(COMMA);
				setState(2646);
				sqlExpression();
				setState(2648);
				_la = _input.LA(1);
				if (_la==AS || _la==IDENT) {
					{
					setState(2647);
					sqlAlias();
					}
				}

				}
				}
				setState(2654);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadSelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(fglParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode ALL() { return getToken(fglParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(fglParser.DISTINCT, 0); }
		public TerminalNode UNIQUE() { return getToken(fglParser.UNIQUE, 0); }
		public HeadSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headSelectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterHeadSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitHeadSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitHeadSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadSelectStatementContext headSelectStatement() throws RecognitionException {
		HeadSelectStatementContext _localctx = new HeadSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_headSelectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2655);
			match(SELECT);
			setState(2658);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2656);
				match(ALL);
				}
				break;
			case DISTINCT:
			case UNIQUE:
				{
				setState(2657);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==UNIQUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case ACCEPT:
			case ASCII:
			case AVG:
			case COUNT:
			case CURRENT:
			case DATE:
			case DAY:
			case DECODE:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MAX:
			case MDY:
			case MIN:
			case MOD:
			case MONTH:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case NVL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case SUM:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case YEAR:
			case PLUS:
			case MINUS:
			case STAR:
			case LPAREN:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2660);
			selectList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableQualifierContext extends ParserRuleContext {
		public List<ConstantIdentifierContext> constantIdentifier() {
			return getRuleContexts(ConstantIdentifierContext.class);
		}
		public ConstantIdentifierContext constantIdentifier(int i) {
			return getRuleContext(ConstantIdentifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(fglParser.COLON, 0); }
		public TerminalNode ATSYMBOL() { return getToken(fglParser.ATSYMBOL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TableQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterTableQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitTableQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitTableQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableQualifierContext tableQualifier() throws RecognitionException {
		TableQualifierContext _localctx = new TableQualifierContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_tableQualifier);
		try {
			setState(2671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2662);
				constantIdentifier();
				setState(2663);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2665);
				constantIdentifier();
				setState(2666);
				match(ATSYMBOL);
				setState(2667);
				constantIdentifier();
				setState(2668);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2670);
				string();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public TableQualifierContext tableQualifier() {
			return getRuleContext(TableQualifierContext.class,0);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				{
				setState(2673);
				tableQualifier();
				}
				break;
			}
			setState(2676);
			constantIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromTableContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode OUTER() { return getToken(fglParser.OUTER, 0); }
		public SqlAliasContext sqlAlias() {
			return getRuleContext(SqlAliasContext.class,0);
		}
		public FromTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitFromTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromTableContext fromTable() throws RecognitionException {
		FromTableContext _localctx = new FromTableContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_fromTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2679);
			_la = _input.LA(1);
			if (_la==OUTER) {
				{
				setState(2678);
				match(OUTER);
				}
			}

			setState(2681);
			tableIdentifier();
			setState(2683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				setState(2682);
				sqlAlias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableExpressionContext extends ParserRuleContext {
		public SimpleSelectStatementContext simpleSelectStatement() {
			return getRuleContext(SimpleSelectStatementContext.class,0);
		}
		public TableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterTableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitTableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitTableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExpressionContext tableExpression() throws RecognitionException {
		TableExpressionContext _localctx = new TableExpressionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_tableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2685);
			simpleSelectStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromSelectStatementContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(fglParser.FROM, 0); }
		public List<FromTableContext> fromTable() {
			return getRuleContexts(FromTableContext.class);
		}
		public FromTableContext fromTable(int i) {
			return getRuleContext(FromTableContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(fglParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(fglParser.LPAREN, i);
		}
		public List<TableExpressionContext> tableExpression() {
			return getRuleContexts(TableExpressionContext.class);
		}
		public TableExpressionContext tableExpression(int i) {
			return getRuleContext(TableExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(fglParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(fglParser.RPAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public List<SqlAliasContext> sqlAlias() {
			return getRuleContexts(SqlAliasContext.class);
		}
		public SqlAliasContext sqlAlias(int i) {
			return getRuleContext(SqlAliasContext.class,i);
		}
		public FromSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSelectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterFromSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitFromSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitFromSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromSelectStatementContext fromSelectStatement() throws RecognitionException {
		FromSelectStatementContext _localctx = new FromSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_fromSelectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2687);
			match(FROM);
			setState(2695);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case OUTER:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
			case STRING_LITERAL:
				{
				setState(2688);
				fromTable();
				}
				break;
			case LPAREN:
				{
				setState(2689);
				match(LPAREN);
				setState(2690);
				tableExpression();
				setState(2691);
				match(RPAREN);
				setState(2693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(2692);
					sqlAlias();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2697);
				match(COMMA);
				setState(2705);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case COUNT:
				case CURRENT:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MDY:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case OUTER:
				case PAGENO:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case IDENT:
				case STRING_LITERAL:
					{
					setState(2698);
					fromTable();
					}
					break;
				case LPAREN:
					{
					setState(2699);
					match(LPAREN);
					setState(2700);
					tableExpression();
					setState(2701);
					match(RPAREN);
					setState(2703);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
					case 1:
						{
						setState(2702);
						sqlAlias();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(2711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasNameContext aliasName() throws RecognitionException {
		AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_aliasName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2712);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainSelectStatementContext extends ParserRuleContext {
		public HeadSelectStatementContext headSelectStatement() {
			return getRuleContext(HeadSelectStatementContext.class,0);
		}
		public FromSelectStatementContext fromSelectStatement() {
			return getRuleContext(FromSelectStatementContext.class,0);
		}
		public List<TerminalNode> INTO() { return getTokens(fglParser.INTO); }
		public TerminalNode INTO(int i) {
			return getToken(fglParser.INTO, i);
		}
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public GroupByStatementContext groupByStatement() {
			return getRuleContext(GroupByStatementContext.class,0);
		}
		public HavingStatementContext havingStatement() {
			return getRuleContext(HavingStatementContext.class,0);
		}
		public UnionSelectStatementContext unionSelectStatement() {
			return getRuleContext(UnionSelectStatementContext.class,0);
		}
		public OrderbyStatementContext orderbyStatement() {
			return getRuleContext(OrderbyStatementContext.class,0);
		}
		public TerminalNode TEMP() { return getToken(fglParser.TEMP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(fglParser.WITH, 0); }
		public TerminalNode NO() { return getToken(fglParser.NO, 0); }
		public TerminalNode LOG() { return getToken(fglParser.LOG, 0); }
		public MainSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainSelectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterMainSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitMainSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitMainSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainSelectStatementContext mainSelectStatement() throws RecognitionException {
		MainSelectStatementContext _localctx = new MainSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_mainSelectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2714);
			headSelectStatement();
			setState(2717);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(2715);
				match(INTO);
				setState(2716);
				variableList();
				}
			}

			setState(2719);
			fromSelectStatement();
			setState(2721);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2720);
				whereStatement();
				}
			}

			setState(2724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
			case 1:
				{
				setState(2723);
				groupByStatement();
				}
				break;
			}
			setState(2727);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(2726);
				havingStatement();
				}
			}

			setState(2730);
			_la = _input.LA(1);
			if (_la==UNION) {
				{
				setState(2729);
				unionSelectStatement();
				}
			}

			setState(2733);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(2732);
				orderbyStatement();
				}
			}

			setState(2738);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(2735);
				match(INTO);
				setState(2736);
				match(TEMP);
				setState(2737);
				identifier();
				}
			}

			setState(2743);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2740);
				match(WITH);
				setState(2741);
				match(NO);
				setState(2742);
				match(LOG);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionSelectStatementContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(fglParser.UNION, 0); }
		public SimpleSelectStatementContext simpleSelectStatement() {
			return getRuleContext(SimpleSelectStatementContext.class,0);
		}
		public TerminalNode ALL() { return getToken(fglParser.ALL, 0); }
		public UnionSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionSelectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterUnionSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitUnionSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitUnionSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionSelectStatementContext unionSelectStatement() throws RecognitionException {
		UnionSelectStatementContext _localctx = new UnionSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_unionSelectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2745);
			match(UNION);
			setState(2747);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(2746);
				match(ALL);
				}
			}

			setState(2749);
			simpleSelectStatement();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleSelectStatementContext extends ParserRuleContext {
		public HeadSelectStatementContext headSelectStatement() {
			return getRuleContext(HeadSelectStatementContext.class,0);
		}
		public FromSelectStatementContext fromSelectStatement() {
			return getRuleContext(FromSelectStatementContext.class,0);
		}
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public GroupByStatementContext groupByStatement() {
			return getRuleContext(GroupByStatementContext.class,0);
		}
		public HavingStatementContext havingStatement() {
			return getRuleContext(HavingStatementContext.class,0);
		}
		public UnionSelectStatementContext unionSelectStatement() {
			return getRuleContext(UnionSelectStatementContext.class,0);
		}
		public SimpleSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSimpleSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSimpleSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSimpleSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectStatementContext simpleSelectStatement() throws RecognitionException {
		SimpleSelectStatementContext _localctx = new SimpleSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_simpleSelectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2751);
			headSelectStatement();
			setState(2752);
			fromSelectStatement();
			setState(2754);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2753);
				whereStatement();
				}
			}

			setState(2757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
			case 1:
				{
				setState(2756);
				groupByStatement();
				}
				break;
			}
			setState(2760);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(2759);
				havingStatement();
				}
			}

			setState(2763);
			_la = _input.LA(1);
			if (_la==UNION) {
				{
				setState(2762);
				unionSelectStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereStatementContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(fglParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterWhereStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitWhereStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitWhereStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereStatementContext whereStatement() throws RecognitionException {
		WhereStatementContext _localctx = new WhereStatementContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_whereStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2765);
			match(WHERE);
			setState(2766);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByStatementContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(fglParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(fglParser.BY, 0); }
		public VariableOrConstantListContext variableOrConstantList() {
			return getRuleContext(VariableOrConstantListContext.class,0);
		}
		public GroupByStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterGroupByStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitGroupByStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitGroupByStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByStatementContext groupByStatement() throws RecognitionException {
		GroupByStatementContext _localctx = new GroupByStatementContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_groupByStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2768);
			match(GROUP);
			setState(2769);
			match(BY);
			setState(2770);
			variableOrConstantList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingStatementContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(fglParser.HAVING, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public HavingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterHavingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitHavingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitHavingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingStatementContext havingStatement() throws RecognitionException {
		HavingStatementContext _localctx = new HavingStatementContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_havingStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2772);
			match(HAVING);
			setState(2773);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderbyColumnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(fglParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(fglParser.DESC, 0); }
		public OrderbyColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderbyColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterOrderbyColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitOrderbyColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitOrderbyColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderbyColumnContext orderbyColumn() throws RecognitionException {
		OrderbyColumnContext _localctx = new OrderbyColumnContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_orderbyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2775);
			expression();
			setState(2777);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2776);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderbyStatementContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(fglParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(fglParser.BY, 0); }
		public List<OrderbyColumnContext> orderbyColumn() {
			return getRuleContexts(OrderbyColumnContext.class);
		}
		public OrderbyColumnContext orderbyColumn(int i) {
			return getRuleContext(OrderbyColumnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public OrderbyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderbyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterOrderbyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitOrderbyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitOrderbyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderbyStatementContext orderbyStatement() throws RecognitionException {
		OrderbyStatementContext _localctx = new OrderbyStatementContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_orderbyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2779);
			match(ORDER);
			setState(2780);
			match(BY);
			setState(2781);
			orderbyColumn();
			setState(2786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2782);
				match(COMMA);
				setState(2783);
				orderbyColumn();
				}
				}
				setState(2788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlLoadStatementContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(fglParser.LOAD, 0); }
		public TerminalNode FROM() { return getToken(fglParser.FROM, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode INSERT() { return getToken(fglParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(fglParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SqlInsertStatementContext sqlInsertStatement() {
			return getRuleContext(SqlInsertStatementContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(fglParser.DELIMITER, 0); }
		public TerminalNode LPAREN() { return getToken(fglParser.LPAREN, 0); }
		public ColumnsListContext columnsList() {
			return getRuleContext(ColumnsListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(fglParser.RPAREN, 0); }
		public SqlLoadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlLoadStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlLoadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlLoadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlLoadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlLoadStatementContext sqlLoadStatement() throws RecognitionException {
		SqlLoadStatementContext _localctx = new SqlLoadStatementContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_sqlLoadStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2789);
			match(LOAD);
			setState(2790);
			match(FROM);
			setState(2793);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
				{
				setState(2791);
				variable();
				}
				break;
			case STRING_LITERAL:
				{
				setState(2792);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2800);
			_la = _input.LA(1);
			if (_la==DELIMITER) {
				{
				setState(2795);
				match(DELIMITER);
				setState(2798);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case COUNT:
				case CURRENT:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MDY:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case PAGENO:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case IDENT:
					{
					setState(2796);
					variable();
					}
					break;
				case STRING_LITERAL:
					{
					setState(2797);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(2812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				{
				setState(2802);
				match(INSERT);
				setState(2803);
				match(INTO);
				setState(2804);
				tableIdentifier();
				setState(2809);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2805);
					match(LPAREN);
					setState(2806);
					columnsList();
					setState(2807);
					match(RPAREN);
					}
				}

				}
				break;
			case 2:
				{
				setState(2811);
				sqlInsertStatement();
				}
				break;
			}
			setState(2814);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlUnLoadStatementContext extends ParserRuleContext {
		public TerminalNode UNLOAD() { return getToken(fglParser.UNLOAD, 0); }
		public TerminalNode TO() { return getToken(fglParser.TO, 0); }
		public SqlSelectStatementContext sqlSelectStatement() {
			return getRuleContext(SqlSelectStatementContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode DELIMITER() { return getToken(fglParser.DELIMITER, 0); }
		public SqlUnLoadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlUnLoadStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlUnLoadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlUnLoadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlUnLoadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlUnLoadStatementContext sqlUnLoadStatement() throws RecognitionException {
		SqlUnLoadStatementContext _localctx = new SqlUnLoadStatementContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_sqlUnLoadStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2816);
			match(UNLOAD);
			setState(2817);
			match(TO);
			setState(2820);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
				{
				setState(2818);
				variable();
				}
				break;
			case STRING_LITERAL:
				{
				setState(2819);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2827);
			_la = _input.LA(1);
			if (_la==DELIMITER) {
				{
				setState(2822);
				match(DELIMITER);
				setState(2825);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case COUNT:
				case CURRENT:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MDY:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case PAGENO:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case IDENT:
					{
					setState(2823);
					variable();
					}
					break;
				case STRING_LITERAL:
					{
					setState(2824);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(2829);
			sqlSelectStatement();
			setState(2830);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlInsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(fglParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(fglParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(fglParser.VALUES, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(fglParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(fglParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(fglParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(fglParser.RPAREN, i);
		}
		public SimpleSelectStatementContext simpleSelectStatement() {
			return getRuleContext(SimpleSelectStatementContext.class,0);
		}
		public ColumnsListContext columnsList() {
			return getRuleContext(ColumnsListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public SqlInsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlInsertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlInsertStatementContext sqlInsertStatement() throws RecognitionException {
		SqlInsertStatementContext _localctx = new SqlInsertStatementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_sqlInsertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2832);
			match(INSERT);
			setState(2833);
			match(INTO);
			setState(2834);
			tableIdentifier();
			setState(2839);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2835);
				match(LPAREN);
				setState(2836);
				columnsList();
				setState(2837);
				match(RPAREN);
				}
			}

			setState(2854);
			switch (_input.LA(1)) {
			case VALUES:
				{
				setState(2841);
				match(VALUES);
				setState(2842);
				match(LPAREN);
				setState(2843);
				expression();
				setState(2848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2844);
					match(COMMA);
					setState(2845);
					expression();
					}
					}
					setState(2850);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2851);
				match(RPAREN);
				}
				break;
			case SELECT:
				{
				setState(2853);
				simpleSelectStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlUpdateStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(fglParser.UPDATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(fglParser.SET, 0); }
		public TerminalNode WHERE() { return getToken(fglParser.WHERE, 0); }
		public List<ColumnsTableIdContext> columnsTableId() {
			return getRuleContexts(ColumnsTableIdContext.class);
		}
		public ColumnsTableIdContext columnsTableId(int i) {
			return getRuleContext(ColumnsTableIdContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(fglParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(fglParser.EQUAL, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(fglParser.CURRENT, 0); }
		public TerminalNode OF() { return getToken(fglParser.OF, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(fglParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(fglParser.LPAREN, i);
		}
		public ColumnsListContext columnsList() {
			return getRuleContext(ColumnsListContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(fglParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(fglParser.RPAREN, i);
		}
		public List<TerminalNode> STAR() { return getTokens(fglParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(fglParser.STAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public List<AliasNameContext> aliasName() {
			return getRuleContexts(AliasNameContext.class);
		}
		public AliasNameContext aliasName(int i) {
			return getRuleContext(AliasNameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(fglParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(fglParser.DOT, i);
		}
		public SqlUpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlUpdateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlUpdateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlUpdateStatementContext sqlUpdateStatement() throws RecognitionException {
		SqlUpdateStatementContext _localctx = new SqlUpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_sqlUpdateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2856);
			match(UPDATE);
			setState(2857);
			tableIdentifier();
			setState(2858);
			match(SET);
			setState(2904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				{
				{
				setState(2859);
				columnsTableId();
				setState(2860);
				match(EQUAL);
				setState(2861);
				expression();
				setState(2869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2862);
					match(COMMA);
					setState(2863);
					columnsTableId();
					setState(2864);
					match(EQUAL);
					setState(2865);
					expression();
					}
					}
					setState(2871);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(2882);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(2872);
					match(LPAREN);
					setState(2873);
					columnsList();
					setState(2874);
					match(RPAREN);
					}
					break;
				case STAR:
				case IDENT:
					{
					setState(2879);
					_la = _input.LA(1);
					if (_la==IDENT) {
						{
						setState(2876);
						aliasName();
						setState(2877);
						match(DOT);
						}
					}

					setState(2881);
					match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2884);
				match(EQUAL);
				setState(2902);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(2885);
					match(LPAREN);
					setState(2886);
					expression();
					setState(2891);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2887);
						match(COMMA);
						setState(2888);
						expression();
						}
						}
						setState(2893);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2894);
					match(RPAREN);
					}
					break;
				case STAR:
				case IDENT:
					{
					setState(2899);
					_la = _input.LA(1);
					if (_la==IDENT) {
						{
						setState(2896);
						aliasName();
						setState(2897);
						match(DOT);
						}
					}

					setState(2901);
					match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			}
			setState(2913);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2906);
				match(WHERE);
				setState(2911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
				case 1:
					{
					setState(2907);
					condition();
					}
					break;
				case 2:
					{
					setState(2908);
					match(CURRENT);
					setState(2909);
					match(OF);
					setState(2910);
					cursorName();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlDeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(fglParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(fglParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(fglParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(fglParser.CURRENT, 0); }
		public TerminalNode OF() { return getToken(fglParser.OF, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public SqlDeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlDeleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSqlDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSqlDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSqlDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlDeleteStatementContext sqlDeleteStatement() throws RecognitionException {
		SqlDeleteStatementContext _localctx = new SqlDeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_sqlDeleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2915);
			match(DELETE);
			setState(2916);
			match(FROM);
			setState(2917);
			tableIdentifier();
			setState(2925);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2918);
				match(WHERE);
				setState(2923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
				case 1:
					{
					setState(2919);
					condition();
					}
					break;
				case 2:
					{
					setState(2920);
					match(CURRENT);
					setState(2921);
					match(OF);
					setState(2922);
					cursorName();
					}
					break;
				}
				}
			}

			setState(2927);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(fglParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(fglParser.COMMA, i);
		}
		public ActualParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterActualParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitActualParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitActualParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterListContext actualParameterList() throws RecognitionException {
		ActualParameterListContext _localctx = new ActualParameterListContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_actualParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2929);
			actualParameter();
			setState(2934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2930);
				match(COMMA);
				setState(2931);
				actualParameter();
				}
				}
				setState(2936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynamicManagementStatementContext extends ParserRuleContext {
		public TerminalNode PREPARE() { return getToken(fglParser.PREPARE, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(fglParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EXECUTE() { return getToken(fglParser.EXECUTE, 0); }
		public TerminalNode USING() { return getToken(fglParser.USING, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public TerminalNode FREE() { return getToken(fglParser.FREE, 0); }
		public StatementIdContext statementId() {
			return getRuleContext(StatementIdContext.class,0);
		}
		public TerminalNode LOCK() { return getToken(fglParser.LOCK, 0); }
		public TerminalNode TABLE() { return getToken(fglParser.TABLE, 0); }
		public TerminalNode IN() { return getToken(fglParser.IN, 0); }
		public TerminalNode MODE() { return getToken(fglParser.MODE, 0); }
		public TerminalNode SHARE() { return getToken(fglParser.SHARE, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(fglParser.EXCLUSIVE, 0); }
		public DynamicManagementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicManagementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDynamicManagementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDynamicManagementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDynamicManagementStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicManagementStatementContext dynamicManagementStatement() throws RecognitionException {
		DynamicManagementStatementContext _localctx = new DynamicManagementStatementContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_dynamicManagementStatement);
		int _la;
		try {
			setState(2960);
			switch (_input.LA(1)) {
			case PREPARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2937);
				match(PREPARE);
				setState(2938);
				cursorName();
				setState(2939);
				match(FROM);
				setState(2940);
				expression();
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2942);
				match(EXECUTE);
				setState(2943);
				cursorName();
				setState(2946);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(2944);
					match(USING);
					setState(2945);
					variableList();
					}
				}

				}
				break;
			case FREE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2948);
				match(FREE);
				setState(2951);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
				case 1:
					{
					setState(2949);
					cursorName();
					}
					break;
				case 2:
					{
					setState(2950);
					statementId();
					}
					break;
				}
				}
				break;
			case LOCK:
				enterOuterAlt(_localctx, 4);
				{
				setState(2953);
				match(LOCK);
				setState(2954);
				match(TABLE);
				setState(2955);
				expression();
				setState(2956);
				match(IN);
				setState(2957);
				_la = _input.LA(1);
				if ( !(_la==EXCLUSIVE || _la==SHARE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2958);
				match(MODE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOptimizationStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(fglParser.UPDATE, 0); }
		public TerminalNode STATISTICS() { return getToken(fglParser.STATISTICS, 0); }
		public TerminalNode FOR() { return getToken(fglParser.FOR, 0); }
		public TerminalNode TABLE() { return getToken(fglParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(fglParser.SET, 0); }
		public TerminalNode LOCK() { return getToken(fglParser.LOCK, 0); }
		public TerminalNode MODE() { return getToken(fglParser.MODE, 0); }
		public TerminalNode TO() { return getToken(fglParser.TO, 0); }
		public TerminalNode WAIT() { return getToken(fglParser.WAIT, 0); }
		public TerminalNode NOT() { return getToken(fglParser.NOT, 0); }
		public TerminalNode SECONDS() { return getToken(fglParser.SECONDS, 0); }
		public TerminalNode EXPLAIN() { return getToken(fglParser.EXPLAIN, 0); }
		public TerminalNode ON() { return getToken(fglParser.ON, 0); }
		public TerminalNode OFF() { return getToken(fglParser.OFF, 0); }
		public TerminalNode ISOLATION() { return getToken(fglParser.ISOLATION, 0); }
		public TerminalNode CURSOR() { return getToken(fglParser.CURSOR, 0); }
		public TerminalNode STABILITY() { return getToken(fglParser.STABILITY, 0); }
		public TerminalNode READ() { return getToken(fglParser.READ, 0); }
		public TerminalNode DIRTY() { return getToken(fglParser.DIRTY, 0); }
		public TerminalNode COMMITTED() { return getToken(fglParser.COMMITTED, 0); }
		public TerminalNode REPEATABLE() { return getToken(fglParser.REPEATABLE, 0); }
		public TerminalNode LOG() { return getToken(fglParser.LOG, 0); }
		public TerminalNode BUFFERED() { return getToken(fglParser.BUFFERED, 0); }
		public QueryOptimizationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOptimizationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterQueryOptimizationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitQueryOptimizationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitQueryOptimizationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOptimizationStatementContext queryOptimizationStatement() throws RecognitionException {
		QueryOptimizationStatementContext _localctx = new QueryOptimizationStatementContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_queryOptimizationStatement);
		int _la;
		try {
			setState(2998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2962);
				match(UPDATE);
				setState(2963);
				match(STATISTICS);
				setState(2967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
				case 1:
					{
					setState(2964);
					match(FOR);
					setState(2965);
					match(TABLE);
					setState(2966);
					tableIdentifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2969);
				match(SET);
				setState(2970);
				match(LOCK);
				setState(2971);
				match(MODE);
				setState(2972);
				match(TO);
				setState(2979);
				switch (_input.LA(1)) {
				case WAIT:
					{
					setState(2973);
					match(WAIT);
					setState(2975);
					_la = _input.LA(1);
					if (_la==SECONDS) {
						{
						setState(2974);
						match(SECONDS);
						}
					}

					}
					break;
				case NOT:
					{
					setState(2977);
					match(NOT);
					setState(2978);
					match(WAIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2981);
				match(SET);
				setState(2982);
				match(EXPLAIN);
				setState(2983);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2984);
				match(SET);
				setState(2985);
				match(ISOLATION);
				setState(2986);
				match(TO);
				setState(2991);
				switch (_input.LA(1)) {
				case CURSOR:
					{
					setState(2987);
					match(CURSOR);
					setState(2988);
					match(STABILITY);
					}
					break;
				case COMMITTED:
				case DIRTY:
				case REPEATABLE:
					{
					setState(2989);
					_la = _input.LA(1);
					if ( !(_la==COMMITTED || _la==DIRTY || _la==REPEATABLE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2990);
					match(READ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2993);
				match(SET);
				setState(2995);
				_la = _input.LA(1);
				if (_la==BUFFERED) {
					{
					setState(2994);
					match(BUFFERED);
					}
				}

				setState(2997);
				match(LOG);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseDeclarationContext extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(fglParser.DATABASE, 0); }
		public List<ConstantIdentifierContext> constantIdentifier() {
			return getRuleContexts(ConstantIdentifierContext.class);
		}
		public ConstantIdentifierContext constantIdentifier(int i) {
			return getRuleContext(ConstantIdentifierContext.class,i);
		}
		public TerminalNode EXCLUSIVE() { return getToken(fglParser.EXCLUSIVE, 0); }
		public TerminalNode SEMI() { return getToken(fglParser.SEMI, 0); }
		public TerminalNode ATSYMBOL() { return getToken(fglParser.ATSYMBOL, 0); }
		public DatabaseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDatabaseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDatabaseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDatabaseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseDeclarationContext databaseDeclaration() throws RecognitionException {
		DatabaseDeclarationContext _localctx = new DatabaseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_databaseDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3000);
			match(DATABASE);
			{
			setState(3001);
			constantIdentifier();
			setState(3004);
			_la = _input.LA(1);
			if (_la==ATSYMBOL) {
				{
				setState(3002);
				match(ATSYMBOL);
				setState(3003);
				constantIdentifier();
				}
			}

			}
			setState(3007);
			_la = _input.LA(1);
			if (_la==EXCLUSIVE) {
				{
				setState(3006);
				match(EXCLUSIVE);
				}
			}

			setState(3010);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(3009);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClientServerStatementContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(fglParser.CLOSE, 0); }
		public TerminalNode DATABASE() { return getToken(fglParser.DATABASE, 0); }
		public ClientServerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clientServerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterClientServerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitClientServerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitClientServerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClientServerStatementContext clientServerStatement() throws RecognitionException {
		ClientServerStatementContext _localctx = new ClientServerStatementContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_clientServerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3012);
			match(CLOSE);
			setState(3013);
			match(DATABASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataIntegrityStatementContext extends ParserRuleContext {
		public WheneverStatementContext wheneverStatement() {
			return getRuleContext(WheneverStatementContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(fglParser.BEGIN, 0); }
		public TerminalNode WORK() { return getToken(fglParser.WORK, 0); }
		public TerminalNode COMMIT() { return getToken(fglParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(fglParser.ROLLBACK, 0); }
		public DataIntegrityStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataIntegrityStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterDataIntegrityStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitDataIntegrityStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitDataIntegrityStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataIntegrityStatementContext dataIntegrityStatement() throws RecognitionException {
		DataIntegrityStatementContext _localctx = new DataIntegrityStatementContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_dataIntegrityStatement);
		try {
			setState(3022);
			switch (_input.LA(1)) {
			case WHENEVER:
				enterOuterAlt(_localctx, 1);
				{
				setState(3015);
				wheneverStatement();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(3016);
				match(BEGIN);
				setState(3017);
				match(WORK);
				}
				break;
			case COMMIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(3018);
				match(COMMIT);
				setState(3019);
				match(WORK);
				}
				break;
			case ROLLBACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(3020);
				match(ROLLBACK);
				setState(3021);
				match(WORK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WheneverStatementContext extends ParserRuleContext {
		public TerminalNode WHENEVER() { return getToken(fglParser.WHENEVER, 0); }
		public WheneverTypeContext wheneverType() {
			return getRuleContext(WheneverTypeContext.class,0);
		}
		public WheneverFlowContext wheneverFlow() {
			return getRuleContext(WheneverFlowContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public WheneverStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wheneverStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterWheneverStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitWheneverStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitWheneverStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WheneverStatementContext wheneverStatement() throws RecognitionException {
		WheneverStatementContext _localctx = new WheneverStatementContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_wheneverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3024);
			match(WHENEVER);
			setState(3025);
			wheneverType();
			setState(3026);
			wheneverFlow();
			setState(3027);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WheneverTypeContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(fglParser.NOT, 0); }
		public TerminalNode FOUND() { return getToken(fglParser.FOUND, 0); }
		public TerminalNode SQLERROR() { return getToken(fglParser.SQLERROR, 0); }
		public TerminalNode ERROR() { return getToken(fglParser.ERROR, 0); }
		public TerminalNode ANY() { return getToken(fglParser.ANY, 0); }
		public TerminalNode SQLWARNING() { return getToken(fglParser.SQLWARNING, 0); }
		public TerminalNode WARNING() { return getToken(fglParser.WARNING, 0); }
		public WheneverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wheneverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterWheneverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitWheneverType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitWheneverType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WheneverTypeContext wheneverType() throws RecognitionException {
		WheneverTypeContext _localctx = new WheneverTypeContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_wheneverType);
		int _la;
		try {
			setState(3036);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3029);
				match(NOT);
				setState(3030);
				match(FOUND);
				}
				break;
			case ANY:
			case ERROR:
			case SQLERROR:
				enterOuterAlt(_localctx, 2);
				{
				setState(3032);
				_la = _input.LA(1);
				if (_la==ANY) {
					{
					setState(3031);
					match(ANY);
					}
				}

				setState(3034);
				_la = _input.LA(1);
				if ( !(_la==ERROR || _la==SQLERROR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case SQLWARNING:
			case WARNING:
				enterOuterAlt(_localctx, 3);
				{
				setState(3035);
				_la = _input.LA(1);
				if ( !(_la==SQLWARNING || _la==WARNING) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WheneverFlowContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(fglParser.CONTINUE, 0); }
		public TerminalNode STOP() { return getToken(fglParser.STOP, 0); }
		public TerminalNode CALL() { return getToken(fglParser.CALL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode GO() { return getToken(fglParser.GO, 0); }
		public TerminalNode TO() { return getToken(fglParser.TO, 0); }
		public TerminalNode GOTO() { return getToken(fglParser.GOTO, 0); }
		public TerminalNode COLON() { return getToken(fglParser.COLON, 0); }
		public WheneverFlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wheneverFlow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterWheneverFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitWheneverFlow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitWheneverFlow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WheneverFlowContext wheneverFlow() throws RecognitionException {
		WheneverFlowContext _localctx = new WheneverFlowContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_wheneverFlow);
		int _la;
		try {
			setState(3050);
			switch (_input.LA(1)) {
			case CONTINUE:
			case STOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(3038);
				_la = _input.LA(1);
				if ( !(_la==CONTINUE || _la==STOP) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3039);
				match(CALL);
				setState(3040);
				identifier();
				}
				break;
			case GO:
			case GOTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(3044);
				switch (_input.LA(1)) {
				case GO:
					{
					setState(3041);
					match(GO);
					setState(3042);
					match(TO);
					}
					break;
				case GOTO:
					{
					setState(3043);
					match(GOTO);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3047);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(3046);
					match(COLON);
					}
				}

				setState(3049);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReportDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> REPORT() { return getTokens(fglParser.REPORT); }
		public TerminalNode REPORT(int i) {
			return getToken(fglParser.REPORT, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode END() { return getToken(fglParser.END, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public OutputReportContext outputReport() {
			return getRuleContext(OutputReportContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(fglParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(fglParser.BY, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public FormatReportContext formatReport() {
			return getRuleContext(FormatReportContext.class,0);
		}
		public TerminalNode EXTERNAL() { return getToken(fglParser.EXTERNAL, 0); }
		public ReportDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reportDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterReportDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitReportDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitReportDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReportDefinitionContext reportDefinition() throws RecognitionException {
		ReportDefinitionContext _localctx = new ReportDefinitionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_reportDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3052);
			match(REPORT);
			setState(3053);
			identifier();
			setState(3055);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(3054);
				parameterList();
				}
			}

			setState(3058);
			_la = _input.LA(1);
			if (_la==DEFINE || _la==DEF) {
				{
				setState(3057);
				typeDeclarations();
				}
			}

			setState(3061);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(3060);
				outputReport();
				}
			}

			setState(3069);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(3063);
				match(ORDER);
				setState(3065);
				_la = _input.LA(1);
				if (_la==EXTERNAL) {
					{
					setState(3064);
					match(EXTERNAL);
					}
				}

				setState(3067);
				match(BY);
				setState(3068);
				variableList();
				}
			}

			setState(3072);
			_la = _input.LA(1);
			if (_la==FORMAT) {
				{
				setState(3071);
				formatReport();
				}
			}

			setState(3074);
			match(END);
			setState(3075);
			match(REPORT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputReportContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(fglParser.OUTPUT, 0); }
		public TerminalNode REPORT() { return getToken(fglParser.REPORT, 0); }
		public TerminalNode TO() { return getToken(fglParser.TO, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode PIPE() { return getToken(fglParser.PIPE, 0); }
		public TerminalNode PRINTER() { return getToken(fglParser.PRINTER, 0); }
		public List<TerminalNode> LEFT() { return getTokens(fglParser.LEFT); }
		public TerminalNode LEFT(int i) {
			return getToken(fglParser.LEFT, i);
		}
		public List<TerminalNode> MARGIN() { return getTokens(fglParser.MARGIN); }
		public TerminalNode MARGIN(int i) {
			return getToken(fglParser.MARGIN, i);
		}
		public List<NumericConstantContext> numericConstant() {
			return getRuleContexts(NumericConstantContext.class);
		}
		public NumericConstantContext numericConstant(int i) {
			return getRuleContext(NumericConstantContext.class,i);
		}
		public List<TerminalNode> RIGHT() { return getTokens(fglParser.RIGHT); }
		public TerminalNode RIGHT(int i) {
			return getToken(fglParser.RIGHT, i);
		}
		public List<TerminalNode> TOP() { return getTokens(fglParser.TOP); }
		public TerminalNode TOP(int i) {
			return getToken(fglParser.TOP, i);
		}
		public List<TerminalNode> BOTTOM() { return getTokens(fglParser.BOTTOM); }
		public TerminalNode BOTTOM(int i) {
			return getToken(fglParser.BOTTOM, i);
		}
		public List<TerminalNode> PAGE() { return getTokens(fglParser.PAGE); }
		public TerminalNode PAGE(int i) {
			return getToken(fglParser.PAGE, i);
		}
		public List<TerminalNode> LENGTH() { return getTokens(fglParser.LENGTH); }
		public TerminalNode LENGTH(int i) {
			return getToken(fglParser.LENGTH, i);
		}
		public List<TerminalNode> OF() { return getTokens(fglParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(fglParser.OF, i);
		}
		public OutputReportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputReport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterOutputReport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitOutputReport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitOutputReport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputReportContext outputReport() throws RecognitionException {
		OutputReportContext _localctx = new OutputReportContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_outputReport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3077);
			match(OUTPUT);
			setState(3086);
			_la = _input.LA(1);
			if (_la==REPORT) {
				{
				setState(3078);
				match(REPORT);
				setState(3079);
				match(TO);
				setState(3084);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(3080);
					string();
					}
					break;
				case PIPE:
					{
					setState(3081);
					match(PIPE);
					setState(3082);
					string();
					}
					break;
				case PRINTER:
					{
					setState(3083);
					match(PRINTER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(3109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOTTOM || _la==LEFT || _la==PAGE || _la==RIGHT || _la==TOP) {
				{
				setState(3107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
				case 1:
					{
					{
					setState(3088);
					match(LEFT);
					setState(3089);
					match(MARGIN);
					setState(3090);
					numericConstant();
					}
					}
					break;
				case 2:
					{
					{
					setState(3091);
					match(RIGHT);
					setState(3092);
					match(MARGIN);
					setState(3093);
					numericConstant();
					}
					}
					break;
				case 3:
					{
					{
					setState(3094);
					match(TOP);
					setState(3095);
					match(MARGIN);
					setState(3096);
					numericConstant();
					}
					}
					break;
				case 4:
					{
					{
					setState(3097);
					match(BOTTOM);
					setState(3098);
					match(MARGIN);
					setState(3099);
					numericConstant();
					}
					}
					break;
				case 5:
					{
					{
					setState(3100);
					match(PAGE);
					setState(3101);
					match(LENGTH);
					setState(3102);
					numericConstant();
					}
					}
					break;
				case 6:
					{
					{
					setState(3103);
					match(TOP);
					setState(3104);
					match(OF);
					setState(3105);
					match(PAGE);
					setState(3106);
					string();
					}
					}
					break;
				}
				}
				setState(3111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormatReportContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(fglParser.FORMAT, 0); }
		public List<TerminalNode> EVERY() { return getTokens(fglParser.EVERY); }
		public TerminalNode EVERY(int i) {
			return getToken(fglParser.EVERY, i);
		}
		public List<TerminalNode> ROW() { return getTokens(fglParser.ROW); }
		public TerminalNode ROW(int i) {
			return getToken(fglParser.ROW, i);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public List<TerminalNode> PAGE() { return getTokens(fglParser.PAGE); }
		public TerminalNode PAGE(int i) {
			return getToken(fglParser.PAGE, i);
		}
		public List<TerminalNode> HEADER() { return getTokens(fglParser.HEADER); }
		public TerminalNode HEADER(int i) {
			return getToken(fglParser.HEADER, i);
		}
		public List<TerminalNode> TRAILER() { return getTokens(fglParser.TRAILER); }
		public TerminalNode TRAILER(int i) {
			return getToken(fglParser.TRAILER, i);
		}
		public List<TerminalNode> ON() { return getTokens(fglParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(fglParser.ON, i);
		}
		public List<TerminalNode> GROUP() { return getTokens(fglParser.GROUP); }
		public TerminalNode GROUP(int i) {
			return getToken(fglParser.GROUP, i);
		}
		public List<TerminalNode> OF() { return getTokens(fglParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(fglParser.OF, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> BEFORE() { return getTokens(fglParser.BEFORE); }
		public TerminalNode BEFORE(int i) {
			return getToken(fglParser.BEFORE, i);
		}
		public List<TerminalNode> AFTER() { return getTokens(fglParser.AFTER); }
		public TerminalNode AFTER(int i) {
			return getToken(fglParser.AFTER, i);
		}
		public List<TerminalNode> LAST() { return getTokens(fglParser.LAST); }
		public TerminalNode LAST(int i) {
			return getToken(fglParser.LAST, i);
		}
		public List<TerminalNode> FIRST() { return getTokens(fglParser.FIRST); }
		public TerminalNode FIRST(int i) {
			return getToken(fglParser.FIRST, i);
		}
		public FormatReportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatReport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterFormatReport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitFormatReport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitFormatReport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatReportContext formatReport() throws RecognitionException {
		FormatReportContext _localctx = new FormatReportContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_formatReport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3112);
			match(FORMAT);
			setState(3140);
			switch (_input.LA(1)) {
			case EVERY:
				{
				setState(3113);
				match(EVERY);
				setState(3114);
				match(ROW);
				}
				break;
			case AFTER:
			case BEFORE:
			case FIRST:
			case ON:
			case PAGE:
				{
				setState(3136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3133);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,407,_ctx) ) {
					case 1:
						{
						setState(3116);
						_la = _input.LA(1);
						if (_la==FIRST) {
							{
							setState(3115);
							match(FIRST);
							}
						}

						setState(3118);
						match(PAGE);
						setState(3119);
						match(HEADER);
						}
						break;
					case 2:
						{
						setState(3120);
						match(PAGE);
						setState(3121);
						match(TRAILER);
						}
						break;
					case 3:
						{
						setState(3122);
						match(ON);
						setState(3127);
						switch (_input.LA(1)) {
						case EVERY:
							{
							setState(3123);
							match(EVERY);
							setState(3124);
							match(ROW);
							}
							break;
						case LAST:
							{
							setState(3125);
							match(LAST);
							setState(3126);
							match(ROW);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 4:
						{
						setState(3129);
						_la = _input.LA(1);
						if ( !(_la==AFTER || _la==BEFORE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(3130);
						match(GROUP);
						setState(3131);
						match(OF);
						setState(3132);
						variable();
						}
						break;
					}
					setState(3135);
					codeBlock();
					}
					}
					setState(3138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AFTER || _la==BEFORE || _la==FIRST || _la==ON || _la==PAGE );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EolContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(fglParser.EOL, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitEol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitEol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_eol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3142);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedRealContext unsignedReal() {
			return getRuleContext(UnsignedRealContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitUnsignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_unsignedNumber);
		try {
			setState(3146);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3144);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3145);
				unsignedReal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(fglParser.NUM_INT, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitUnsignedInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitUnsignedInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3148);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedRealContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(fglParser.NUM_REAL, 0); }
		public UnsignedRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterUnsignedReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitUnsignedReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitUnsignedReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedRealContext unsignedReal() throws RecognitionException {
		UnsignedRealContext _localctx = new UnsignedRealContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3150);
			match(NUM_REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(fglParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(fglParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3152);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantIdentifierContext extends ParserRuleContext {
		public TerminalNode ACCEPT() { return getToken(fglParser.ACCEPT, 0); }
		public TerminalNode ASCII() { return getToken(fglParser.ASCII, 0); }
		public TerminalNode COUNT() { return getToken(fglParser.COUNT, 0); }
		public TerminalNode CURRENT() { return getToken(fglParser.CURRENT, 0); }
		public TerminalNode FALSE() { return getToken(fglParser.FALSE, 0); }
		public TerminalNode FIRST() { return getToken(fglParser.FIRST, 0); }
		public TerminalNode FOUND() { return getToken(fglParser.FOUND, 0); }
		public TerminalNode GROUP() { return getToken(fglParser.GROUP, 0); }
		public TerminalNode HIDE() { return getToken(fglParser.HIDE, 0); }
		public TerminalNode INDEX() { return getToken(fglParser.INDEX, 0); }
		public TerminalNode INT_FLAG() { return getToken(fglParser.INT_FLAG, 0); }
		public TerminalNode INTERRUPT() { return getToken(fglParser.INTERRUPT, 0); }
		public TerminalNode LAST() { return getToken(fglParser.LAST, 0); }
		public TerminalNode LENGTH() { return getToken(fglParser.LENGTH, 0); }
		public TerminalNode LINENO() { return getToken(fglParser.LINENO, 0); }
		public TerminalNode MDY() { return getToken(fglParser.MDY, 0); }
		public TerminalNode NO() { return getToken(fglParser.NO, 0); }
		public TerminalNode NOT() { return getToken(fglParser.NOT, 0); }
		public TerminalNode NOTFOUND() { return getToken(fglParser.NOTFOUND, 0); }
		public TerminalNode NULL() { return getToken(fglParser.NULL, 0); }
		public TerminalNode PAGENO() { return getToken(fglParser.PAGENO, 0); }
		public TerminalNode REAL() { return getToken(fglParser.REAL, 0); }
		public TerminalNode SIZE() { return getToken(fglParser.SIZE, 0); }
		public TerminalNode SQL() { return getToken(fglParser.SQL, 0); }
		public TerminalNode STATUS() { return getToken(fglParser.STATUS, 0); }
		public TerminalNode TEMP() { return getToken(fglParser.TEMP, 0); }
		public TerminalNode TIME() { return getToken(fglParser.TIME, 0); }
		public TerminalNode TODAY() { return getToken(fglParser.TODAY, 0); }
		public TerminalNode TRUE() { return getToken(fglParser.TRUE, 0); }
		public TerminalNode USER() { return getToken(fglParser.USER, 0); }
		public TerminalNode WAIT() { return getToken(fglParser.WAIT, 0); }
		public TerminalNode WEEKDAY() { return getToken(fglParser.WEEKDAY, 0); }
		public TerminalNode WORK() { return getToken(fglParser.WORK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).enterConstantIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fglListener ) ((fglListener)listener).exitConstantIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fglVisitor ) return ((fglVisitor<? extends T>)visitor).visitConstantIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantIdentifierContext constantIdentifier() throws RecognitionException {
		ConstantIdentifierContext _localctx = new ConstantIdentifierContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_constantIdentifier);
		int _la;
		try {
			setState(3156);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
				enterOuterAlt(_localctx, 1);
				{
				setState(3154);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ASCII) | (1L << COUNT) | (1L << CURRENT))) != 0) || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (FALSE - 109)) | (1L << (FIRST - 109)) | (1L << (FOUND - 109)) | (1L << (GROUP - 109)) | (1L << (HIDE - 109)) | (1L << (INDEX - 109)) | (1L << (INT_FLAG - 109)) | (1L << (INTERRUPT - 109)) | (1L << (LAST - 109)) | (1L << (LENGTH - 109)) | (1L << (LINENO - 109)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (MDY - 184)) | (1L << (NO - 184)) | (1L << (NOT - 184)) | (1L << (NOTFOUND - 184)) | (1L << (NULL - 184)) | (1L << (PAGENO - 184)) | (1L << (REAL - 184)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (SIZE - 262)) | (1L << (SQL - 262)) | (1L << (STATUS - 262)) | (1L << (TEMP - 262)) | (1L << (TIME - 262)) | (1L << (TODAY - 262)) | (1L << (TRUE - 262)) | (1L << (USER - 262)) | (1L << (WEEKDAY - 262)) | (1L << (WAIT - 262)) | (1L << (WORK - 262)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3155);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0168\u0c59\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\3\2\5\2\u0194\n\2\3\2\5\2\u0197\n\2\3\2\5\2\u019a\n\2"+
		"\3\2\5\2\u019d\n\2\3\2\5\2\u01a0\n\2\3\2\3\2\3\3\3\3\3\4\5\4\u01a7\n\4"+
		"\3\4\3\4\3\4\5\4\u01ac\n\4\3\4\5\4\u01af\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\u01b7\n\4\3\4\5\4\u01ba\n\4\3\4\5\4\u01bd\n\4\3\5\3\5\3\5\6\5\u01c2"+
		"\n\5\r\5\16\5\u01c3\3\6\3\6\3\6\3\6\3\7\3\7\6\7\u01cc\n\7\r\7\16\7\u01cd"+
		"\3\b\3\b\5\b\u01d2\n\b\3\t\3\t\3\t\5\t\u01d7\n\t\3\t\3\t\3\t\5\t\u01dc"+
		"\n\t\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u01e4\n\n\f\n\16\n\u01e7\13\n\3\n\3\n"+
		"\3\13\3\13\3\13\7\13\u01ee\n\13\f\13\16\13\u01f1\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u01fa\n\f\3\f\3\f\3\r\3\r\7\r\u0200\n\r\f\r\16\r\u0203"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u020b\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\5\20\u0216\n\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\5\22\u0220\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u022a\n\24\3\24\3\24\5\24\u022e\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0235"+
		"\n\24\5\24\u0237\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u023e\n\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u0247\n\25\5\25\u0249\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0250\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0267\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u026e\n\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\5\30\u0277\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0280\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0289\n\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0292\n\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u029b\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u02a2\n"+
		"\30\3\31\3\31\3\32\3\32\5\32\u02a8\n\32\3\33\3\33\5\33\u02ac\n\33\3\34"+
		"\3\34\5\34\u02b0\n\34\3\35\3\35\5\35\u02b4\n\35\3\36\3\36\5\36\u02b8\n"+
		"\36\3\37\3\37\5\37\u02bc\n\37\3 \3 \3 \3 \3 \5 \u02c3\n \3!\3!\3!\5!\u02c8"+
		"\n!\3\"\3\"\3\"\3\"\3\"\7\"\u02cf\n\"\f\"\16\"\u02d2\13\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u02dc\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u02e7"+
		"\n#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u02f1\n$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u02fb"+
		"\n%\3&\3&\3\'\3\'\3\'\5\'\u0302\n\'\3\'\3\'\3(\3(\6(\u0308\n(\r(\16(\u0309"+
		"\3)\3)\3*\3*\5*\u0310\n*\3+\3+\3+\3+\5+\u0316\n+\3+\3+\3+\3+\3+\5+\u031d"+
		"\n+\3,\3,\3,\5,\u0322\n,\3,\3,\3,\3,\3,\3,\5,\u032a\n,\3,\3,\3,\3,\5,"+
		"\u0330\n,\3-\5-\u0333\n-\3-\3-\3-\3-\3-\7-\u033a\n-\f-\16-\u033d\13-\3"+
		".\3.\3.\3.\3.\3.\7.\u0345\n.\f.\16.\u0348\13.\5.\u034a\n.\3.\5.\u034d"+
		"\n.\3.\3.\3.\3.\7.\u0353\n.\f.\16.\u0356\13.\5.\u0358\n.\3/\3/\3\60\3"+
		"\60\5\60\u035e\n\60\3\61\3\61\5\61\u0362\n\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\7\62\u036b\n\62\f\62\16\62\u036e\13\62\5\62\u0370\n\62\3\63"+
		"\3\63\3\63\7\63\u0375\n\63\f\63\16\63\u0378\13\63\3\64\3\64\3\64\5\64"+
		"\u037d\n\64\3\64\3\64\3\64\3\64\5\64\u0383\n\64\3\64\3\64\3\64\3\64\5"+
		"\64\u0389\n\64\3\64\3\64\5\64\u038d\n\64\3\64\3\64\3\64\3\64\5\64\u0393"+
		"\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u039d\n\64\3\64\3\64"+
		"\3\64\3\64\3\64\5\64\u03a4\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u03b9\n\64"+
		"\3\65\3\65\3\65\5\65\u03be\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u03c5\n"+
		"\65\3\65\3\65\3\65\5\65\u03ca\n\65\3\65\3\65\3\65\3\65\5\65\u03d0\n\65"+
		"\3\65\3\65\3\65\3\65\5\65\u03d6\n\65\3\66\3\66\3\66\3\66\5\66\u03dc\n"+
		"\66\3\67\3\67\3\67\3\67\38\38\38\78\u03e5\n8\f8\168\u03e8\138\39\59\u03eb"+
		"\n9\39\39\3:\3:\3:\3:\5:\u03f3\n:\3:\7:\u03f6\n:\f:\16:\u03f9\13:\3;\3"+
		";\3<\3<\3<\7<\u0400\n<\f<\16<\u0403\13<\3=\3=\3=\5=\u0408\n=\3=\3=\3="+
		"\5=\u040d\n=\3=\3=\3=\5=\u0412\n=\3=\3=\3=\5=\u0417\n=\3=\3=\3=\5=\u041c"+
		"\n=\3=\3=\3=\7=\u0421\n=\f=\16=\u0424\13=\5=\u0426\n=\3=\3=\3=\3=\3=\5"+
		"=\u042d\n=\3=\3=\3=\7=\u0432\n=\f=\16=\u0435\13=\5=\u0437\n=\3=\3=\3="+
		"\3=\3=\3=\3=\7=\u0440\n=\f=\16=\u0443\13=\3=\3=\3=\3=\3=\3=\3=\7=\u044c"+
		"\n=\f=\16=\u044f\13=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\5=\u0462\n=\3>\3>\3>\3>\6>\u0468\n>\r>\16>\u0469\3>\3>\3?\3?\3?\3?\3"+
		"?\5?\u0473\n?\3@\3@\3@\3A\3A\3A\3A\5A\u047c\nA\3B\3B\3C\3C\3D\3D\3E\3"+
		"E\3F\3F\5F\u0488\nF\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0494\nH\3H\5H\u0497"+
		"\nH\3I\3I\3I\3I\3I\3I\7I\u049f\nI\fI\16I\u04a2\13I\5I\u04a4\nI\3J\3J\3"+
		"J\7J\u04a9\nJ\fJ\16J\u04ac\13J\3K\3K\3K\7K\u04b1\nK\fK\16K\u04b4\13K\3"+
		"L\3L\3L\3L\7L\u04ba\nL\fL\16L\u04bd\13L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\5M\u04cd\nM\3N\5N\u04d0\nN\3N\3N\3N\3N\7N\u04d6\nN\fN\16"+
		"N\u04d9\13N\3O\3O\3P\3P\3P\3P\7P\u04e1\nP\fP\16P\u04e4\13P\3Q\3Q\3R\5"+
		"R\u04e9\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u04f4\nR\3R\3R\5R\u04f8\nR\3"+
		"S\3S\3S\3S\3S\7S\u04ff\nS\fS\16S\u0502\13S\5S\u0504\nS\3S\5S\u0507\nS"+
		"\3T\3T\5T\u050b\nT\3U\3U\3U\3U\5U\u0511\nU\3V\3V\3V\3V\3V\3V\5V\u0519"+
		"\nV\3W\3W\3W\3W\5W\u051f\nW\3X\3X\5X\u0523\nX\3Y\3Y\3Z\3Z\3[\3[\3[\3["+
		"\7[\u052d\n[\f[\16[\u0530\13[\3[\3[\3\\\3\\\5\\\u0536\n\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\5\\\u053e\n\\\5\\\u0540\n\\\3]\3]\3^\3^\3_\3_\5_\u0548\n"+
		"_\3`\3`\5`\u054c\n`\3a\3a\3a\3a\5a\u0552\na\3a\3a\5a\u0556\na\5a\u0558"+
		"\na\3a\3a\3a\3b\3b\3b\5b\u0560\nb\3c\3c\3c\5c\u0565\nc\3c\3c\3c\3d\3d"+
		"\3d\3d\3d\3d\5d\u0570\nd\3d\3d\5d\u0574\nd\3d\3d\3d\3d\3e\3e\3e\3e\3f"+
		"\3f\3g\3g\3h\3h\3i\3i\3i\3i\3i\5i\u0589\ni\3i\3i\5i\u058d\ni\3i\3i\5i"+
		"\u0591\ni\3i\3i\5i\u0595\ni\3i\5i\u0598\ni\3i\5i\u059b\ni\3i\3i\3i\3i"+
		"\3i\3j\3j\3j\7j\u05a5\nj\fj\16j\u05a8\13j\3k\3k\3k\7k\u05ad\nk\fk\16k"+
		"\u05b0\13k\3l\3l\3l\3l\3l\5l\u05b7\nl\7l\u05b9\nl\fl\16l\u05bc\13l\3l"+
		"\3l\5l\u05c0\nl\5l\u05c2\nl\3l\3l\3l\3l\3l\3l\3l\3l\7l\u05cc\nl\fl\16"+
		"l\u05cf\13l\3l\3l\5l\u05d3\nl\3l\3l\5l\u05d7\nl\3m\3m\3m\3m\5m\u05dd\n"+
		"m\3n\3n\3n\3n\3n\3n\3n\5n\u05e6\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u05f2"+
		"\no\3p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u05fd\np\5p\u05ff\np\3q\3q\3q\3q\3r"+
		"\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u0611\nr\5r\u0613\nr\3r\3r\3r\3r"+
		"\3r\3r\3r\3r\3r\3r\3r\3r\7r\u0621\nr\fr\16r\u0624\13r\3r\3r\3r\3r\7r\u062a"+
		"\nr\fr\16r\u062d\13r\3r\3r\3r\3r\3r\3r\7r\u0635\nr\fr\16r\u0638\13r\5"+
		"r\u063a\nr\3r\3r\3r\3r\7r\u0640\nr\fr\16r\u0643\13r\3r\3r\3r\3r\7r\u0649"+
		"\nr\fr\16r\u064c\13r\5r\u064e\nr\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u0659\n"+
		"s\3s\3s\3s\3s\5s\u065f\ns\5s\u0661\ns\5s\u0663\ns\3t\3t\3t\7t\u0668\n"+
		"t\ft\16t\u066b\13t\3u\3u\3u\3u\3u\3u\3u\3u\5u\u0675\nu\5u\u0677\nu\3u"+
		"\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\7u\u068d\nu"+
		"\fu\16u\u0690\13u\5u\u0692\nu\3u\3u\3u\3u\3u\3u\3u\3u\5u\u069c\nu\3u\3"+
		"u\3u\3u\3u\3u\5u\u06a4\nu\3u\5u\u06a7\nu\3u\3u\5u\u06ab\nu\3u\3u\3u\3"+
		"u\3u\3u\3u\3u\5u\u06b5\nu\3u\3u\3u\3u\3u\3u\3u\3u\7u\u06bf\nu\fu\16u\u06c2"+
		"\13u\5u\u06c4\nu\3u\3u\5u\u06c8\nu\3v\3v\3v\3v\3v\5v\u06cf\nv\3v\3v\5"+
		"v\u06d3\nv\3v\3v\3v\3v\3v\3v\5v\u06db\nv\3v\3v\3v\3v\5v\u06e1\nv\5v\u06e3"+
		"\nv\5v\u06e5\nv\3w\3w\3w\5w\u06ea\nw\3w\3w\3x\3x\3x\7x\u06f1\nx\fx\16"+
		"x\u06f4\13x\3y\3y\3y\7y\u06f9\ny\fy\16y\u06fc\13y\3z\3z\3z\3z\3z\3z\3"+
		"z\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u070e\nz\3{\3{\3{\3{\3{\5{\u0715\n{\3"+
		"{\3{\3{\3{\3{\3{\3{\5{\u071e\n{\3|\3|\3}\5}\u0723\n}\3}\3}\3}\7}\u0728"+
		"\n}\f}\16}\u072b\13}\3~\3~\3~\3~\3~\3\177\3\177\6\177\u0734\n\177\r\177"+
		"\16\177\u0735\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0745\n\u0080"+
		"\3\u0080\5\u0080\u0748\n\u0080\3\u0080\3\u0080\5\u0080\u074c\n\u0080\3"+
		"\u0080\6\u0080\u074f\n\u0080\r\u0080\16\u0080\u0750\3\u0080\3\u0080\3"+
		"\u0080\5\u0080\u0756\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3"+
		"\u0081\5\u0081\u075e\n\u0081\3\u0081\7\u0081\u0761\n\u0081\f\u0081\16"+
		"\u0081\u0764\13\u0081\3\u0081\3\u0081\5\u0081\u0768\n\u0081\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\5\u0082\u076e\n\u0082\3\u0083\3\u0083\3\u0083\3"+
		"\u0083\3\u0083\3\u0083\6\u0083\u0776\n\u0083\r\u0083\16\u0083\u0777\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u0780\n\u0084\f"+
		"\u0084\16\u0084\u0783\13\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u0788\n"+
		"\u0084\f\u0084\16\u0084\u078b\13\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\5\u0084\u0794\n\u0084\5\u0084\u0796\n\u0084\3"+
		"\u0084\5\u0084\u0799\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3"+
		"\u0085\7\u0085\u07a1\n\u0085\f\u0085\16\u0085\u07a4\13\u0085\3\u0085\5"+
		"\u0085\u07a7\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\7\u0086\u07ad\n\u0086"+
		"\f\u0086\16\u0086\u07b0\13\u0086\3\u0086\5\u0086\u07b3\n\u0086\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\7\u0087\u07b9\n\u0087\f\u0087\16\u0087\u07bc"+
		"\13\u0087\3\u0087\5\u0087\u07bf\n\u0087\3\u0087\3\u0087\5\u0087\u07c3"+
		"\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07c8\n\u0087\3\u0087\5\u0087"+
		"\u07cb\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087"+
		"\u07d3\n\u0087\7\u0087\u07d5\n\u0087\f\u0087\16\u0087\u07d8\13\u0087\3"+
		"\u0087\3\u0087\5\u0087\u07dc\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3"+
		"\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u07ec\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089"+
		"\u07f2\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u07f8\n\u0089\5"+
		"\u0089\u07fa\n\u0089\3\u008a\3\u008a\7\u008a\u07fe\n\u008a\f\u008a\16"+
		"\u008a\u0801\13\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\7\u008b\u0809\n\u008b\f\u008b\16\u008b\u080c\13\u008b\3\u008b\3\u008b"+
		"\5\u008b\u0810\n\u008b\3\u008b\3\u008b\3\u008b\7\u008b\u0815\n\u008b\f"+
		"\u008b\16\u008b\u0818\13\u008b\3\u008b\3\u008b\5\u008b\u081c\n\u008b\3"+
		"\u008b\3\u008b\3\u008b\5\u008b\u0821\n\u008b\3\u008b\5\u008b\u0824\n\u008b"+
		"\3\u008b\3\u008b\5\u008b\u0828\n\u008b\3\u008b\6\u008b\u082b\n\u008b\r"+
		"\u008b\16\u008b\u082c\3\u008b\3\u008b\3\u008b\5\u008b\u0832\n\u008b\3"+
		"\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0839\n\u008c\3\u008c\3"+
		"\u008c\3\u008c\3\u008c\7\u008c\u083f\n\u008c\f\u008c\16\u008c\u0842\13"+
		"\u008c\3\u008c\3\u008c\5\u008c\u0846\n\u008c\3\u008c\5\u008c\u0849\n\u008c"+
		"\3\u008c\6\u008c\u084c\n\u008c\r\u008c\16\u008c\u084d\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u0853\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\5\u008d\u085d\n\u008d\3\u008d\3\u008d\5\u008d"+
		"\u0861\n\u008d\3\u008d\3\u008d\5\u008d\u0865\n\u008d\5\u008d\u0867\n\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u086d\n\u008e\3\u008e\3\u008e"+
		"\7\u008e\u0871\n\u008e\f\u008e\16\u008e\u0874\13\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\5\u008e\u087a\n\u008e\3\u008e\3\u008e\7\u008e\u087e\n"+
		"\u008e\f\u008e\16\u008e\u0881\13\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\5\u008e\u0887\n\u008e\3\u008e\3\u008e\7\u008e\u088b\n\u008e\f\u008e\16"+
		"\u008e\u088e\13\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0894\n"+
		"\u008e\3\u008f\3\u008f\5\u008f\u0898\n\u008f\3\u0090\3\u0090\3\u0090\7"+
		"\u0090\u089d\n\u0090\f\u0090\16\u0090\u08a0\13\u0090\3\u0090\3\u0090\3"+
		"\u0090\3\u0091\3\u0091\3\u0091\5\u0091\u08a8\n\u0091\3\u0091\3\u0091\3"+
		"\u0091\3\u0091\5\u0091\u08ae\n\u0091\5\u0091\u08b0\n\u0091\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092"+
		"\u08bc\n\u0092\5\u0092\u08be\n\u0092\3\u0093\3\u0093\3\u0093\7\u0093\u08c3"+
		"\n\u0093\f\u0093\16\u0093\u08c6\13\u0093\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u08e3\n\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\5\u0095\u0904\n\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\7\u0096\u090a\n\u0096\f\u0096\16\u0096\u090d\13\u0096\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u0914\n\u0097\3\u0097\3\u0097"+
		"\5\u0097\u0918\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\5\u0097\u092a\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\5\u0097\u0933\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\5\u0097\u0954\n\u0097\3\u0097\5\u0097\u0957\n\u0097\3\u0097\3\u0097\3"+
		"\u0097\3\u0097\3\u0097\7\u0097\u095e\n\u0097\f\u0097\16\u0097\u0961\13"+
		"\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u0966\n\u0097\5\u0097\u0968\n\u0097"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0971"+
		"\n\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\5\u0099\u097c\n\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\5\u0099\u0984\n\u0099\5\u0099\u0986\n\u0099\3\u0099\3\u0099\5"+
		"\u0099\u098a\n\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0990\n\u0099"+
		"\3\u0099\3\u0099\3\u0099\5\u0099\u0995\n\u0099\5\u0099\u0997\n\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\5\u0099\u09a3\n\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u09a8\n"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\5\u0099\u09b2\n\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u09b8\n"+
		"\u0099\5\u0099\u09ba\n\u0099\3\u009a\3\u009a\3\u009a\7\u009a\u09bf\n\u009a"+
		"\f\u009a\16\u009a\u09c2\13\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u09d0"+
		"\n\u009e\5\u009e\u09d2\n\u009e\5\u009e\u09d4\n\u009e\3\u009e\3\u009e\5"+
		"\u009e\u09d8\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\7\u009e\u09df"+
		"\n\u009e\f\u009e\16\u009e\u09e2\13\u009e\5\u009e\u09e4\n\u009e\3\u009e"+
		"\3\u009e\3\u009e\5\u009e\u09e9\n\u009e\5\u009e\u09eb\n\u009e\3\u009f\3"+
		"\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u09f2\n\u009f\3\u009f\3\u009f\3"+
		"\u009f\3\u009f\3\u009f\3\u009f\7\u009f\u09fa\n\u009f\f\u009f\16\u009f"+
		"\u09fd\13\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0a03\n\u009f"+
		"\3\u009f\3\u009f\5\u009f\u0a07\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f"+
		"\u0a0c\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0a11\n\u009f\3\u009f\3"+
		"\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0a18\n\u009f\3\u009f\3\u009f\5"+
		"\u009f\u0a1c\n\u009f\3\u009f\5\u009f\u0a1f\n\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0a28\n\u009f\3\u009f\3\u009f"+
		"\3\u009f\5\u009f\u0a2d\n\u009f\7\u009f\u0a2f\n\u009f\f\u009f\16\u009f"+
		"\u0a32\13\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\5\u009f\u0a3b\n\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\5\u00a0\u0a43\n\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\5\u00a2"+
		"\u0a4a\n\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0a50\n\u00a2\5"+
		"\u00a2\u0a52\n\u00a2\3\u00a3\3\u00a3\5\u00a3\u0a56\n\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u0a5b\n\u00a3\7\u00a3\u0a5d\n\u00a3\f\u00a3\16\u00a3"+
		"\u0a60\13\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0a65\n\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\5\u00a5\u0a72\n\u00a5\3\u00a6\5\u00a6\u0a75\n\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a7\5\u00a7\u0a7a\n\u00a7\3\u00a7\3\u00a7\5\u00a7\u0a7e\n\u00a7"+
		"\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0a88\n\u00a9\5\u00a9\u0a8a\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\5\u00a9\u0a92\n\u00a9\5\u00a9\u0a94\n\u00a9\7\u00a9\u0a96"+
		"\n\u00a9\f\u00a9\16\u00a9\u0a99\13\u00a9\3\u00aa\3\u00aa\3\u00ab\3\u00ab"+
		"\3\u00ab\5\u00ab\u0aa0\n\u00ab\3\u00ab\3\u00ab\5\u00ab\u0aa4\n\u00ab\3"+
		"\u00ab\5\u00ab\u0aa7\n\u00ab\3\u00ab\5\u00ab\u0aaa\n\u00ab\3\u00ab\5\u00ab"+
		"\u0aad\n\u00ab\3\u00ab\5\u00ab\u0ab0\n\u00ab\3\u00ab\3\u00ab\3\u00ab\5"+
		"\u00ab\u0ab5\n\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0aba\n\u00ab\3\u00ac"+
		"\3\u00ac\5\u00ac\u0abe\n\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad"+
		"\5\u00ad\u0ac5\n\u00ad\3\u00ad\5\u00ad\u0ac8\n\u00ad\3\u00ad\5\u00ad\u0acb"+
		"\n\u00ad\3\u00ad\5\u00ad\u0ace\n\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\5\u00b1"+
		"\u0adc\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u0ae3\n"+
		"\u00b2\f\u00b2\16\u00b2\u0ae6\13\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\5\u00b3\u0aec\n\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0af1\n\u00b3\5"+
		"\u00b3\u0af3\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3"+
		"\u00b3\5\u00b3\u0afc\n\u00b3\3\u00b3\5\u00b3\u0aff\n\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0b07\n\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\5\u00b4\u0b0c\n\u00b4\5\u00b4\u0b0e\n\u00b4\3\u00b4\3\u00b4\3"+
		"\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5"+
		"\u0b1a\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u0b21\n"+
		"\u00b5\f\u00b5\16\u00b5\u0b24\13\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5"+
		"\u0b29\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u0b36\n\u00b6\f\u00b6\16\u00b6"+
		"\u0b39\13\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\5\u00b6\u0b42\n\u00b6\3\u00b6\5\u00b6\u0b45\n\u00b6\3\u00b6\3\u00b6\3"+
		"\u00b6\3\u00b6\3\u00b6\7\u00b6\u0b4c\n\u00b6\f\u00b6\16\u00b6\u0b4f\13"+
		"\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0b56\n\u00b6\3"+
		"\u00b6\5\u00b6\u0b59\n\u00b6\5\u00b6\u0b5b\n\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\5\u00b6\u0b62\n\u00b6\5\u00b6\u0b64\n\u00b6\3\u00b7\3"+
		"\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0b6e\n"+
		"\u00b7\5\u00b7\u0b70\n\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\7"+
		"\u00b8\u0b77\n\u00b8\f\u00b8\16\u00b8\u0b7a\13\u00b8\3\u00b9\3\u00b9\3"+
		"\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0b85\n"+
		"\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0b8a\n\u00b9\3\u00b9\3\u00b9\3"+
		"\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0b93\n\u00b9\3\u00ba\3"+
		"\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0b9a\n\u00ba\3\u00ba\3\u00ba\3"+
		"\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0ba2\n\u00ba\3\u00ba\3\u00ba\5"+
		"\u00ba\u0ba6\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3"+
		"\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0bb2\n\u00ba\3\u00ba\3\u00ba\5"+
		"\u00ba\u0bb6\n\u00ba\3\u00ba\5\u00ba\u0bb9\n\u00ba\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\5\u00bb\u0bbf\n\u00bb\3\u00bb\5\u00bb\u0bc2\n\u00bb\3\u00bb\5"+
		"\u00bb\u0bc5\n\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0bd1\n\u00bd\3\u00be\3\u00be\3"+
		"\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0bdb\n\u00bf\3"+
		"\u00bf\3\u00bf\5\u00bf\u0bdf\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3"+
		"\u00c0\3\u00c0\5\u00c0\u0be7\n\u00c0\3\u00c0\5\u00c0\u0bea\n\u00c0\3\u00c0"+
		"\5\u00c0\u0bed\n\u00c0\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0bf2\n\u00c1\3"+
		"\u00c1\5\u00c1\u0bf5\n\u00c1\3\u00c1\5\u00c1\u0bf8\n\u00c1\3\u00c1\3\u00c1"+
		"\5\u00c1\u0bfc\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u0c00\n\u00c1\3\u00c1\5"+
		"\u00c1\u0c03\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3"+
		"\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0c0f\n\u00c2\5\u00c2\u0c11\n\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\7\u00c2\u0c26\n\u00c2\f\u00c2\16\u00c2\u0c29\13\u00c2\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0c2f\n\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0c3a\n\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0c40\n\u00c3\3\u00c3\6\u00c3"+
		"\u0c43\n\u00c3\r\u00c3\16\u00c3\u0c44\5\u00c3\u0c47\n\u00c3\3\u00c4\3"+
		"\u00c4\3\u00c5\3\u00c5\5\u00c5\u0c4d\n\u00c5\3\u00c6\3\u00c6\3\u00c7\3"+
		"\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\5\u00c9\u0c57\n\u00c9\3\u00c9\2"+
		"\2\u00ca\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132"+
		"\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a"+
		"\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162"+
		"\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a"+
		"\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\2*"+
		"\4\2\u009d\u009d\u00eb\u00eb\4\2\"\"\u011b\u011b\7\2\31\31\u009a\u009a"+
		"\u009c\u009c\u00ee\u00ee\u010a\u010b\5\2FG\u00c1\u00c1\u00ce\u00ce\4\2"+
		"\\\\ww\4\2\u00d0\u00d0\u0132\u0132\5\2&&RR\u00c2\u00c2\4\2oo\u0124\u0124"+
		"\4\2\b\b\13\13\3\2\u0144\u0145\5\2\b\bZZ\u0146\u0146\6\2BBDD\u00c0\u00c0"+
		"\u0142\u0142\7\2\24\24::\u00b9\u00b9\u00bb\u00bb\u0116\u0116\4\2HH\u00d1"+
		"\u00d1\5\2SS\u00bd\u00bd\u0146\u0147\21\2\24\24..::BBDDll\u0094\u0094"+
		"\u00b9\u00bb\u00c0\u00c0\u00e4\u00e4\u0116\u0116\u011f\u011f\u0121\u0121"+
		"\u0133\u0133\u0142\u0142\3\2\u011d\u011e\4\2\u00ac\u00ac\u00df\u00df\3"+
		"\2\u010c\u010d\4\2\u00ab\u00ab\u00ad\u00ad\5\2\33\33\u00fa\u00fa\u0127"+
		"\u0127\r\2\32\32\34\35@@VV\u0087\u0087\u009f\u009f\u00b3\u00b3\u00c7\u00c7"+
		"\u00f0\u00f0\u013c\u013c\u0143\u0143\3\2\21\22\4\2\4\4\26\26\5\2QQ\u0096"+
		"\u0097\u00fd\u00fd\4\2\u00c5\u00c5\u00e5\u00e5\5\2zz\u00b5\u00b6\u00e9"+
		"\u00e9\3\2\u00d3\u00d4\4\2\66\66\u0126\u0126\4\2]]\u012c\u012c\4\2\u00e5"+
		"\u00e5\u0167\u0167\4\2\u00de\u00de\u00fd\u00fd\4\2\r\rUU\4\2ZZ\u0129\u0129"+
		"\4\2ff\u0106\u0106\5\2\63\63XX\u00f4\u00f4\4\2cc\u010f\u010f\4\2\u0110"+
		"\u0110\u0137\u0137\4\299\u0115\u0115!\2\5\5\16\16::>>oouu~~\u0088\u0088"+
		"\u008c\u008c\u0092\u0092\u009b\u009b\u009d\u009d\u00a6\u00a6\u00a8\u00a8"+
		"\u00ac\u00ac\u00ba\u00ba\u00c8\u00ca\u00cf\u00cf\u00df\u00df\u00ee\u00ee"+
		"\u0108\u0108\u010e\u010e\u0114\u0114\u011a\u011a\u011f\u011f\u0121\u0121"+
		"\u0124\u0124\u012e\u012e\u0133\u0133\u0135\u0135\u0141\u0141\u0dea\2\u0193"+
		"\3\2\2\2\4\u01a3\3\2\2\2\6\u01bc\3\2\2\2\b\u01c1\3\2\2\2\n\u01c5\3\2\2"+
		"\2\f\u01cb\3\2\2\2\16\u01cf\3\2\2\2\20\u01d3\3\2\2\2\22\u01e1\3\2\2\2"+
		"\24\u01ea\3\2\2\2\26\u01f2\3\2\2\2\30\u01fd\3\2\2\2\32\u020a\3\2\2\2\34"+
		"\u020c\3\2\2\2\36\u0215\3\2\2\2 \u0217\3\2\2\2\"\u021f\3\2\2\2$\u0221"+
		"\3\2\2\2&\u0236\3\2\2\2(\u0248\3\2\2\2*\u024f\3\2\2\2,\u0266\3\2\2\2."+
		"\u02a1\3\2\2\2\60\u02a3\3\2\2\2\62\u02a7\3\2\2\2\64\u02ab\3\2\2\2\66\u02af"+
		"\3\2\2\28\u02b3\3\2\2\2:\u02b7\3\2\2\2<\u02bb\3\2\2\2>\u02bd\3\2\2\2@"+
		"\u02c7\3\2\2\2B\u02c9\3\2\2\2D\u02dd\3\2\2\2F\u02ea\3\2\2\2H\u02f2\3\2"+
		"\2\2J\u02fc\3\2\2\2L\u0301\3\2\2\2N\u0307\3\2\2\2P\u030b\3\2\2\2R\u030f"+
		"\3\2\2\2T\u031c\3\2\2\2V\u031e\3\2\2\2X\u0332\3\2\2\2Z\u033e\3\2\2\2\\"+
		"\u0359\3\2\2\2^\u035d\3\2\2\2`\u035f\3\2\2\2b\u036f\3\2\2\2d\u0371\3\2"+
		"\2\2f\u03b8\3\2\2\2h\u03d5\3\2\2\2j\u03db\3\2\2\2l\u03dd\3\2\2\2n\u03e1"+
		"\3\2\2\2p\u03ea\3\2\2\2r\u03ee\3\2\2\2t\u03fa\3\2\2\2v\u03fc\3\2\2\2x"+
		"\u0461\3\2\2\2z\u0463\3\2\2\2|\u0472\3\2\2\2~\u0474\3\2\2\2\u0080\u047b"+
		"\3\2\2\2\u0082\u047d\3\2\2\2\u0084\u047f\3\2\2\2\u0086\u0481\3\2\2\2\u0088"+
		"\u0483\3\2\2\2\u008a\u0487\3\2\2\2\u008c\u0489\3\2\2\2\u008e\u0496\3\2"+
		"\2\2\u0090\u04a3\3\2\2\2\u0092\u04a5\3\2\2\2\u0094\u04ad\3\2\2\2\u0096"+
		"\u04b5\3\2\2\2\u0098\u04cc\3\2\2\2\u009a\u04cf\3\2\2\2\u009c\u04da\3\2"+
		"\2\2\u009e\u04dc\3\2\2\2\u00a0\u04e5\3\2\2\2\u00a2\u04f3\3\2\2\2\u00a4"+
		"\u04f9\3\2\2\2\u00a6\u050a\3\2\2\2\u00a8\u0510\3\2\2\2\u00aa\u0518\3\2"+
		"\2\2\u00ac\u051e\3\2\2\2\u00ae\u0522\3\2\2\2\u00b0\u0524\3\2\2\2\u00b2"+
		"\u0526\3\2\2\2\u00b4\u0528\3\2\2\2\u00b6\u0533\3\2\2\2\u00b8\u0541\3\2"+
		"\2\2\u00ba\u0543\3\2\2\2\u00bc\u0547\3\2\2\2\u00be\u054b\3\2\2\2\u00c0"+
		"\u054d\3\2\2\2\u00c2\u055f\3\2\2\2\u00c4\u0561\3\2\2\2\u00c6\u0569\3\2"+
		"\2\2\u00c8\u0579\3\2\2\2\u00ca\u057d\3\2\2\2\u00cc\u057f\3\2\2\2\u00ce"+
		"\u0581\3\2\2\2\u00d0\u0583\3\2\2\2\u00d2\u05a1\3\2\2\2\u00d4\u05a9\3\2"+
		"\2\2\u00d6\u05d6\3\2\2\2\u00d8\u05dc\3\2\2\2\u00da\u05e5\3\2\2\2\u00dc"+
		"\u05f1\3\2\2\2\u00de\u05fe\3\2\2\2\u00e0\u0600\3\2\2\2\u00e2\u064d\3\2"+
		"\2\2\u00e4\u0662\3\2\2\2\u00e6\u0664\3\2\2\2\u00e8\u06c7\3\2\2\2\u00ea"+
		"\u06e4\3\2\2\2\u00ec\u06e6\3\2\2\2\u00ee\u06ed\3\2\2\2\u00f0\u06f5\3\2"+
		"\2\2\u00f2\u070d\3\2\2\2\u00f4\u071d\3\2\2\2\u00f6\u071f\3\2\2\2\u00f8"+
		"\u0722\3\2\2\2\u00fa\u072c\3\2\2\2\u00fc\u0731\3\2\2\2\u00fe\u0737\3\2"+
		"\2\2\u0100\u0757\3\2\2\2\u0102\u076d\3\2\2\2\u0104\u076f\3\2\2\2\u0106"+
		"\u0779\3\2\2\2\u0108\u079c\3\2\2\2\u010a\u07a8\3\2\2\2\u010c\u07b4\3\2"+
		"\2\2\u010e\u07eb\3\2\2\2\u0110\u07f9\3\2\2\2\u0112\u07fb\3\2\2\2\u0114"+
		"\u0802\3\2\2\2\u0116\u0833\3\2\2\2\u0118\u0866\3\2\2\2\u011a\u0893\3\2"+
		"\2\2\u011c\u0895\3\2\2\2\u011e\u0899\3\2\2\2\u0120\u08af\3\2\2\2\u0122"+
		"\u08bd\3\2\2\2\u0124\u08bf\3\2\2\2\u0126\u08c7\3\2\2\2\u0128\u0903\3\2"+
		"\2\2\u012a\u0905\3\2\2\2\u012c\u0967\3\2\2\2\u012e\u0970\3\2\2\2\u0130"+
		"\u09b9\3\2\2\2\u0132\u09bb\3\2\2\2\u0134\u09c3\3\2\2\2\u0136\u09c5\3\2"+
		"\2\2\u0138\u09c7\3\2\2\2\u013a\u09ea\3\2\2\2\u013c\u0a3a\3\2\2\2\u013e"+
		"\u0a42\3\2\2\2\u0140\u0a44\3\2\2\2\u0142\u0a51\3\2\2\2\u0144\u0a53\3\2"+
		"\2\2\u0146\u0a61\3\2\2\2\u0148\u0a71\3\2\2\2\u014a\u0a74\3\2\2\2\u014c"+
		"\u0a79\3\2\2\2\u014e\u0a7f\3\2\2\2\u0150\u0a81\3\2\2\2\u0152\u0a9a\3\2"+
		"\2\2\u0154\u0a9c\3\2\2\2\u0156\u0abb\3\2\2\2\u0158\u0ac1\3\2\2\2\u015a"+
		"\u0acf\3\2\2\2\u015c\u0ad2\3\2\2\2\u015e\u0ad6\3\2\2\2\u0160\u0ad9\3\2"+
		"\2\2\u0162\u0add\3\2\2\2\u0164\u0ae7\3\2\2\2\u0166\u0b02\3\2\2\2\u0168"+
		"\u0b12\3\2\2\2\u016a\u0b2a\3\2\2\2\u016c\u0b65\3\2\2\2\u016e\u0b73\3\2"+
		"\2\2\u0170\u0b92\3\2\2\2\u0172\u0bb8\3\2\2\2\u0174\u0bba\3\2\2\2\u0176"+
		"\u0bc6\3\2\2\2\u0178\u0bd0\3\2\2\2\u017a\u0bd2\3\2\2\2\u017c\u0bde\3\2"+
		"\2\2\u017e\u0bec\3\2\2\2\u0180\u0bee\3\2\2\2\u0182\u0c07\3\2\2\2\u0184"+
		"\u0c2a\3\2\2\2\u0186\u0c48\3\2\2\2\u0188\u0c4c\3\2\2\2\u018a\u0c4e\3\2"+
		"\2\2\u018c\u0c50\3\2\2\2\u018e\u0c52\3\2\2\2\u0190\u0c56\3\2\2\2\u0192"+
		"\u0194\5\u0174\u00bb\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196"+
		"\3\2\2\2\u0195\u0197\5\26\f\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2"+
		"\u0197\u0199\3\2\2\2\u0198\u019a\5\30\r\2\u0199\u0198\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u019d\5\6\4\2\u019c\u019b\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u01a0\5\f\7\2\u019f\u019e\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\7\2\2\3\u01a2"+
		"\3\3\2\2\2\u01a3\u01a4\7\u0158\2\2\u01a4\5\3\2\2\2\u01a5\u01a7\5\u0186"+
		"\u00c4\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01a9\7\u00b7\2\2\u01a9\u01ab\5\u0186\u00c4\2\u01aa\u01ac\5\30\r\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\5\b"+
		"\5\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\7b\2\2\u01b1\u01b2\7\u00b7\2\2\u01b2\u01b3\5\u0186\u00c4\2\u01b3"+
		"\u01bd\3\2\2\2\u01b4\u01bd\5\u0186\u00c4\2\u01b5\u01b7\5\u0186\u00c4\2"+
		"\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01ba"+
		"\5\30\r\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2"+
		"\u01bb\u01bd\5\b\5\2\u01bc\u01a6\3\2\2\2\u01bc\u01b4\3\2\2\2\u01bc\u01b6"+
		"\3\2\2\2\u01bd\7\3\2\2\2\u01be\u01c2\5\n\6\2\u01bf\u01c2\5N(\2\u01c0\u01c2"+
		"\5\u0186\u00c4\2\u01c1\u01be\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3"+
		"\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\t\3\2\2\2\u01c5\u01c6\7L\2\2\u01c6\u01c7\t\2\2\2\u01c7\u01c8\5\u0186"+
		"\u00c4\2\u01c8\13\3\2\2\2\u01c9\u01cc\5\u0180\u00c1\2\u01ca\u01cc\5\20"+
		"\t\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\r\3\2\2\2\u01cf\u01d1\7\u00f8"+
		"\2\2\u01d0\u01d2\5\u00d4k\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\17\3\2\2\2\u01d3\u01d4\7\u0082\2\2\u01d4\u01d6\5\u00a6T\2\u01d5\u01d7"+
		"\5\22\n\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2"+
		"\u01d8\u01d9\5\u0186\u00c4\2\u01d9\u01db\5\30\r\2\u01da\u01dc\5N(\2\u01db"+
		"\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\7b"+
		"\2\2\u01de\u01df\7\u0082\2\2\u01df\u01e0\5\u0186\u00c4\2\u01e0\21\3\2"+
		"\2\2\u01e1\u01e5\7\u0151\2\2\u01e2\u01e4\5\24\13\2\u01e3\u01e2\3\2\2\2"+
		"\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\7\u0152\2\2\u01e9\23\3\2\2\2"+
		"\u01ea\u01ef\5\4\3\2\u01eb\u01ec\7\u0148\2\2\u01ec\u01ee\5\4\3\2\u01ed"+
		"\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\25\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f9\7\u0084\2\2\u01f3"+
		"\u01fa\5J&\2\u01f4\u01f5\5\u0186\u00c4\2\u01f5\u01f6\5\30\r\2\u01f6\u01f7"+
		"\7b\2\2\u01f7\u01f8\7\u0084\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f3\3\2\2"+
		"\2\u01f9\u01f4\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\5\u0186\u00c4\2"+
		"\u01fc\27\3\2\2\2\u01fd\u0201\5\32\16\2\u01fe\u0200\5\32\16\2\u01ff\u01fe"+
		"\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\31\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\7N\2\2\u0205\u0206\7P\2\2"+
		"\u0206\u020b\5\34\17\2\u0207\u0208\7M\2\2\u0208\u0209\7O\2\2\u0209\u020b"+
		"\5\34\17\2\u020a\u0204\3\2\2\2\u020a\u0207\3\2\2\2\u020b\33\3\2\2\2\u020c"+
		"\u020d\5\u0190\u00c9\2\u020d\u020e\7\f\2\2\u020e\u020f\5\36\20\2\u020f"+
		"\u0210\5\u0186\u00c4\2\u0210\35\3\2\2\2\u0211\u0216\5\"\22\2\u0212\u0216"+
		"\5 \21\2\u0213\u0216\5$\23\2\u0214\u0216\5@!\2\u0215\u0211\3\2\2\2\u0215"+
		"\u0212\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216\37\3\2\2"+
		"\2\u0217\u0218\7\u00aa\2\2\u0218\u0219\5\u014a\u00a6\2\u0219\u021a\7\u0155"+
		"\2\2\u021a\u021b\5\4\3\2\u021b!\3\2\2\2\u021c\u0220\5(\25\2\u021d\u0220"+
		"\5&\24\2\u021e\u0220\5*\26\2\u021f\u021c\3\2\2\2\u021f\u021d\3\2\2\2\u021f"+
		"\u021e\3\2\2\2\u0220#\3\2\2\2\u0221\u0222\t\3\2\2\u0222%\3\2\2\2\u0223"+
		"\u0237\t\4\2\2\u0224\u022d\t\5\2\2\u0225\u0226\7\u0151\2\2\u0226\u0229"+
		"\5\u00acW\2\u0227\u0228\7\u0148\2\2\u0228\u022a\5\u00acW\2\u0229\u0227"+
		"\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\7\u0152\2"+
		"\2\u022c\u022e\3\2\2\2\u022d\u0225\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0237"+
		"\3\2\2\2\u022f\u0234\t\6\2\2\u0230\u0231\7\u0151\2\2\u0231\u0232\5\u00ac"+
		"W\2\u0232\u0233\7\u0152\2\2\u0233\u0235\3\2\2\2\u0234\u0230\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0223\3\2\2\2\u0236\u0224\3\2"+
		"\2\2\u0236\u022f\3\2\2\2\u0237\'\3\2\2\2\u0238\u0239\t\7\2\2\u0239\u023a"+
		"\7\u0151\2\2\u023a\u023d\5\u00acW\2\u023b\u023c\7\u0148\2\2\u023c\u023e"+
		"\5\u00acW\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2"+
		"\2\u023f\u0240\7\u0152\2\2\u0240\u0249\3\2\2\2\u0241\u0246\t\b\2\2\u0242"+
		"\u0243\7\u0151\2\2\u0243\u0244\5\u00acW\2\u0244\u0245\7\u0152\2\2\u0245"+
		"\u0247\3\2\2\2\u0246\u0242\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2"+
		"\2\2\u0248\u0238\3\2\2\2\u0248\u0241\3\2\2\2\u0249)\3\2\2\2\u024a\u0250"+
		"\7B\2\2\u024b\u024c\7C\2\2\u024c\u0250\5,\27\2\u024d\u024e\7\u009e\2\2"+
		"\u024e\u0250\5.\30\2\u024f\u024a\3\2\2\2\u024f\u024b\3\2\2\2\u024f\u024d"+
		"\3\2\2\2\u0250+\3\2\2\2\u0251\u0252\7\u0142\2\2\u0252\u0253\7\u0120\2"+
		"\2\u0253\u0267\5\62\32\2\u0254\u0255\7\u00c0\2\2\u0255\u0256\7\u0120\2"+
		"\2\u0256\u0267\5\64\33\2\u0257\u0258\7D\2\2\u0258\u0259\7\u0120\2\2\u0259"+
		"\u0267\5\66\34\2\u025a\u025b\7\u008e\2\2\u025b\u025c\7\u0120\2\2\u025c"+
		"\u0267\58\35\2\u025d\u025e\7\u00bc\2\2\u025e\u025f\7\u0120\2\2\u025f\u0267"+
		"\5:\36\2\u0260\u0261\7\u0102\2\2\u0261\u0262\7\u0120\2\2\u0262\u0267\5"+
		"<\37\2\u0263\u0264\7\177\2\2\u0264\u0265\7\u0120\2\2\u0265\u0267\5> \2"+
		"\u0266\u0251\3\2\2\2\u0266\u0254\3\2\2\2\u0266\u0257\3\2\2\2\u0266\u025a"+
		"\3\2\2\2\u0266\u025d\3\2\2\2\u0266\u0260\3\2\2\2\u0266\u0263\3\2\2\2\u0267"+
		"-\3\2\2\2\u0268\u026d\7\u0142\2\2\u0269\u026a\7\u0151\2\2\u026a\u026b"+
		"\5\u00acW\2\u026b\u026c\7\u0152\2\2\u026c\u026e\3\2\2\2\u026d\u0269\3"+
		"\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\7\u0120\2\2"+
		"\u0270\u02a2\5\62\32\2\u0271\u0276\7\u00c0\2\2\u0272\u0273\7\u0151\2\2"+
		"\u0273\u0274\5\u00acW\2\u0274\u0275\7\u0152\2\2\u0275\u0277\3\2\2\2\u0276"+
		"\u0272\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\7\u0120"+
		"\2\2\u0279\u02a2\5\64\33\2\u027a\u027f\7D\2\2\u027b\u027c\7\u0151\2\2"+
		"\u027c\u027d\5\u00acW\2\u027d\u027e\7\u0152\2\2\u027e\u0280\3\2\2\2\u027f"+
		"\u027b\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\7\u0120"+
		"\2\2\u0282\u02a2\5\66\34\2\u0283\u0288\7\u008e\2\2\u0284\u0285\7\u0151"+
		"\2\2\u0285\u0286\5\u00acW\2\u0286\u0287\7\u0152\2\2\u0287\u0289\3\2\2"+
		"\2\u0288\u0284\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b"+
		"\7\u0120\2\2\u028b\u02a2\58\35\2\u028c\u0291\7\u00bc\2\2\u028d\u028e\7"+
		"\u0151\2\2\u028e\u028f\5\u00acW\2\u028f\u0290\7\u0152\2\2\u0290\u0292"+
		"\3\2\2\2\u0291\u028d\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0294\7\u0120\2\2\u0294\u02a2\5:\36\2\u0295\u029a\7\u0102\2\2\u0296\u0297"+
		"\7\u0151\2\2\u0297\u0298\5\u00acW\2\u0298\u0299\7\u0152\2\2\u0299\u029b"+
		"\3\2\2\2\u029a\u0296\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"\u029d\7\u0120\2\2\u029d\u02a2\5<\37\2\u029e\u029f\7\177\2\2\u029f\u02a0"+
		"\7\u0120\2\2\u02a0\u02a2\5> \2\u02a1\u0268\3\2\2\2\u02a1\u0271\3\2\2\2"+
		"\u02a1\u027a\3\2\2\2\u02a1\u0283\3\2\2\2\u02a1\u028c\3\2\2\2\u02a1\u0295"+
		"\3\2\2\2\u02a1\u029e\3\2\2\2\u02a2/\3\2\2\2\u02a3\u02a4\5\62\32\2\u02a4"+
		"\61\3\2\2\2\u02a5\u02a8\7\u0142\2\2\u02a6\u02a8\5\64\33\2\u02a7\u02a5"+
		"\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8\63\3\2\2\2\u02a9\u02ac\7\u00c0\2\2"+
		"\u02aa\u02ac\5\66\34\2\u02ab\u02a9\3\2\2\2\u02ab\u02aa\3\2\2\2\u02ac\65"+
		"\3\2\2\2\u02ad\u02b0\7D\2\2\u02ae\u02b0\58\35\2\u02af\u02ad\3\2\2\2\u02af"+
		"\u02ae\3\2\2\2\u02b0\67\3\2\2\2\u02b1\u02b4\7\u008e\2\2\u02b2\u02b4\5"+
		":\36\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b49\3\2\2\2\u02b5\u02b8"+
		"\7\u00bc\2\2\u02b6\u02b8\5<\37\2\u02b7\u02b5\3\2\2\2\u02b7\u02b6\3\2\2"+
		"\2\u02b8;\3\2\2\2\u02b9\u02bc\7\u0102\2\2\u02ba\u02bc\5> \2\u02bb\u02b9"+
		"\3\2\2\2\u02bb\u02ba\3\2\2\2\u02bc=\3\2\2\2\u02bd\u02c2\7\177\2\2\u02be"+
		"\u02bf\7\u0151\2\2\u02bf\u02c0\5\u00acW\2\u02c0\u02c1\7\u0152\2\2\u02c1"+
		"\u02c3\3\2\2\2\u02c2\u02be\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3?\3\2\2\2"+
		"\u02c4\u02c8\5B\"\2\u02c5\u02c8\5F$\2\u02c6\u02c8\5H%\2\u02c7\u02c4\3"+
		"\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c6\3\2\2\2\u02c8A\3\2\2\2\u02c9\u02db"+
		"\7\u00ed\2\2\u02ca\u02cb\5\u0186\u00c4\2\u02cb\u02d0\5\34\17\2\u02cc\u02cd"+
		"\7\u0148\2\2\u02cd\u02cf\5\34\17\2\u02ce\u02cc\3\2\2\2\u02cf\u02d2\3\2"+
		"\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2"+
		"\u02d0\3\2\2\2\u02d3\u02d4\7b\2\2\u02d4\u02d5\7\u00ed\2\2\u02d5\u02dc"+
		"\3\2\2\2\u02d6\u02d7\7\u00aa\2\2\u02d7\u02d8\5\u014a\u00a6\2\u02d8\u02d9"+
		"\7\u0155\2\2\u02d9\u02da\7\u0146\2\2\u02da\u02dc\3\2\2\2\u02db\u02ca\3"+
		"\2\2\2\u02db\u02d6\3\2\2\2\u02dcC\3\2\2\2\u02dd\u02de\7\u0153\2\2\u02de"+
		"\u02e6\5\u00acW\2\u02df\u02e0\7\u0148\2\2\u02e0\u02e7\5\u00acW\2\u02e1"+
		"\u02e2\7\u0148\2\2\u02e2\u02e3\5\u00acW\2\u02e3\u02e4\7\u0148\2\2\u02e4"+
		"\u02e5\5\u00acW\2\u02e5\u02e7\3\2\2\2\u02e6\u02df\3\2\2\2\u02e6\u02e1"+
		"\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\7\u0154\2"+
		"\2\u02e9E\3\2\2\2\u02ea\u02eb\7\25\2\2\u02eb\u02ec\5D#\2\u02ec\u02f0\7"+
		"\u00d2\2\2\u02ed\u02f1\5B\"\2\u02ee\u02f1\5\"\22\2\u02ef\u02f1\5$\23\2"+
		"\u02f0\u02ed\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02ef\3\2\2\2\u02f1G\3"+
		"\2\2\2\u02f2\u02f3\7_\2\2\u02f3\u02f4\7\25\2\2\u02f4\u02f5\7\u013d\2\2"+
		"\u02f5\u02f6\5\u00acW\2\u02f6\u02f7\7W\2\2\u02f7\u02fa\7\u00d2\2\2\u02f8"+
		"\u02fb\5B\"\2\u02f9\u02fb\5\"\22\2\u02fa\u02f8\3\2\2\2\u02fa\u02f9\3\2"+
		"\2\2\u02fbI\3\2\2\2\u02fc\u02fd\7\u0159\2\2\u02fdK\3\2\2\2\u02fe\u02ff"+
		"\5P)\2\u02ff\u0300\7\u014a\2\2\u0300\u0302\3\2\2\2\u0301\u02fe\3\2\2\2"+
		"\u0301\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\5R*\2\u0304M\3\2"+
		"\2\2\u0305\u0308\5L\'\2\u0306\u0308\5\u0174\u00bb\2\u0307\u0305\3\2\2"+
		"\2\u0307\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a"+
		"\3\2\2\2\u030aO\3\2\2\2\u030b\u030c\5\4\3\2\u030cQ\3\2\2\2\u030d\u0310"+
		"\5T+\2\u030e\u0310\5\u00bc_\2\u030f\u030d\3\2\2\2\u030f\u030e\3\2\2\2"+
		"\u0310S\3\2\2\2\u0311\u031d\5X-\2\u0312\u031d\5Z.\2\u0313\u0315\5\u012e"+
		"\u0098\2\u0314\u0316\7\u0149\2\2\u0315\u0314\3\2\2\2\u0315\u0316\3\2\2"+
		"\2\u0316\u031d\3\2\2\2\u0317\u031d\5\u00d8m\2\u0318\u031d\5\u011a\u008e"+
		"\2\u0319\u031d\5\u00f4{\2\u031a\u031d\5\u0102\u0082\2\u031b\u031d\5\u0110"+
		"\u0089\2\u031c\u0311\3\2\2\2\u031c\u0312\3\2\2\2\u031c\u0313\3\2\2\2\u031c"+
		"\u0317\3\2\2\2\u031c\u0318\3\2\2\2\u031c\u0319\3\2\2\2\u031c\u031a\3\2"+
		"\2\2\u031c\u031b\3\2\2\2\u031dU\3\2\2\2\u031e\u0321\7\u00ff\2\2\u031f"+
		"\u0322\5\u00aeX\2\u0320\u0322\5J&\2\u0321\u031f\3\2\2\2\u0321\u0320\3"+
		"\2\2\2\u0322\u0329\3\2\2\2\u0323\u0324\7\u0090\2\2\u0324\u0325\7z\2\2"+
		"\u0325\u032a\7\u00be\2\2\u0326\u0327\7\u0090\2\2\u0327\u0328\7\u00ab\2"+
		"\2\u0328\u032a\7\u00be\2\2\u0329\u0323\3\2\2\2\u0329\u0326\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u032f\3\2\2\2\u032b\u032c\7\u013e\2\2\u032c\u0330"+
		"\7\u0136\2\2\u032d\u032e\7\u00f9\2\2\u032e\u0330\5\u00aeX\2\u032f\u032b"+
		"\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330W\3\2\2\2\u0331"+
		"\u0333\7\17\2\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3"+
		"\2\2\2\u0334\u0335\5\u00aeX\2\u0335\u0336\7\u014b\2\2\u0336\u033b\5\u0096"+
		"L\2\u0337\u0338\7\u0148\2\2\u0338\u033a\5\u0096L\2\u0339\u0337\3\2\2\2"+
		"\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033cY\3"+
		"\2\2\2\u033d\u033b\3\2\2\2\u033e\u033f\7$\2\2\u033f\u034c\5\\/\2\u0340"+
		"\u0349\7\u0151\2\2\u0341\u0346\5^\60\2\u0342\u0343\7\u0148\2\2\u0343\u0345"+
		"\5^\60\2\u0344\u0342\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346"+
		"\u0347\3\2\2\2\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u0341\3\2"+
		"\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d\7\u0152\2\2\u034c"+
		"\u0340\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u0357\3\2\2\2\u034e\u034f\7\u00f9"+
		"\2\2\u034f\u0354\5\u00aeX\2\u0350\u0351\7\u0148\2\2\u0351\u0353\5\u00ae"+
		"X\2\u0352\u0350\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354"+
		"\u0355\3\2\2\2\u0355\u0358\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u034e\3\2"+
		"\2\2\u0357\u0358\3\2\2\2\u0358[\3\2\2\2\u0359\u035a\5\u00a6T\2\u035a]"+
		"\3\2\2\2\u035b\u035e\7\u0146\2\2\u035c\u035e\5\u0096L\2\u035d\u035b\3"+
		"\2\2\2\u035d\u035c\3\2\2\2\u035e_\3\2\2\2\u035f\u0361\7\u0086\2\2\u0360"+
		"\u0362\7\u014a\2\2\u0361\u0360\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363"+
		"\3\2\2\2\u0363\u0364\5P)\2\u0364\u0365\5\u0186\u00c4\2\u0365a\3\2\2\2"+
		"\u0366\u0370\t\t\2\2\u0367\u036c\5d\63\2\u0368\u0369\7\u00d8\2\2\u0369"+
		"\u036b\5d\63\2\u036a\u0368\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2"+
		"\2\2\u036c\u036d\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c\3\2\2\2\u036f"+
		"\u0366\3\2\2\2\u036f\u0367\3\2\2\2\u0370c\3\2\2\2\u0371\u0376\5f\64\2"+
		"\u0372\u0373\7\n\2\2\u0373\u0375\5f\64\2\u0374\u0372\3\2\2\2\u0375\u0378"+
		"\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377e\3\2\2\2\u0378"+
		"\u0376\3\2\2\2\u0379\u03b9\3\2\2\2\u037a\u037c\5n8\2\u037b\u037d\7\u00c9"+
		"\2\2\u037c\u037b\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\3\2\2\2\u037e"+
		"\u037f\7\u00aa\2\2\u037f\u0380\3\2\2\2\u0380\u0382\5n8\2\u0381\u0383\7"+
		"\u00c9\2\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\3\2\2\2"+
		"\u0384\u0385\7\u00aa\2\2\u0385\u0388\5n8\2\u0386\u0387\7\u0161\2\2\u0387"+
		"\u0389\7\u0162\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u03b9"+
		"\3\2\2\2\u038a\u038c\5n8\2\u038b\u038d\7\u00c9\2\2\u038c\u038b\3\2\2\2"+
		"\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\7\30\2\2\u038f\u0390"+
		"\3\2\2\2\u0390\u0392\5n8\2\u0391\u0393\7\u00c9\2\2\u0392\u0391\3\2\2\2"+
		"\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\7\30\2\2\u0395\u0396"+
		"\5n8\2\u0396\u0397\7\n\2\2\u0397\u0398\5n8\2\u0398\u03b9\3\2\2\2\u0399"+
		"\u039a\5n8\2\u039a\u039c\7\u00a0\2\2\u039b\u039d\7\u00c9\2\2\u039c\u039b"+
		"\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\7\u00cf\2"+
		"\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\5n8\2\u03a1\u03a3\7\u00a0\2\2\u03a2"+
		"\u03a4\7\u00c9\2\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5"+
		"\3\2\2\2\u03a5\u03a6\7\u00cf\2\2\u03a6\u03b9\3\2\2\2\u03a7\u03a8\5h\65"+
		"\2\u03a8\u03a9\5h\65\2\u03a9\u03b9\3\2\2\2\u03aa\u03ab\7\u00c9\2\2\u03ab"+
		"\u03ac\5b\62\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\7\u00c9\2\2\u03ae\u03af"+
		"\5b\62\2\u03af\u03b9\3\2\2\2\u03b0\u03b1\7\u0151\2\2\u03b1\u03b2\5b\62"+
		"\2\u03b2\u03b3\7\u0152\2\2\u03b3\u03b9\3\2\2\2\u03b4\u03b5\5n8\2\u03b5"+
		"\u03b6\5\u008eH\2\u03b6\u03b7\5n8\2\u03b7\u03b9\3\2\2\2\u03b8\u0379\3"+
		"\2\2\2\u03b8\u037a\3\2\2\2\u03b8\u038a\3\2\2\2\u03b8\u0399\3\2\2\2\u03b8"+
		"\u03a7\3\2\2\2\u03b8\u03aa\3\2\2\2\u03b8\u03b0\3\2\2\2\u03b8\u03b4\3\2"+
		"\2\2\u03b9g\3\2\2\2\u03ba\u03bb\5n8\2\u03bb\u03bd\5\u008eH\2\u03bc\u03be"+
		"\t\n\2\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"\u03c0\5l\67\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\5n8\2\u03c2\u03c4\5\u008e"+
		"H\2\u03c3\u03c5\t\n\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5"+
		"\u03c6\3\2\2\2\u03c6\u03c7\5l\67\2\u03c7\u03d6\3\2\2\2\u03c8\u03ca\7\u00c9"+
		"\2\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb"+
		"\u03cc\7j\2\2\u03cc\u03cd\5l\67\2\u03cd\u03cf\3\2\2\2\u03ce\u03d0\7\u00c9"+
		"\2\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d2\7j\2\2\u03d2\u03d3\5l\67\2\u03d3\u03d6\3\2\2\2\u03d4\u03d6\5l\67"+
		"\2\u03d5\u03ba\3\2\2\2\u03d5\u03c9\3\2\2\2\u03d5\u03d4\3\2\2\2\u03d6i"+
		"\3\2\2\2\u03d7\u03d8\5n8\2\u03d8\u03d9\5n8\2\u03d9\u03dc\3\2\2\2\u03da"+
		"\u03dc\5l\67\2\u03db\u03d7\3\2\2\2\u03db\u03da\3\2\2\2\u03dck\3\2\2\2"+
		"\u03dd\u03de\7\u0151\2\2\u03de\u03df\5\u0140\u00a1\2\u03df\u03e0\7\u0152"+
		"\2\2\u03e0m\3\2\2\2\u03e1\u03e6\5r:\2\u03e2\u03e3\t\13\2\2\u03e3\u03e5"+
		"\5r:\2\u03e4\u03e2\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6"+
		"\u03e7\3\2\2\2\u03e7o\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03eb\7\f\2\2"+
		"\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed"+
		"\5\4\3\2\u03edq\3\2\2\2\u03ee\u03f7\5v<\2\u03ef\u03f3\5t;\2\u03f0\u03f3"+
		"\7S\2\2\u03f1\u03f3\7\u0147\2\2\u03f2\u03ef\3\2\2\2\u03f2\u03f0\3\2\2"+
		"\2\u03f2\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6\5v<\2\u03f5\u03f2"+
		"\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8"+
		"s\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fb\7\u0146\2\2\u03fbu\3\2\2\2\u03fc"+
		"\u0401\5x=\2\u03fd\u03fe\7\u0157\2\2\u03fe\u0400\5x=\2\u03ff\u03fd\3\2"+
		"\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402"+
		"w\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0407\5~@\2\u0405\u0406\7\u012a\2"+
		"\2\u0406\u0408\5\60\31\2\u0407\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408"+
		"\u0409\3\2\2\2\u0409\u040c\5~@\2\u040a\u040b\7\u012a\2\2\u040b\u040d\5"+
		"\60\31\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u0462\3\2\2\2\u040e"+
		"\u0411\5|?\2\u040f\u0410\7\u012a\2\2\u0410\u0412\5\60\31\2\u0411\u040f"+
		"\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0416\5|?\2\u0414"+
		"\u0415\7\u012a\2\2\u0415\u0417\5\60\31\2\u0416\u0414\3\2\2\2\u0416\u0417"+
		"\3\2\2\2\u0417\u0462\3\2\2\2\u0418\u0419\5\u0088E\2\u0419\u041b\7\u0151"+
		"\2\2\u041a\u041c\t\f\2\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u0425\3\2\2\2\u041d\u0422\5n8\2\u041e\u041f\7\u0148\2\2\u041f\u0421\5"+
		"n8\2\u0420\u041e\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u041d\3\2"+
		"\2\2\u0425\u0426\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\7\u0152\2\2\u0428"+
		"\u0429\3\2\2\2\u0429\u042a\5\u0088E\2\u042a\u042c\7\u0151\2\2\u042b\u042d"+
		"\t\f\2\2\u042c\u042b\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0436\3\2\2\2\u042e"+
		"\u0433\5n8\2\u042f\u0430\7\u0148\2\2\u0430\u0432\5n8\2\u0431\u042f\3\2"+
		"\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434"+
		"\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0436\u042e\3\2\2\2\u0436\u0437\3\2"+
		"\2\2\u0437\u0438\3\2\2\2\u0438\u0439\7\u0152\2\2\u0439\u0462\3\2\2\2\u043a"+
		"\u043b\5\u0080A\2\u043b\u043c\7\u0151\2\2\u043c\u0441\5n8\2\u043d\u043e"+
		"\7\u0148\2\2\u043e\u0440\5n8\2\u043f\u043d\3\2\2\2\u0440\u0443\3\2\2\2"+
		"\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u0441"+
		"\3\2\2\2\u0444\u0445\7\u0152\2\2\u0445\u0446\3\2\2\2\u0446\u0447\5\u0080"+
		"A\2\u0447\u0448\7\u0151\2\2\u0448\u044d\5n8\2\u0449\u044a\7\u0148\2\2"+
		"\u044a\u044c\5n8\2\u044b\u0449\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b"+
		"\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0450\3\2\2\2\u044f\u044d\3\2\2\2\u0450"+
		"\u0451\7\u0152\2\2\u0451\u0462\3\2\2\2\u0452\u0453\t\13\2\2\u0453\u0454"+
		"\5n8\2\u0454\u0455\3\2\2\2\u0455\u0456\t\13\2\2\u0456\u0457\5n8\2\u0457"+
		"\u0462\3\2\2\2\u0458\u0459\7\u0151\2\2\u0459\u045a\5n8\2\u045a\u045b\7"+
		"\u0152\2\2\u045b\u045c\3\2\2\2\u045c\u045d\7\u0151\2\2\u045d\u045e\5n"+
		"8\2\u045e\u045f\7\u0152\2\2\u045f\u0462\3\2\2\2\u0460\u0462\5z>\2\u0461"+
		"\u0404\3\2\2\2\u0461\u040e\3\2\2\2\u0461\u0418\3\2\2\2\u0461\u043a\3\2"+
		"\2\2\u0461\u0452\3\2\2\2\u0461\u0458\3\2\2\2\u0461\u0460\3\2\2\2\u0462"+
		"y\3\2\2\2\u0463\u0464\7\u0151\2\2\u0464\u0467\5n8\2\u0465\u0466\7\u0148"+
		"\2\2\u0466\u0468\5n8\2\u0467\u0465\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u0467"+
		"\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\7\u0152\2"+
		"\2\u046c{\3\2\2\2\u046d\u0473\5\u00a8U\2\u046e\u0473\5J&\2\u046f\u0473"+
		"\7\u00cf\2\2\u0470\u0473\7o\2\2\u0471\u0473\7\u0124\2\2\u0472\u046d\3"+
		"\2\2\2\u0472\u046e\3\2\2\2\u0472\u046f\3\2\2\2\u0472\u0470\3\2\2\2\u0472"+
		"\u0471\3\2\2\2\u0473}\3\2\2\2\u0474\u0475\5\u0142\u00a2\2\u0475\u0476"+
		"\5\u0142\u00a2\2\u0476\177\3\2\2\2\u0477\u047c\5\u0084C\2\u0478\u047c"+
		"\5\u0086D\2\u0479\u047c\5\u0082B\2\u047a\u047c\5\u008aF\2\u047b\u0477"+
		"\3\2\2\2\u047b\u0478\3\2\2\2\u047b\u0479\3\2\2\2\u047b\u047a\3\2\2\2\u047c"+
		"\u0081\3\2\2\2\u047d\u047e\t\r\2\2\u047e\u0083\3\2\2\2\u047f\u0480\7\u00bd"+
		"\2\2\u0480\u0085\3\2\2\2\u0481\u0482\7\u00a8\2\2\u0482\u0087\3\2\2\2\u0483"+
		"\u0484\t\16\2\2\u0484\u0089\3\2\2\2\u0485\u0488\t\17\2\2\u0486\u0488\5"+
		"\u0190\u00c9\2\u0487\u0485\3\2\2\2\u0487\u0486\3\2\2\2\u0488\u008b\3\2"+
		"\2\2\u0489\u048a\7\u012e\2\2\u048a\u008d\3\2\2\2\u048b\u0497\7\u014b\2"+
		"\2\u048c\u0497\7\u014c\2\2\u048d\u0497\7\u014e\2\2\u048e\u0497\7\u014d"+
		"\2\2\u048f\u0497\7\u014f\2\2\u0490\u0497\7\u0150\2\2\u0491\u0497\7\u00aa"+
		"\2\2\u0492\u0494\7\u00c9\2\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"\u0495\3\2\2\2\u0495\u0497\7\u00b4\2\2\u0496\u048b\3\2\2\2\u0496\u048c"+
		"\3\2\2\2\u0496\u048d\3\2\2\2\u0496\u048e\3\2\2\2\u0496\u048f\3\2\2\2\u0496"+
		"\u0490\3\2\2\2\u0496\u0491\3\2\2\2\u0496\u0493\3\2\2\2\u0497\u008f\3\2"+
		"\2\2\u0498\u04a4\7\u0124\2\2\u0499\u04a4\7o\2\2\u049a\u04a0\5\u0092J\2"+
		"\u049b\u049c\5\u008eH\2\u049c\u049d\5\u0092J\2\u049d\u049f\3\2\2\2\u049e"+
		"\u049b\3\2\2\2\u049f\u04a2\3\2\2\2\u04a0\u049e\3\2\2\2\u04a0\u04a1\3\2"+
		"\2\2\u04a1\u04a4\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a3\u0498\3\2\2\2\u04a3"+
		"\u0499\3\2\2\2\u04a3\u049a\3\2\2\2\u04a4\u0091\3\2\2\2\u04a5\u04aa\5\u0094"+
		"K\2\u04a6\u04a7\7\u00d8\2\2\u04a7\u04a9\5\u0094K\2\u04a8\u04a6\3\2\2\2"+
		"\u04a9\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u0093"+
		"\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ad\u04b2\5\u0098M\2\u04ae\u04af\7\n\2"+
		"\2\u04af\u04b1\5\u0098M\2\u04b0\u04ae\3\2\2\2\u04b1\u04b4\3\2\2\2\u04b2"+
		"\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u0095\3\2\2\2\u04b4\u04b2\3\2"+
		"\2\2\u04b5\u04bb\5\u009aN\2\u04b6\u04ba\7+\2\2\u04b7\u04b8\7\u012f\2\2"+
		"\u04b8\u04ba\5J&\2\u04b9\u04b6\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba\u04bd"+
		"\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u0097\3\2\2\2\u04bd"+
		"\u04bb\3\2\2\2\u04be\u04cd\3\2\2\2\u04bf\u04c0\7\u00c9\2\2\u04c0\u04c1"+
		"\5\u0090I\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\7\u00c9\2\2\u04c3\u04c4\5"+
		"\u0090I\2\u04c4\u04cd\3\2\2\2\u04c5\u04c6\7\u0151\2\2\u04c6\u04c7\5\u0090"+
		"I\2\u04c7\u04c8\7\u0152\2\2\u04c8\u04cd\3\2\2\2\u04c9\u04ca\5\u009aN\2"+
		"\u04ca\u04cb\5\u009aN\2\u04cb\u04cd\3\2\2\2\u04cc\u04be\3\2\2\2\u04cc"+
		"\u04bf\3\2\2\2\u04cc\u04c5\3\2\2\2\u04cc\u04c9\3\2\2\2\u04cd\u0099\3\2"+
		"\2\2\u04ce\u04d0\5\u018e\u00c8\2\u04cf\u04ce\3\2\2\2\u04cf\u04d0\3\2\2"+
		"\2\u04d0\u04d1\3\2\2\2\u04d1\u04d7\5\u009eP\2\u04d2\u04d3\5\u009cO\2\u04d3"+
		"\u04d4\5\u009eP\2\u04d4\u04d6\3\2\2\2\u04d5\u04d2\3\2\2\2\u04d6\u04d9"+
		"\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u009b\3\2\2\2\u04d9"+
		"\u04d7\3\2\2\2\u04da\u04db\t\13\2\2\u04db\u009d\3\2\2\2\u04dc\u04e2\5"+
		"\u00a2R\2\u04dd\u04de\5\u00a0Q\2\u04de\u04df\5\u00a2R\2\u04df\u04e1\3"+
		"\2\2\2\u04e0\u04dd\3\2\2\2\u04e1\u04e4\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2"+
		"\u04e3\3\2\2\2\u04e3\u009f\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e5\u04e6\t\20"+
		"\2\2\u04e6\u00a1\3\2\2\2\u04e7\u04e9\7\u0088\2\2\u04e8\u04e7\3\2\2\2\u04e8"+
		"\u04e9\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04f4\5\u00a4S\2\u04eb\u04f4"+
		"\5\u00aeX\2\u04ec\u04f4\5\u00aaV\2\u04ed\u04ee\7\u0151\2\2\u04ee\u04ef"+
		"\5\u0096L\2\u04ef\u04f0\7\u0152\2\2\u04f0\u04f4\3\2\2\2\u04f1\u04f2\7"+
		"\u00c9\2\2\u04f2\u04f4\5\u00a2R\2\u04f3\u04e8\3\2\2\2\u04f3\u04eb\3\2"+
		"\2\2\u04f3\u04ec\3\2\2\2\u04f3\u04ed\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4"+
		"\u04f7\3\2\2\2\u04f5\u04f6\7\u012a\2\2\u04f6\u04f8\5\60\31\2\u04f7\u04f5"+
		"\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u00a3\3\2\2\2\u04f9\u0506\5\u00a6T"+
		"\2\u04fa\u0503\7\u0151\2\2\u04fb\u0500\5^\60\2\u04fc\u04fd\7\u0148\2\2"+
		"\u04fd\u04ff\5^\60\2\u04fe\u04fc\3\2\2\2\u04ff\u0502\3\2\2\2\u0500\u04fe"+
		"\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0504\3\2\2\2\u0502\u0500\3\2\2\2\u0503"+
		"\u04fb\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0507\7\u0152"+
		"\2\2\u0506\u04fa\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u00a5\3\2\2\2\u0508"+
		"\u050b\t\21\2\2\u0509\u050b\5\u0190\u00c9\2\u050a\u0508\3\2\2\2\u050a"+
		"\u0509\3\2\2\2\u050b\u00a7\3\2\2\2\u050c\u0511\5\u0188\u00c5\2\u050d\u0511"+
		"\5J&\2\u050e\u0511\5\u0190\u00c9\2\u050f\u0511\7\u00cf\2\2\u0510\u050c"+
		"\3\2\2\2\u0510\u050d\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u050f\3\2\2\2\u0511"+
		"\u00a9\3\2\2\2\u0512\u0519\5\u00acW\2\u0513\u0519\5\u0190\u00c9\2\u0514"+
		"\u0515\5\u018e\u00c8\2\u0515\u0516\5\4\3\2\u0516\u0519\3\2\2\2\u0517\u0519"+
		"\5J&\2\u0518\u0512\3\2\2\2\u0518\u0513\3\2\2\2\u0518\u0514\3\2\2\2\u0518"+
		"\u0517\3\2\2\2\u0519\u00ab\3\2\2\2\u051a\u051f\5\u0188\u00c5\2\u051b\u051c"+
		"\5\u018e\u00c8\2\u051c\u051d\5\u0188\u00c5\2\u051d\u051f\3\2\2\2\u051e"+
		"\u051a\3\2\2\2\u051e\u051b\3\2\2\2\u051f\u00ad\3\2\2\2\u0520\u0523\5\u00b0"+
		"Y\2\u0521\u0523\5\u00b6\\\2\u0522\u0520\3\2\2\2\u0522\u0521\3\2\2\2\u0523"+
		"\u00af\3\2\2\2\u0524\u0525\5\u00b2Z\2\u0525\u00b1\3\2\2\2\u0526\u0527"+
		"\5\u0190\u00c9\2\u0527\u00b3\3\2\2\2\u0528\u0529\7\u0153\2\2\u0529\u052e"+
		"\5\u0096L\2\u052a\u052b\7\u0148\2\2\u052b\u052d\5\u0096L\2\u052c\u052a"+
		"\3\2\2\2\u052d\u0530\3\2\2\2\u052e\u052c\3\2\2\2\u052e\u052f\3\2\2\2\u052f"+
		"\u0531\3\2\2\2\u0530\u052e\3\2\2\2\u0531\u0532\7\u0154\2\2\u0532\u00b5"+
		"\3\2\2\2\u0533\u0535\5\u00b8]\2\u0534\u0536\5\u00b4[\2\u0535\u0534\3\2"+
		"\2\2\u0535\u0536\3\2\2\2\u0536\u053f\3\2\2\2\u0537\u0538\7\u0155\2\2\u0538"+
		"\u0540\7\u0146\2\2\u0539\u053a\7\u0155\2\2\u053a\u053d\5\u00b6\\\2\u053b"+
		"\u053c\t\22\2\2\u053c\u053e\5\u00b6\\\2\u053d\u053b\3\2\2\2\u053d\u053e"+
		"\3\2\2\2\u053e\u0540\3\2\2\2\u053f\u0537\3\2\2\2\u053f\u0539\3\2\2\2\u053f"+
		"\u0540\3\2\2\2\u0540\u00b7\3\2\2\2\u0541\u0542\5\u0190\u00c9\2\u0542\u00b9"+
		"\3\2\2\2\u0543\u0544\5\u0190\u00c9\2\u0544\u00bb\3\2\2\2\u0545\u0548\5"+
		"\u00be`\2\u0546\u0548\5\u00c2b\2\u0547\u0545\3\2\2\2\u0547\u0546\3\2\2"+
		"\2\u0548\u00bd\3\2\2\2\u0549\u054c\5\u00c0a\2\u054a\u054c\5\u00d6l\2\u054b"+
		"\u0549\3\2\2\2\u054b\u054a\3\2\2\2\u054c\u00bf\3\2\2\2\u054d\u054e\7\u008f"+
		"\2\2\u054e\u054f\5\u0090I\2\u054f\u0551\7\u011c\2\2\u0550\u0552\5N(\2"+
		"\u0551\u0550\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0557\3\2\2\2\u0553\u0555"+
		"\7a\2\2\u0554\u0556\5N(\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556"+
		"\u0558\3\2\2\2\u0557\u0553\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\3\2"+
		"\2\2\u0559\u055a\7b\2\2\u055a\u055b\7\u008f\2\2\u055b\u00c1\3\2\2\2\u055c"+
		"\u0560\5\u00c4c\2\u055d\u0560\5\u00d0i\2\u055e\u0560\5\u00c6d\2\u055f"+
		"\u055c\3\2\2\2\u055f\u055d\3\2\2\2\u055f\u055e\3\2\2\2\u0560\u00c3\3\2"+
		"\2\2\u0561\u0562\7\u013b\2\2\u0562\u0564\5\u0090I\2\u0563\u0565\5N(\2"+
		"\u0564\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0567"+
		"\7b\2\2\u0567\u0568\7\u013b\2\2\u0568\u00c5\3\2\2\2\u0569\u056a\7y\2\2"+
		"\u056a\u056b\5\u00caf\2\u056b\u056c\7\u014b\2\2\u056c\u056f\5\u00c8e\2"+
		"\u056d\u056e\7\u0163\2\2\u056e\u0570\5\u00acW\2\u056f\u056d\3\2\2\2\u056f"+
		"\u0570\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0573\5\u0186\u00c4\2\u0572\u0574"+
		"\5N(\2\u0573\u0572\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u0576\7b\2\2\u0576\u0577\7y\2\2\u0577\u0578\5\u0186\u00c4\2\u0578\u00c7"+
		"\3\2\2\2\u0579\u057a\5\u00ccg\2\u057a\u057b\7\u0120\2\2\u057b\u057c\5"+
		"\u00ceh\2\u057c\u00c9\3\2\2\2\u057d\u057e\5\4\3\2\u057e\u00cb\3\2\2\2"+
		"\u057f\u0580\5\u0096L\2\u0580\u00cd\3\2\2\2\u0581\u0582\5\u0096L\2\u0582"+
		"\u00cf\3\2\2\2\u0583\u0584\7y\2\2\u0584\u0585\7`\2\2\u0585\u0588\5\u0096"+
		"L\2\u0586\u0587\7\u012f\2\2\u0587\u0589\5\u00d2j\2\u0588\u0586\3\2\2\2"+
		"\u0588\u0589\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u058b\7\u0099\2\2\u058b"+
		"\u058d\5\u00d2j\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u0590"+
		"\3\2\2\2\u058e\u058f\7\u013d\2\2\u058f\u0591\7\u00f3\2\2\u0590\u058e\3"+
		"\2\2\2\u0590\u0591\3\2\2\2\u0591\u0594\3\2\2\2\u0592\u0593\7\u013a\2\2"+
		"\u0593\u0595\5\u0096L\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595"+
		"\u0597\3\2\2\2\u0596\u0598\7\u00cc\2\2\u0597\u0596\3\2\2\2\u0597\u0598"+
		"\3\2\2\2\u0598\u059a\3\2\2\2\u0599\u059b\7\u00cd\2\2\u059a\u0599\3\2\2"+
		"\2\u059a\u059b\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059d\7\u014a\2\2\u059d"+
		"\u059e\5N(\2\u059e\u059f\7b\2\2\u059f\u05a0\5\u0186\u00c4\2\u05a0\u00d1"+
		"\3\2\2\2\u05a1\u05a6\5\u00aeX\2\u05a2\u05a3\7\u0148\2\2\u05a3\u05a5\5"+
		"\u00aeX\2\u05a4\u05a2\3\2\2\2\u05a5\u05a8\3\2\2\2\u05a6\u05a4\3\2\2\2"+
		"\u05a6\u05a7\3\2\2\2\u05a7\u00d3\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a9\u05ae"+
		"\5\u0096L\2\u05aa\u05ab\7\u0148\2\2\u05ab\u05ad\5\u0096L\2\u05ac\u05aa"+
		"\3\2\2\2\u05ad\u05b0\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2\2\2\u05af"+
		"\u00d5\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05b2\7%\2\2\u05b2\u05ba\5\u0096"+
		"L\2\u05b3\u05b4\7\u0138\2\2\u05b4\u05b6\5\u0096L\2\u05b5\u05b7\5N(\2\u05b6"+
		"\u05b5\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b9\3\2\2\2\u05b8\u05b3\3\2"+
		"\2\2\u05b9\u05bc\3\2\2\2\u05ba\u05b8\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb"+
		"\u05c1\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bd\u05bf\7\u00dd\2\2\u05be\u05c0"+
		"\5N(\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c2\3\2\2\2\u05c1"+
		"\u05bd\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\7b"+
		"\2\2\u05c4\u05c5\7%\2\2\u05c5\u05d7\3\2\2\2\u05c6\u05cd\7%\2\2\u05c7\u05c8"+
		"\7\u0138\2\2\u05c8\u05c9\5\u0090I\2\u05c9\u05ca\5N(\2\u05ca\u05cc\3\2"+
		"\2\2\u05cb\u05c7\3\2\2\2\u05cc\u05cf\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd"+
		"\u05ce\3\2\2\2\u05ce\u05d2\3\2\2\2\u05cf\u05cd\3\2\2\2\u05d0\u05d1\7\u00dd"+
		"\2\2\u05d1\u05d3\5N(\2\u05d2\u05d0\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4"+
		"\3\2\2\2\u05d4\u05d5\7b\2\2\u05d5\u05d7\7%\2\2\u05d6\u05b1\3\2\2\2\u05d6"+
		"\u05c6\3\2\2\2\u05d7\u00d7\3\2\2\2\u05d8\u05dd\5\u00dan\2\u05d9\u05dd"+
		"\5\u00e2r\2\u05da\u05dd\5\u00e8u\2\u05db\u05dd\5\u012c\u0097\2\u05dc\u05d8"+
		"\3\2\2\2\u05dc\u05d9\3\2\2\2\u05dc\u05da\3\2\2\2\u05dc\u05db\3\2\2\2\u05dd"+
		"\u00d9\3\2\2\2\u05de\u05e6\5V,\2\u05df\u05e6\5`\61\2\u05e0\u05e1\7\u0109"+
		"\2\2\u05e1\u05e6\5\u0096L\2\u05e2\u05e6\5\u00dep\2\u05e3\u05e6\5\u00e0"+
		"q\2\u05e4\u05e6\5\16\b\2\u05e5\u05de\3\2\2\2\u05e5\u05df\3\2\2\2\u05e5"+
		"\u05e0\3\2\2\2\u05e5\u05e2\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e5\u05e4\3\2"+
		"\2\2\u05e6\u00db\3\2\2\2\u05e7\u05e8\7y\2\2\u05e8\u05f2\7`\2\2\u05e9\u05f2"+
		"\7y\2\2\u05ea\u05f2\7%\2\2\u05eb\u05f2\78\2\2\u05ec\u05f2\7Y\2\2\u05ed"+
		"\u05f2\7\u0096\2\2\u05ee\u05f2\7\u00b5\2\2\u05ef\u05f2\7\u00f6\2\2\u05f0"+
		"\u05f2\7\u013b\2\2\u05f1\u05e7\3\2\2\2\u05f1\u05e9\3\2\2\2\u05f1\u05ea"+
		"\3\2\2\2\u05f1\u05eb\3\2\2\2\u05f1\u05ec\3\2\2\2\u05f1\u05ed\3\2\2\2\u05f1"+
		"\u05ee\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1\u05f0\3\2\2\2\u05f2\u00dd\3\2"+
		"\2\2\u05f3\u05f4\7i\2\2\u05f4\u05ff\5\u00dco\2\u05f5\u05f6\7i\2\2\u05f6"+
		"\u05fc\7\u00e8\2\2\u05f7\u05f8\7\u0151\2\2\u05f8\u05f9\5\u0096L\2\u05f9"+
		"\u05fa\7\u0152\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05fd\5\u0096L\2\u05fc\u05f7"+
		"\3\2\2\2\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05ff\3\2\2\2\u05fe"+
		"\u05f3\3\2\2\2\u05fe\u05f5\3\2\2\2\u05ff\u00df\3\2\2\2\u0600\u0601\79"+
		"\2\2\u0601\u0602\5\u00dco\2\u0602\u0603\5\u0186\u00c4\2\u0603\u00e1\3"+
		"\2\2\2\u0604\u0605\7\7\2\2\u0605\u0606\7\25\2\2\u0606\u0607\5\4\3\2\u0607"+
		"\u0608\5D#\2\u0608\u064e\3\2\2\2\u0609\u060a\7\u00af\2\2\u060a\u060b\5"+
		"\u00d2j\2\u060b\u0612\7\u0090\2\2\u060c\u0613\7\u0164\2\2\u060d\u0610"+
		"\7s\2\2\u060e\u0611\5\u00aeX\2\u060f\u0611\5J&\2\u0610\u060e\3\2\2\2\u0610"+
		"\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0613\3\2\2\2\u0612\u060c\3\2"+
		"\2\2\u0612\u060d\3\2\2\2\u0613\u064e\3\2\2\2\u0614\u0615\7E\2\2\u0615"+
		"\u0616\7\25\2\2\u0616\u064e\5\4\3\2\u0617\u0618\7\u00f7\2\2\u0618\u0619"+
		"\7\25\2\2\u0619\u061a\5\4\3\2\u061a\u061b\5D#\2\u061b\u064e\3\2\2\2\u061c"+
		"\u061d\7\u0080\2\2\u061d\u0622\5\u00aeX\2\u061e\u061f\7\u0148\2\2\u061f"+
		"\u0621\5\u00aeX\2\u0620\u061e\3\2\2\2\u0621\u0624\3\2\2\2\u0622\u0620"+
		"\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u064e\3\2\2\2\u0624\u0622\3\2\2\2\u0625"+
		"\u0626\7\u0095\2\2\u0626\u062b\5\u00aeX\2\u0627\u0628\7\u0148\2\2\u0628"+
		"\u062a\5\u00aeX\2\u0629\u0627\3\2\2\2\u062a\u062d\3\2\2\2\u062b\u0629"+
		"\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u0639\3\2\2\2\u062d\u062b\3\2\2\2\u062e"+
		"\u062f\7\u0120\2\2\u062f\u063a\7\u00cf\2\2\u0630\u0631\7\u00aa\2\2\u0631"+
		"\u0636\5\u0096L\2\u0632\u0633\7\u0148\2\2\u0633\u0635\5\u0096L\2\u0634"+
		"\u0632\3\2\2\2\u0635\u0638\3\2\2\2\u0636\u0634\3\2\2\2\u0636\u0637\3\2"+
		"\2\2\u0637\u063a\3\2\2\2\u0638\u0636\3\2\2\2\u0639\u062e\3\2\2\2\u0639"+
		"\u0630\3\2\2\2\u063a\u064e\3\2\2\2\u063b\u063c\7\u0130\2\2\u063c\u0641"+
		"\5\u00aeX\2\u063d\u063e\7\u0148\2\2\u063e\u0640\5\u00aeX\2\u063f\u063d"+
		"\3\2\2\2\u0640\u0643\3\2\2\2\u0641\u063f\3\2\2\2\u0641\u0642\3\2\2\2\u0642"+
		"\u0644\3\2\2\2\u0643\u0641\3\2\2\2\u0644\u0645\7\u00aa\2\2\u0645\u064a"+
		"\5\u0096L\2\u0646\u0647\7\u0148\2\2\u0647\u0649\5\u0096L\2\u0648\u0646"+
		"\3\2\2\2\u0649\u064c\3\2\2\2\u064a\u0648\3\2\2\2\u064a\u064b\3\2\2\2\u064b"+
		"\u064e\3\2\2\2\u064c\u064a\3\2\2\2\u064d\u0604\3\2\2\2\u064d\u0609\3\2"+
		"\2\2\u064d\u0614\3\2\2\2\u064d\u0617\3\2\2\2\u064d\u061c\3\2\2\2\u064d"+
		"\u0625\3\2\2\2\u064d\u063b\3\2\2\2\u064e\u00e3\3\2\2\2\u064f\u0650\7."+
		"\2\2\u0650\u0663\5\u0096L\2\u0651\u0663\t\23\2\2\u0652\u0653\7\"\2\2\u0653"+
		"\u0663\5\u00aeX\2\u0654\u0655\7\u011b\2\2\u0655\u0663\5\u00aeX\2\u0656"+
		"\u0658\5\u0096L\2\u0657\u0659\t\24\2\2\u0658\u0657\3\2\2\2\u0658\u0659"+
		"\3\2\2\2\u0659\u0660\3\2\2\2\u065a\u065e\7\u0140\2\2\u065b\u065c\7\u00fb"+
		"\2\2\u065c\u065d\7\u00b8\2\2\u065d\u065f\5\u00acW\2\u065e\u065b\3\2\2"+
		"\2\u065e\u065f\3\2\2\2\u065f\u0661\3\2\2\2\u0660\u065a\3\2\2\2\u0660\u0661"+
		"\3\2\2\2\u0661\u0663\3\2\2\2\u0662\u064f\3\2\2\2\u0662\u0651\3\2\2\2\u0662"+
		"\u0652\3\2\2\2\u0662\u0654\3\2\2\2\u0662\u0656\3\2\2\2\u0663\u00e5\3\2"+
		"\2\2\u0664\u0669\5\u00e4s\2\u0665\u0666\7\u0148\2\2\u0666\u0668\5\u00e4"+
		"s\2\u0667\u0665\3\2\2\2\u0668\u066b\3\2\2\2\u0669\u0667\3\2\2\2\u0669"+
		"\u066a\3\2\2\2\u066a\u00e7\3\2\2\2\u066b\u0669\3\2\2\2\u066c\u066d\7\u0111"+
		"\2\2\u066d\u066e\7\u00f6\2\2\u066e\u0676\5\u0190\u00c9\2\u066f\u0674\7"+
		"\u0120\2\2\u0670\u0675\5\u0096L\2\u0671\u0672\7\u00e2\2\2\u0672\u0675"+
		"\5\u0096L\2\u0673\u0675\7\u00e7\2\2\u0674\u0670\3\2\2\2\u0674\u0671\3"+
		"\2\2\2\u0674\u0673\3\2\2\2\u0675\u0677\3\2\2\2\u0676\u066f\3\2\2\2\u0676"+
		"\u0677\3\2\2\2\u0677\u0691\3\2\2\2\u0678\u068e\7\u013d\2\2\u0679\u067a"+
		"\7\u00a7\2\2\u067a\u067b\7\u00b8\2\2\u067b\u068d\5\u00acW\2\u067c\u067d"+
		"\7\u00fb\2\2\u067d\u067e\7\u00b8\2\2\u067e\u068d\5\u00acW\2\u067f\u0680"+
		"\7\u0122\2\2\u0680\u0681\7\u00b8\2\2\u0681\u068d\5\u00acW\2\u0682\u0683"+
		"\7\37\2\2\u0683\u0684\7\u00b8\2\2\u0684\u068d\5\u00acW\2\u0685\u0686\7"+
		"\u00de\2\2\u0686\u0687\7\u00a8\2\2\u0687\u068d\5\u00acW\2\u0688\u0689"+
		"\7\u0122\2\2\u0689\u068a\7\u00d2\2\2\u068a\u068b\7\u00de\2\2\u068b\u068d"+
		"\5J&\2\u068c\u0679\3\2\2\2\u068c\u067c\3\2\2\2\u068c\u067f\3\2\2\2\u068c"+
		"\u0682\3\2\2\2\u068c\u0685\3\2\2\2\u068c\u0688\3\2\2\2\u068d\u0690\3\2"+
		"\2\2\u068e\u068c\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0692\3\2\2\2\u0690"+
		"\u068e\3\2\2\2\u0691\u0678\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u06c8\3\2"+
		"\2\2\u0693\u0694\7\u0119\2\2\u0694\u0695\7\u00f6\2\2\u0695\u06c8\5\u0190"+
		"\u00c9\2\u0696\u0697\7t\2\2\u0697\u0698\7\u00f6\2\2\u0698\u06c8\5\u0190"+
		"\u00c9\2\u0699\u069b\7\u00e0\2\2\u069a\u069c\5J&\2\u069b\u069a\3\2\2\2"+
		"\u069b\u069c\3\2\2\2\u069c\u06c8\3\2\2\2\u069d\u069e\7\u00c4\2\2\u069e"+
		"\u069f\5\u0096L\2\u069f\u06a0\7\u00ad\2\2\u06a0\u06c8\3\2\2\2\u06a1\u06aa"+
		"\7\u00e6\2\2\u06a2\u06a4\5\u00e6t\2\u06a3\u06a2\3\2\2\2\u06a3\u06a4\3"+
		"\2\2\2\u06a4\u06a6\3\2\2\2\u06a5\u06a7\7\u0149\2\2\u06a6\u06a5\3\2\2\2"+
		"\u06a6\u06a7\3\2\2\2\u06a7\u06ab\3\2\2\2\u06a8\u06a9\7s\2\2\u06a9\u06ab"+
		"\5J&\2\u06aa\u06a3\3\2\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab"+
		"\u06c8\3\2\2\2\u06ac\u06b4\7\u0103\2\2\u06ad\u06ae\5\u0096L\2\u06ae\u06af"+
		"\t\25\2\2\u06af\u06b5\3\2\2\2\u06b0\u06b1\7\u0120\2\2\u06b1\u06b2\7\u0122"+
		"\2\2\u06b2\u06b3\7\u00d2\2\2\u06b3\u06b5\7\u00de\2\2\u06b4\u06ad\3\2\2"+
		"\2\u06b4\u06b0\3\2\2\2\u06b5\u06c8\3\2\2\2\u06b6\u06b7\7\u00db\2\2\u06b7"+
		"\u06b8\7\u0120\2\2\u06b8\u06b9\7\u00f6\2\2\u06b9\u06ba\5\u0190\u00c9\2"+
		"\u06ba\u06c3\7\u0151\2\2\u06bb\u06c0\5\u0096L\2\u06bc\u06bd\7\u0148\2"+
		"\2\u06bd\u06bf\5\u0096L\2\u06be\u06bc\3\2\2\2\u06bf\u06c2\3\2\2\2\u06c0"+
		"\u06be\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c4\3\2\2\2\u06c2\u06c0\3\2"+
		"\2\2\u06c3\u06bb\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5"+
		"\u06c6\7\u0152\2\2\u06c6\u06c8\3\2\2\2\u06c7\u066c\3\2\2\2\u06c7\u0693"+
		"\3\2\2\2\u06c7\u0696\3\2\2\2\u06c7\u0699\3\2\2\2\u06c7\u069d\3\2\2\2\u06c7"+
		"\u06a1\3\2\2\2\u06c7\u06ac\3\2\2\2\u06c7\u06b6\3\2\2\2\u06c8\u00e9\3\2"+
		"\2\2\u06c9\u06ce\5\4\3\2\u06ca\u06cb\7\u0153\2\2\u06cb\u06cc\5\u00acW"+
		"\2\u06cc\u06cd\7\u0154\2\2\u06cd\u06cf\3\2\2\2\u06ce\u06ca\3\2\2\2\u06ce"+
		"\u06cf\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d1\7\u0155\2\2\u06d1\u06d3"+
		"\3\2\2\2\u06d2\u06c9\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4"+
		"\u06e5\5\4\3\2\u06d5\u06da\5\4\3\2\u06d6\u06d7\7\u0153\2\2\u06d7\u06d8"+
		"\5\u00acW\2\u06d8\u06d9\7\u0154\2\2\u06d9\u06db\3\2\2\2\u06da\u06d6\3"+
		"\2\2\2\u06da\u06db\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06e2\7\u0155\2\2"+
		"\u06dd\u06e3\7\u0146\2\2\u06de\u06e0\5\4\3\2\u06df\u06e1\5\u00ecw\2\u06e0"+
		"\u06df\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e3\3\2\2\2\u06e2\u06dd\3\2"+
		"\2\2\u06e2\u06de\3\2\2\2\u06e3\u06e5\3\2\2\2\u06e4\u06d2\3\2\2\2\u06e4"+
		"\u06d5\3\2\2\2\u06e5\u00eb\3\2\2\2\u06e6\u06e9\t\22\2\2\u06e7\u06e8\7"+
		"\u0165\2\2\u06e8\u06ea\7\u0155\2\2\u06e9\u06e7\3\2\2\2\u06e9\u06ea\3\2"+
		"\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ec\5\4\3\2\u06ec\u00ed\3\2\2\2\u06ed"+
		"\u06f2\5\u0096L\2\u06ee\u06ef\7\u0148\2\2\u06ef\u06f1\5\u0096L\2\u06f0"+
		"\u06ee\3\2\2\2\u06f1\u06f4\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f2\u06f3\3\2"+
		"\2\2\u06f3\u00ef\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f5\u06fa\5\u0096L\2\u06f6"+
		"\u06f7\7\u0148\2\2\u06f7\u06f9\5\u0096L\2\u06f8\u06f6\3\2\2\2\u06f9\u06fc"+
		"\3\2\2\2\u06fa\u06f8\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u00f1\3\2\2\2\u06fc"+
		"\u06fa\3\2\2\2\u06fd\u06fe\7\26\2\2\u06fe\u070e\78\2\2\u06ff\u0700\7\4"+
		"\2\2\u0700\u070e\78\2\2\u0701\u0702\7\26\2\2\u0702\u0703\7q\2\2\u0703"+
		"\u070e\5\u00eex\2\u0704\u0705\7\4\2\2\u0705\u0706\7q\2\2\u0706\u070e\5"+
		"\u00eex\2\u0707\u0708\7\u00d4\2\2\u0708\u0709\7\u00a4\2\2\u0709\u070a"+
		"\7\u0151\2\2\u070a\u070b\5\u00f0y\2\u070b\u070c\7\u0152\2\2\u070c\u070e"+
		"\3\2\2\2\u070d\u06fd\3\2\2\2\u070d\u06ff\3\2\2\2\u070d\u0701\3\2\2\2\u070d"+
		"\u0704\3\2\2\2\u070d\u0707\3\2\2\2\u070e\u00f3\3\2\2\2\u070f\u0710\7\u00c5"+
		"\2\2\u0710\u0714\7q\2\2\u0711\u0715\5\u00eav\2\u0712\u0715\7\u00c5\2\2"+
		"\u0713\u0715\7\u00e5\2\2\u0714\u0711\3\2\2\2\u0714\u0712\3\2\2\2\u0714"+
		"\u0713\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u071e\5\u0186\u00c4\2\u0717\u0718"+
		"\79\2\2\u0718\u0719\78\2\2\u0719\u071e\5\u0186\u00c4\2\u071a\u071b\7i"+
		"\2\2\u071b\u071c\78\2\2\u071c\u071e\5\u0186\u00c4\2\u071d\u070f\3\2\2"+
		"\2\u071d\u0717\3\2\2\2\u071d\u071a\3\2\2\2\u071e\u00f5\3\2\2\2\u071f\u0720"+
		"\t\26\2\2\u0720\u00f7\3\2\2\2\u0721\u0723\t\27\2\2\u0722\u0721\3\2\2\2"+
		"\u0722\u0723\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0729\5\u00f6|\2\u0725"+
		"\u0726\7\u0148\2\2\u0726\u0728\5\u00f6|\2\u0727\u0725\3\2\2\2\u0728\u072b"+
		"\3\2\2\2\u0729\u0727\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u00f9\3\2\2\2\u072b"+
		"\u0729\3\2\2\2\u072c\u072d\t\30\2\2\u072d\u072e\7\u0151\2\2\u072e\u072f"+
		"\5\u00f8}\2\u072f\u0730\7\u0152\2\2\u0730\u00fb\3\2\2\2\u0731\u0733\5"+
		"\u00f2z\2\u0732\u0734\5N(\2\u0733\u0732\3\2\2\2\u0734\u0735\3\2\2\2\u0735"+
		"\u0733\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u00fd\3\2\2\2\u0737\u0744\78"+
		"\2\2\u0738\u0739\7!\2\2\u0739\u073a\7\u00c3\2\2\u073a\u073b\5\u00aeX\2"+
		"\u073b\u073c\7\u00d4\2\2\u073c\u073d\5\u0132\u009a\2\u073d\u0745\3\2\2"+
		"\2\u073e\u073f\5\u00aeX\2\u073f\u0740\7\u00d4\2\2\u0740\u0741\5\u0132"+
		"\u009a\2\u0741\u0742\7\u0081\2\2\u0742\u0743\5\u00eex\2\u0743\u0745\3"+
		"\2\2\2\u0744\u0738\3\2\2\2\u0744\u073e\3\2\2\2\u0745\u0747\3\2\2\2\u0746"+
		"\u0748\5\u00fa~\2\u0747\u0746\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u074b"+
		"\3\2\2\2\u0749\u074a\7\u008b\2\2\u074a\u074c\5\u00acW\2\u074b\u0749\3"+
		"\2\2\2\u074b\u074c\3\2\2\2\u074c\u0755\3\2\2\2\u074d\u074f\5\u00fc\177"+
		"\2\u074e\u074d\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u074e\3\2\2\2\u0750\u0751"+
		"\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0753\7b\2\2\u0753\u0754\78\2\2\u0754"+
		"\u0756\3\2\2\2\u0755\u074e\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u00ff\3\2"+
		"\2\2\u0757\u0758\7Y\2\2\u0758\u0759\7\25\2\2\u0759\u075a\5\u0096L\2\u075a"+
		"\u075b\7\u0120\2\2\u075b\u075d\5\u0096L\2\u075c\u075e\5\u00fa~\2\u075d"+
		"\u075c\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u0762\3\2\2\2\u075f\u0761\5\u0104"+
		"\u0083\2\u0760\u075f\3\2\2\2\u0761\u0764\3\2\2\2\u0762\u0760\3\2\2\2\u0762"+
		"\u0763\3\2\2\2\u0763\u0767\3\2\2\2\u0764\u0762\3\2\2\2\u0765\u0766\7b"+
		"\2\2\u0766\u0768\7Y\2\2\u0767\u0765\3\2\2\2\u0767\u0768\3\2\2\2\u0768"+
		"\u0101\3\2\2\2\u0769\u076a\79\2\2\u076a\u076e\7Y\2\2\u076b\u076c\7i\2"+
		"\2\u076c\u076e\7Y\2\2\u076d\u0769\3\2\2\2\u076d\u076b\3\2\2\2\u076e\u0103"+
		"\3\2\2\2\u076f\u0770\7\u00d4\2\2\u0770\u0771\7\u00a4\2\2\u0771\u0772\7"+
		"\u0151\2\2\u0772\u0773\5\u00f0y\2\u0773\u0775\7\u0152\2\2\u0774\u0776"+
		"\5N(\2\u0775\u0774\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u0775\3\2\2\2\u0777"+
		"\u0778\3\2\2\2\u0778\u0105\3\2\2\2\u0779\u0795\7Y\2\2\u077a\u077b\7!\2"+
		"\2\u077b\u077c\7\u00c3\2\2\u077c\u0781\5\u0096L\2\u077d\u077e\7\u0148"+
		"\2\2\u077e\u0780\5\u0096L\2\u077f\u077d\3\2\2\2\u0780\u0783\3\2\2\2\u0781"+
		"\u077f\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u0796\3\2\2\2\u0783\u0781\3\2"+
		"\2\2\u0784\u0789\5\u0096L\2\u0785\u0786\7\u0148\2\2\u0786\u0788\5\u0096"+
		"L\2\u0787\u0785\3\2\2\2\u0788\u078b\3\2\2\2\u0789\u0787\3\2\2\2\u0789"+
		"\u078a\3\2\2\2\u078a\u0793\3\2\2\2\u078b\u0789\3\2\2\2\u078c\u078d\7\u0120"+
		"\2\2\u078d\u0794\5\u00eex\2\u078e\u078f\7\20\2\2\u078f\u0790\5\u0096L"+
		"\2\u0790\u0791\7\u0148\2\2\u0791\u0792\5\u0096L\2\u0792\u0794\3\2\2\2"+
		"\u0793\u078c\3\2\2\2\u0793\u078e\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0796"+
		"\3\2\2\2\u0795\u077a\3\2\2\2\u0795\u0784\3\2\2\2\u0796\u0798\3\2\2\2\u0797"+
		"\u0799\5\u00fa~\2\u0798\u0797\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u079a"+
		"\3\2\2\2\u079a\u079b\5\u0186\u00c4\2\u079b\u0107\3\2\2\2\u079c\u079d\7"+
		"c\2\2\u079d\u07a2\5\u0096L\2\u079e\u079f\7\u0148\2\2\u079f\u07a1\5\u0096"+
		"L\2\u07a0\u079e\3\2\2\2\u07a1\u07a4\3\2\2\2\u07a2\u07a0\3\2\2\2\u07a2"+
		"\u07a3\3\2\2\2\u07a3\u07a6\3\2\2\2\u07a4\u07a2\3\2\2\2\u07a5\u07a7\5\u00fa"+
		"~\2\u07a6\u07a5\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u0109\3\2\2\2\u07a8"+
		"\u07a9\7\u00b6\2\2\u07a9\u07ae\5\u0096L\2\u07aa\u07ab\7\u0148\2\2\u07ab"+
		"\u07ad\5\u0096L\2\u07ac\u07aa\3\2\2\2\u07ad\u07b0\3\2\2\2\u07ae\u07ac"+
		"\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07b2\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b1"+
		"\u07b3\5\u00fa~\2\u07b2\u07b1\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u010b"+
		"\3\2\2\2\u07b4\u07b5\7\u00e9\2\2\u07b5\u07ba\5\u0096L\2\u07b6\u07b7\7"+
		"\u0148\2\2\u07b7\u07b9\5\u0096L\2\u07b8\u07b6\3\2\2\2\u07b9\u07bc\3\2"+
		"\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07be\3\2\2\2\u07bc"+
		"\u07ba\3\2\2\2\u07bd\u07bf\5\u00fa~\2\u07be\u07bd\3\2\2\2\u07be\u07bf"+
		"\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0\u07c2\7y\2\2\u07c1\u07c3\7&\2\2\u07c2"+
		"\u07c1\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c7\5\u00ae"+
		"X\2\u07c5\u07c6\7\u008b\2\2\u07c6\u07c8\5\u00acW\2\u07c7\u07c5\3\2\2\2"+
		"\u07c7\u07c8\3\2\2\2\u07c8\u07ca\3\2\2\2\u07c9\u07cb\5\u00fa~\2\u07ca"+
		"\u07c9\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07db\3\2\2\2\u07cc\u07cd\7\u00d4"+
		"\2\2\u07cd\u07ce\7\u00a4\2\2\u07ce\u07cf\7\u0151\2\2\u07cf\u07d0\5\u00f0"+
		"y\2\u07d0\u07d2\7\u0152\2\2\u07d1\u07d3\5N(\2\u07d2\u07d1\3\2\2\2\u07d2"+
		"\u07d3\3\2\2\2\u07d3\u07d5\3\2\2\2\u07d4\u07cc\3\2\2\2\u07d5\u07d8\3\2"+
		"\2\2\u07d6\u07d4\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07d9\3\2\2\2\u07d8"+
		"\u07d6\3\2\2\2\u07d9\u07da\7b\2\2\u07da\u07dc\7\u00e9\2\2\u07db\u07d6"+
		"\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u010d\3\2\2\2\u07dd\u07de\t\31\2\2"+
		"\u07de\u07ec\t\32\2\2\u07df\u07e0\7\26\2\2\u07e0\u07e1\7q\2\2\u07e1\u07ec"+
		"\5\u00eex\2\u07e2\u07e3\7\4\2\2\u07e3\u07e4\7q\2\2\u07e4\u07ec\5\u00ee"+
		"x\2\u07e5\u07e6\7\u00d4\2\2\u07e6\u07e7\7\u00a4\2\2\u07e7\u07e8\7\u0151"+
		"\2\2\u07e8\u07e9\5\u00f0y\2\u07e9\u07ea\7\u0152\2\2\u07ea\u07ec\3\2\2"+
		"\2\u07eb\u07dd\3\2\2\2\u07eb\u07df\3\2\2\2\u07eb\u07e2\3\2\2\2\u07eb\u07e5"+
		"\3\2\2\2\u07ec\u010f\3\2\2\2\u07ed\u07ee\7\u00c5\2\2\u07ee\u07f1\7q\2"+
		"\2\u07ef\u07f2\5\u00eav\2\u07f0\u07f2\t\33\2\2\u07f1\u07ef\3\2\2\2\u07f1"+
		"\u07f0\3\2\2\2\u07f2\u07fa\3\2\2\2\u07f3\u07f4\79\2\2\u07f4\u07f8\7\u0096"+
		"\2\2\u07f5\u07f6\7i\2\2\u07f6\u07f8\7\u0096\2\2\u07f7\u07f3\3\2\2\2\u07f7"+
		"\u07f5\3\2\2\2\u07f8\u07fa\3\2\2\2\u07f9\u07ed\3\2\2\2\u07f9\u07f7\3\2"+
		"\2\2\u07fa\u0111\3\2\2\2\u07fb\u07ff\5\u010e\u0088\2\u07fc\u07fe\5N(\2"+
		"\u07fd\u07fc\3\2\2\2\u07fe\u0801\3\2\2\2\u07ff\u07fd\3\2\2\2\u07ff\u0800"+
		"\3\2\2\2\u0800\u0113\3\2\2\2\u0801\u07ff\3\2\2\2\u0802\u0820\7\u0096\2"+
		"\2\u0803\u0804\7!\2\2\u0804\u0805\7\u00c3\2\2\u0805\u080a\5\u0096L\2\u0806"+
		"\u0807\7\u0148\2\2\u0807\u0809\5\u0096L\2\u0808\u0806\3\2\2\2\u0809\u080c"+
		"\3\2\2\2\u080a\u0808\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u080f\3\2\2\2\u080c"+
		"\u080a\3\2\2\2\u080d\u080e\7\u013e\2\2\u080e\u0810\7K\2\2\u080f\u080d"+
		"\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0821\3\2\2\2\u0811\u0816\5\u0096L"+
		"\2\u0812\u0813\7\u0148\2\2\u0813\u0815\5\u0096L\2\u0814\u0812\3\2\2\2"+
		"\u0815\u0818\3\2\2\2\u0816\u0814\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u081b"+
		"\3\2\2\2\u0818\u0816\3\2\2\2\u0819\u081a\7\u013e\2\2\u081a\u081c\7K\2"+
		"\2\u081b\u0819\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u081e"+
		"\7\u0081\2\2\u081e\u081f\5\u00eex\2\u081f\u0821\3\2\2\2\u0820\u0803\3"+
		"\2\2\2\u0820\u0811\3\2\2\2\u0821\u0823\3\2\2\2\u0822\u0824\5\u00fa~\2"+
		"\u0823\u0822\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0827\3\2\2\2\u0825\u0826"+
		"\7\u008b\2\2\u0826\u0828\5\u00acW\2\u0827\u0825\3\2\2\2\u0827\u0828\3"+
		"\2\2\2\u0828\u0831\3\2\2\2\u0829\u082b\5\u0112\u008a\2\u082a\u0829\3\2"+
		"\2\2\u082b\u082c\3\2\2\2\u082c\u082a\3\2\2\2\u082c\u082d\3\2\2\2\u082d"+
		"\u082e\3\2\2\2\u082e\u082f\7b\2\2\u082f\u0830\7\u0096\2\2\u0830\u0832"+
		"\3\2\2\2\u0831\u082a\3\2\2\2\u0831\u0832\3\2\2\2\u0832\u0115\3\2\2\2\u0833"+
		"\u0834\7\u0096\2\2\u0834\u0835\7\25\2\2\u0835\u0838\5\u0096L\2\u0836\u0837"+
		"\7\u013e\2\2\u0837\u0839\7K\2\2\u0838\u0836\3\2\2\2\u0838\u0839\3\2\2"+
		"\2\u0839\u083a\3\2\2\2\u083a\u083b\7\u0081\2\2\u083b\u0840\5\u0096L\2"+
		"\u083c\u083d\7\u0148\2\2\u083d\u083f\5\u0096L\2\u083e\u083c\3\2\2\2\u083f"+
		"\u0842\3\2\2\2\u0840\u083e\3\2\2\2\u0840\u0841\3\2\2\2\u0841\u0845\3\2"+
		"\2\2\u0842\u0840\3\2\2\2\u0843\u0844\7\u008b\2\2\u0844\u0846\5\u00acW"+
		"\2\u0845\u0843\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u0848\3\2\2\2\u0847\u0849"+
		"\5\u00fa~\2\u0848\u0847\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u0852\3\2\2"+
		"\2\u084a\u084c\5\u0112\u008a\2\u084b\u084a\3\2\2\2\u084c\u084d\3\2\2\2"+
		"\u084d\u084b\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0850"+
		"\7b\2\2\u0850\u0851\7\u0096\2\2\u0851\u0853\3\2\2\2\u0852\u084b\3\2\2"+
		"\2\u0852\u0853\3\2\2\2\u0853\u0117\3\2\2\2\u0854\u0855\7\26\2\2\u0855"+
		"\u0867\7\u00b5\2\2\u0856\u085c\7\60\2\2\u0857\u0858\7\u00a4\2\2\u0858"+
		"\u0859\7\u0151\2\2\u0859\u085a\5\u00f0y\2\u085a\u085b\7\u0152\2\2\u085b"+
		"\u085d\3\2\2\2\u085c\u0857\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u085e\3\2"+
		"\2\2\u085e\u0860\5\u0096L\2\u085f\u0861\5\u0096L\2\u0860\u085f\3\2\2\2"+
		"\u0860\u0861\3\2\2\2\u0861\u0864\3\2\2\2\u0862\u0863\7\u008b\2\2\u0863"+
		"\u0865\5\u00acW\2\u0864\u0862\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0867"+
		"\3\2\2\2\u0866\u0854\3\2\2\2\u0866\u0856\3\2\2\2\u0867\u0119\3\2\2\2\u0868"+
		"\u0869\7\u00c5\2\2\u0869\u086c\7\u00d6\2\2\u086a\u086d\5\u0096L\2\u086b"+
		"\u086d\7\b\2\2\u086c\u086a\3\2\2\2\u086c\u086b\3\2\2\2\u086d\u0872\3\2"+
		"\2\2\u086e\u086f\7\u0148\2\2\u086f\u0871\5\u0096L\2\u0870\u086e\3\2\2"+
		"\2\u0871\u0874\3\2\2\2\u0872\u0870\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0894"+
		"\3\2\2\2\u0874\u0872\3\2\2\2\u0875\u0876\7\u0107\2\2\u0876\u0879\7\u00d6"+
		"\2\2\u0877\u087a\5\u0096L\2\u0878\u087a\7\b\2\2\u0879\u0877\3\2\2\2\u0879"+
		"\u0878\3\2\2\2\u087a\u087f\3\2\2\2\u087b\u087c\7\u0148\2\2\u087c\u087e"+
		"\5\u0096L\2\u087d\u087b\3\2\2\2\u087e\u0881\3\2\2\2\u087f\u087d\3\2\2"+
		"\2\u087f\u0880\3\2\2\2\u0880\u0894\3\2\2\2\u0881\u087f\3\2\2\2\u0882\u0883"+
		"\7\u008c\2\2\u0883\u0886\7\u00d6\2\2\u0884\u0887\5\u0096L\2\u0885\u0887"+
		"\7\b\2\2\u0886\u0884\3\2\2\2\u0886\u0885\3\2\2\2\u0887\u088c\3\2\2\2\u0888"+
		"\u0889\7\u0148\2\2\u0889\u088b\5\u0096L\2\u088a\u0888\3\2\2\2\u088b\u088e"+
		"\3\2\2\2\u088c\u088a\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u0894\3\2\2\2\u088e"+
		"\u088c\3\2\2\2\u088f\u0890\79\2\2\u0890\u0894\7\u00b5\2\2\u0891\u0892"+
		"\7i\2\2\u0892\u0894\7\u00b5\2\2\u0893\u0868\3\2\2\2\u0893\u0875\3\2\2"+
		"\2\u0893\u0882\3\2\2\2\u0893\u088f\3\2\2\2\u0893\u0891\3\2\2\2\u0894\u011b"+
		"\3\2\2\2\u0895\u0897\5\u0118\u008d\2\u0896\u0898\5N(\2\u0897\u0896\3\2"+
		"\2\2\u0897\u0898\3\2\2\2\u0898\u011d\3\2\2\2\u0899\u089a\7\u00b5\2\2\u089a"+
		"\u089e\5\u0096L\2\u089b\u089d\5\u011c\u008f\2\u089c\u089b\3\2\2\2\u089d"+
		"\u08a0\3\2\2\2\u089e\u089c\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a1\3\2"+
		"\2\2\u08a0\u089e\3\2\2\2\u08a1\u08a2\7b\2\2\u08a2\u08a3\7\u00b5\2\2\u08a3"+
		"\u011f\3\2\2\2\u08a4\u08a7\7u\2\2\u08a5\u08a6\7\u0144\2\2\u08a6\u08a8"+
		"\5\u00acW\2\u08a7\u08a5\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8\u08b0\3\2\2"+
		"\2\u08a9\u08b0\5\u00acW\2\u08aa\u08ad\7\u00a6\2\2\u08ab\u08ac\7\u0145"+
		"\2\2\u08ac\u08ae\5\u00acW\2\u08ad\u08ab\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae"+
		"\u08b0\3\2\2\2\u08af\u08a4\3\2\2\2\u08af\u08a9\3\2\2\2\u08af\u08aa\3\2"+
		"\2\2\u08b0\u0121\3\2\2\2\u08b1\u08be\t\27\2\2\u08b2\u08be\7\u00fa\2\2"+
		"\u08b3\u08be\7\36\2\2\u08b4\u08b5\t\34\2\2";
	private static final String _serializedATNSegment1 =
		"\u08b5\u08b6\7\u00ab\2\2\u08b6\u08be\5\u0120\u0091\2\u08b7\u08b8\7\61"+
		"\2\2\u08b8\u08bb\7\u00ab\2\2\u08b9\u08bc\5\u0120\u0091\2\u08ba\u08bc\7"+
		"\u00d3\2\2\u08bb\u08b9\3\2\2\2\u08bb\u08ba\3\2\2\2\u08bc\u08be\3\2\2\2"+
		"\u08bd\u08b1\3\2\2\2\u08bd\u08b2\3\2\2\2\u08bd\u08b3\3\2\2\2\u08bd\u08b4"+
		"\3\2\2\2\u08bd\u08b7\3\2\2\2\u08be\u0123\3\2\2\2\u08bf\u08c4\5\u0122\u0092"+
		"\2\u08c0\u08c1\7\u0148\2\2\u08c1\u08c3\5\u0122\u0092\2\u08c2\u08c0\3\2"+
		"\2\2\u08c3\u08c6\3\2\2\2\u08c4\u08c2\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5"+
		"\u0125\3\2\2\2\u08c6\u08c4\3\2\2\2\u08c7\u08c8\t\30\2\2\u08c8\u08c9\7"+
		"\u0151\2\2\u08c9\u08ca\5\u0124\u0093\2\u08ca\u08cb\7\u0152\2\2\u08cb\u0127"+
		"\3\2\2\2\u08cc\u08cd\7\u00b6\2\2\u08cd\u08ce\7\u00ab\2\2\u08ce\u0904\5"+
		"\u0096L\2\u08cf\u08d0\7\u00e9\2\2\u08d0\u08d1\7\u00ab\2\2\u08d1\u0904"+
		"\5\u0096L\2\u08d2\u08d3\7\u00b5\2\2\u08d3\u08d4\7\u00ab\2\2\u08d4\u0904"+
		"\5\u0096L\2\u08d5\u08d6\7\61\2\2\u08d6\u08d7\7\u00ab\2\2\u08d7\u0904\5"+
		"\u0096L\2\u08d8\u08d9\7c\2\2\u08d9\u08da\7\u00ab\2\2\u08da\u0904\5\u0096"+
		"L\2\u08db\u08dc\7z\2\2\u08dc\u08dd\7\u00ab\2\2\u08dd\u0904\5\u0096L\2"+
		"\u08de\u08e2\7\u0096\2\2\u08df\u08e3\7\u0166\2\2\u08e0\u08e1\7\u00c8\2"+
		"\2\u08e1\u08e3\7\u0166\2\2\u08e2\u08df\3\2\2\2\u08e2\u08e0\3\2\2\2\u08e3"+
		"\u0904\3\2\2\2\u08e4\u08e5\7\u0097\2\2\u08e5\u08e6\7\u00a4\2\2\u08e6\u0904"+
		"\5\u0096L\2\u08e7\u08e8\7Q\2\2\u08e8\u08e9\7\u00a4\2\2\u08e9\u0904\5\u0096"+
		"L\2\u08ea\u08eb\7\u00c5\2\2\u08eb\u08ec\7\u00a4\2\2\u08ec\u0904\5\u0096"+
		"L\2\u08ed\u08ee\7\u00e5\2\2\u08ee\u08ef\7\u00a4\2\2\u08ef\u0904\5\u0096"+
		"L\2\u08f0\u08f1\7\5\2\2\u08f1\u08f2\7\u00a4\2\2\u08f2\u0904\5\u0096L\2"+
		"\u08f3\u08f4\7\u008b\2\2\u08f4\u08f5\7s\2\2\u08f5\u0904\5\u0096L\2\u08f6"+
		"\u08f7\7\u008b\2\2\u08f7\u08f8\7\u00a4\2\2\u08f8\u0904\5\u0096L\2\u08f9"+
		"\u08fa\7\u0096\2\2\u08fa\u0904\5\u00fa~\2\u08fb\u08fc\7Y\2\2\u08fc\u0904"+
		"\5\u00fa~\2\u08fd\u08fe\7\u010e\2\2\u08fe\u08ff\7\u009d\2\2\u08ff\u0904"+
		"\t\35\2\2\u0900\u0901\7q\2\2\u0901\u0902\7\u00da\2\2\u0902\u0904\t\36"+
		"\2\2\u0903\u08cc\3\2\2\2\u0903\u08cf\3\2\2\2\u0903\u08d2\3\2\2\2\u0903"+
		"\u08d5\3\2\2\2\u0903\u08d8\3\2\2\2\u0903\u08db\3\2\2\2\u0903\u08de\3\2"+
		"\2\2\u0903\u08e4\3\2\2\2\u0903\u08e7\3\2\2\2\u0903\u08ea\3\2\2\2\u0903"+
		"\u08ed\3\2\2\2\u0903\u08f0\3\2\2\2\u0903\u08f3\3\2\2\2\u0903\u08f6\3\2"+
		"\2\2\u0903\u08f9\3\2\2\2\u0903\u08fb\3\2\2\2\u0903\u08fd\3\2\2\2\u0903"+
		"\u0900\3\2\2\2\u0904\u0129\3\2\2\2\u0905\u0906\7\u00d7\2\2\u0906\u090b"+
		"\5\u0128\u0095\2\u0907\u0908\7\u0148\2\2\u0908\u090a\5\u0128\u0095\2\u0909"+
		"\u0907\3\2\2\2\u090a\u090d\3\2\2\2\u090b\u0909\3\2\2\2\u090b\u090c\3\2"+
		"\2\2\u090c\u012b\3\2\2\2\u090d\u090b\3\2\2\2\u090e\u0917\7*\2\2\u090f"+
		"\u0918\7z\2\2\u0910\u0911\7\u013f\2\2\u0911\u0918\5\4\3\2\u0912\u0914"+
		"\7\u013f\2\2\u0913\u0912\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u0915\3\2\2"+
		"\2\u0915\u0918\7\u0100\2\2\u0916\u0918\5\u00eex\2\u0917\u090f\3\2\2\2"+
		"\u0917\u0910\3\2\2\2\u0917\u0913\3\2\2\2\u0917\u0916\3\2\2\2\u0918\u0968"+
		"\3\2\2\2\u0919\u091a\7,\2\2\u091a\u091b\7\u013f\2\2\u091b\u091c\5\4\3"+
		"\2\u091c\u091d\5\u0186\u00c4\2\u091d\u0968\3\2\2\2\u091e\u091f\7,\2\2"+
		"\u091f\u0920\7z\2\2\u0920\u0921\5\4\3\2\u0921\u0922\5\u0186\u00c4\2\u0922"+
		"\u0968\3\2\2\2\u0923\u0968\5\u00fe\u0080\2\u0924\u0925\7>\2\2\u0925\u0926"+
		"\7\u013f\2\2\u0926\u0929\7\u00a0\2\2\u0927\u092a\7\u0100\2\2\u0928\u092a"+
		"\5\4\3\2\u0929\u0927\3\2\2\2\u0929\u0928\3\2\2\2\u092a\u092b\3\2\2\2\u092b"+
		"\u0968\5\u0186\u00c4\2\u092c\u0968\5\u0106\u0084\2\u092d\u0968\5\u0100"+
		"\u0081\2\u092e\u092f\7Y\2\2\u092f\u0930\7z\2\2\u0930\u0932\5\4\3\2\u0931"+
		"\u0933\5\u00fa~\2\u0932\u0931\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0934"+
		"\3\2\2\2\u0934\u0935\5\u0186\u00c4\2\u0935\u0968\3\2\2\2\u0936\u0968\5"+
		"\u0108\u0085\2\u0937\u0968\5\u010a\u0086\2\u0938\u0968\5\u010c\u0087\2"+
		"\u0939\u0968\5\u0114\u008b\2\u093a\u0968\5\u0116\u008c\2\u093b\u0968\5"+
		"\u011e\u0090\2\u093c\u093d\7\u00d5\2\2\u093d\u093e\7z\2\2\u093e\u093f"+
		"\5\u0096L\2\u093f\u0940\7\u0081\2\2\u0940\u0941\5\u0096L\2\u0941\u0968"+
		"\3\2\2\2\u0942\u0943\7\u00d5\2\2\u0943\u0944\7\u013f\2\2\u0944\u0945\5"+
		"\u0096L\2\u0945\u0946\7\20\2\2\u0946\u0947\5\u0096L\2\u0947\u0948\7\u0148"+
		"\2\2\u0948\u0953\5\u0096L\2\u0949\u094a\7\u013d\2\2\u094a\u094b\7z\2\2"+
		"\u094b\u0954\5\u0096L\2\u094c\u094d\7\u013d\2\2\u094d\u094e\5\u0096L\2"+
		"\u094e\u094f\7\u00fe\2\2\u094f\u0950\7\u0148\2\2\u0950\u0951\5\u0096L"+
		"\2\u0951\u0952\7/\2\2\u0952\u0954\3\2\2\2\u0953\u0949\3\2\2\2\u0953\u094c"+
		"\3\2\2\2\u0954\u0956\3\2\2\2\u0955\u0957\5\u0126\u0094\2\u0956\u0955\3"+
		"\2\2\2\u0956\u0957\3\2\2\2\u0957\u0968\3\2\2\2\u0958\u0968\5\u012a\u0096"+
		"\2\u0959\u095a\7\u0101\2\2\u095a\u095f\5\u00eex\2\u095b\u095c\7\u0148"+
		"\2\2\u095c\u095e\5\u00eex\2\u095d\u095b\3\2\2\2\u095e\u0961\3\2\2\2\u095f"+
		"\u095d\3\2\2\2\u095f\u0960\3\2\2\2\u0960\u0962\3\2\2\2\u0961\u095f\3\2"+
		"\2\2\u0962\u0965\t\37\2\2\u0963\u0964\7!\2\2\u0964\u0966\5\u00acW\2\u0965"+
		"\u0963\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0968\3\2\2\2\u0967\u090e\3\2"+
		"\2\2\u0967\u0919\3\2\2\2\u0967\u091e\3\2\2\2\u0967\u0923\3\2\2\2\u0967"+
		"\u0924\3\2\2\2\u0967\u092c\3\2\2\2\u0967\u092d\3\2\2\2\u0967\u092e\3\2"+
		"\2\2\u0967\u0936\3\2\2\2\u0967\u0937\3\2\2\2\u0967\u0938\3\2\2\2\u0967"+
		"\u0939\3\2\2\2\u0967\u093a\3\2\2\2\u0967\u093b\3\2\2\2\u0967\u093c\3\2"+
		"\2\2\u0967\u0942\3\2\2\2\u0967\u0958\3\2\2\2\u0967\u0959\3\2\2\2\u0968"+
		"\u012d\3\2\2\2\u0969\u0971\5\u0130\u0099\2\u096a\u0971\5\u013c\u009f\2"+
		"\u096b\u0971\5\u013e\u00a0\2\u096c\u0971\5\u0170\u00b9\2\u096d\u0971\5"+
		"\u0172\u00ba\2\u096e\u0971\5\u0178\u00bd\2\u096f\u0971\5\u0176\u00bc\2"+
		"\u0970\u0969\3\2\2\2\u0970\u096a\3\2\2\2\u0970\u096b\3\2\2\2\u0970\u096c"+
		"\3\2\2\2\u0970\u096d\3\2\2\2\u0970\u096e\3\2\2\2\u0970\u096f\3\2\2\2\u0971"+
		"\u012f\3\2\2\2\u0972\u0973\7,\2\2\u0973\u0974\5\u0136\u009c\2\u0974\u0975"+
		"\5\u0186\u00c4\2\u0975\u09ba\3\2\2\2\u0976\u0977\7I\2\2\u0977\u0996\5"+
		"\u0136\u009c\2\u0978\u097b\7?\2\2\u0979\u097a\7\u013d\2\2\u097a\u097c"+
		"\7\u008d\2\2\u097b\u0979\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u097d\3\2\2"+
		"\2\u097d\u0989\7y\2\2\u097e\u0985\5\u0140\u00a1\2\u097f\u0980\7y\2\2\u0980"+
		"\u0983\7\u012d\2\2\u0981\u0982\7\u00d2\2\2\u0982\u0984\5\u0132\u009a\2"+
		"\u0983\u0981\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0986\3\2\2\2\u0985\u097f"+
		"\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u098a\3\2\2\2\u0987\u098a\5\u0168\u00b5"+
		"\2\u0988\u098a\5\u0134\u009b\2\u0989\u097e\3\2\2\2\u0989\u0987\3\2\2\2"+
		"\u0989\u0988\3\2\2\2\u098a\u0997\3\2\2\2\u098b\u098c\7\u0101\2\2\u098c"+
		"\u098f\7?\2\2\u098d\u098e\7\u013d\2\2\u098e\u0990\7\u008d\2\2\u098f\u098d"+
		"\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0994\7y\2\2\u0992"+
		"\u0995\5\u0140\u00a1\2\u0993\u0995\5\u0134\u009b\2\u0994\u0992\3\2\2\2"+
		"\u0994\u0993\3\2\2\2\u0995\u0997\3\2\2\2\u0996\u0978\3\2\2\2\u0996\u098b"+
		"\3\2\2\2\u0997\u09ba\3\2\2\2\u0998\u09a2\7p\2\2\u0999\u09a3\7\u00c5\2"+
		"\2\u099a\u09a3\t \2\2\u099b\u09a3\7u\2\2\u099c\u09a3\7\u00a6\2\2\u099d"+
		"\u09a3\7>\2\2\u099e\u099f\7\u00f1\2\2\u099f\u09a3\5\u0096L\2\u09a0\u09a1"+
		"\7\3\2\2\u09a1\u09a3\5\u0096L\2\u09a2\u0999\3\2\2\2\u09a2\u099a\3\2\2"+
		"\2\u09a2\u099b\3\2\2\2\u09a2\u099c\3\2\2\2\u09a2\u099d\3\2\2\2\u09a2\u099e"+
		"\3\2\2\2\u09a2\u09a0\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a4\3\2\2\2\u09a4"+
		"\u09a7\5\u0136\u009c\2\u09a5\u09a6\7\u0099\2\2\u09a6\u09a8\5\u00d2j\2"+
		"\u09a7\u09a5\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09ba\3\2\2\2\u09a9\u09aa"+
		"\7x\2\2\u09aa\u09ab\5\u0136\u009c\2\u09ab\u09ac\5\u0186\u00c4\2\u09ac"+
		"\u09ba\3\2\2\2\u09ad\u09ae\7\u00d5\2\2\u09ae\u09b1\5\u0136\u009c\2\u09af"+
		"\u09b0\7\u012f\2\2\u09b0\u09b2\5\u00d2j\2\u09b1\u09af\3\2\2\2\u09b1\u09b2"+
		"\3\2\2\2\u09b2\u09ba\3\2\2\2\u09b3\u09b4\7\u00ea\2\2\u09b4\u09b7\5\u0136"+
		"\u009c\2\u09b5\u09b6\7\u0081\2\2\u09b6\u09b8\5\u00d4k\2\u09b7\u09b5\3"+
		"\2\2\2\u09b7\u09b8\3\2\2\2\u09b8\u09ba\3\2\2\2\u09b9\u0972\3\2\2\2\u09b9"+
		"\u0976\3\2\2\2\u09b9\u0998\3\2\2\2\u09b9\u09a9\3\2\2\2\u09b9\u09ad\3\2"+
		"\2\2\u09b9\u09b3\3\2\2\2\u09ba\u0131\3\2\2\2\u09bb\u09c0\5\u0142\u00a2"+
		"\2\u09bc\u09bd\7\u0148\2\2\u09bd\u09bf\5\u0142\u00a2\2\u09be\u09bc\3\2"+
		"\2\2\u09bf\u09c2\3\2\2\2\u09c0\u09be\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1"+
		"\u0133\3\2\2\2\u09c2\u09c0\3\2\2\2\u09c3\u09c4\5\u0190\u00c9\2\u09c4\u0135"+
		"\3\2\2\2\u09c5\u09c6\5\4\3\2\u09c6\u0137\3\2\2\2\u09c7\u09c8\5\36\20\2"+
		"\u09c8\u0139\3\2\2\2\u09c9\u09d3\5\u0190\u00c9\2\u09ca\u09d4\5\u0138\u009d"+
		"\2\u09cb\u09d1\t\3\2\2\u09cc\u09cf\7\u0090\2\2\u09cd\u09d0\7\u0117\2\2"+
		"\u09ce\u09d0\5\u0190\u00c9\2\u09cf\u09cd\3\2\2\2\u09cf\u09ce\3\2\2\2\u09d0"+
		"\u09d2\3\2\2\2\u09d1\u09cc\3\2\2\2\u09d1\u09d2\3\2\2\2\u09d2\u09d4\3\2"+
		"\2\2\u09d3\u09ca\3\2\2\2\u09d3\u09cb\3\2\2\2\u09d4\u09d7\3\2\2\2\u09d5"+
		"\u09d6\7\u00c9\2\2\u09d6\u09d8\7\u00cf\2\2\u09d7\u09d5\3\2\2\2\u09d7\u09d8"+
		"\3\2\2\2\u09d8\u09eb\3\2\2\2\u09d9\u09da\7\u0129\2\2\u09da\u09e3\7\u0151"+
		"\2\2\u09db\u09e0\5\u0190\u00c9\2\u09dc\u09dd\7\u0148\2\2\u09dd\u09df\5"+
		"\u0190\u00c9\2\u09de\u09dc\3\2\2\2\u09df\u09e2\3\2\2\2\u09e0\u09de\3\2"+
		"\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09e4\3\2\2\2\u09e2\u09e0\3\2\2\2\u09e3"+
		"\u09db\3\2\2\2\u09e3\u09e4\3\2\2\2\u09e4\u09e5\3\2\2\2\u09e5\u09e8\7\u0152"+
		"\2\2\u09e6\u09e7\7\67\2\2\u09e7\u09e9\5\u0190\u00c9\2\u09e8\u09e6\3\2"+
		"\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09eb\3\2\2\2\u09ea\u09c9\3\2\2\2\u09ea"+
		"\u09d9\3\2\2\2\u09eb\u013b\3\2\2\2\u09ec\u09ed\7^\2\2\u09ed\u09ee\7\u0117"+
		"\2\2\u09ee\u0a3b\5\u0190\u00c9\2\u09ef\u09f1\7=\2\2\u09f0\u09f2\7\u011a"+
		"\2\2\u09f1\u09f0\3\2\2\2\u09f1\u09f2\3\2\2\2\u09f2\u09f3\3\2\2\2\u09f3"+
		"\u09f4\7\u0117\2\2\u09f4\u09f5\5\u0190\u00c9\2\u09f5\u09f6\7\u0151\2\2"+
		"\u09f6\u09fb\5\u013a\u009e\2\u09f7\u09f8\7\u0148\2\2\u09f8\u09fa\5\u013a"+
		"\u009e\2\u09f9\u09f7\3\2\2\2\u09fa\u09fd\3\2\2\2\u09fb\u09f9\3\2\2\2\u09fb"+
		"\u09fc\3\2\2\2\u09fc\u09fe\3\2\2\2\u09fd\u09fb\3\2\2\2\u09fe\u0a02\7\u0152"+
		"\2\2\u09ff\u0a00\7\u013d\2\2\u0a00\u0a01\7\u00c8\2\2\u0a01\u0a03\7\u00b1"+
		"\2\2\u0a02\u09ff\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a06\3\2\2\2\u0a04"+
		"\u0a05\7\u0090\2\2\u0a05\u0a07\5\u0190\u00c9\2\u0a06\u0a04\3\2\2\2\u0a06"+
		"\u0a07\3\2\2\2\u0a07\u0a0b\3\2\2\2\u0a08\u0a09\7m\2\2\u0a09\u0a0a\7\u0108"+
		"\2\2\u0a0a\u0a0c\5\u00acW\2\u0a0b\u0a08\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c"+
		"\u0a10\3\2\2\2\u0a0d\u0a0e\7\u00c5\2\2\u0a0e\u0a0f\7\u0108\2\2\u0a0f\u0a11"+
		"\5\u00acW\2\u0a10\u0a0d\3\2\2\2\u0a10\u0a11\3\2\2\2\u0a11\u0a17\3\2\2"+
		"\2\u0a12\u0a13\7\u00b0\2\2\u0a13\u0a14\7\u00be\2\2\u0a14\u0a15\7\u0151"+
		"\2\2\u0a15\u0a16\t!\2\2\u0a16\u0a18\7\u0152\2\2\u0a17\u0a12\3\2\2\2\u0a17"+
		"\u0a18\3\2\2\2\u0a18\u0a3b\3\2\2\2\u0a19\u0a1b\7=\2\2\u0a1a\u0a1c\7\u0129"+
		"\2\2\u0a1b\u0a1a\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c\u0a1e\3\2\2\2\u0a1d"+
		"\u0a1f\7-\2\2\u0a1e\u0a1d\3\2\2\2\u0a1e\u0a1f\3\2\2\2\u0a1f\u0a20\3\2"+
		"\2\2\u0a20\u0a21\7\u0092\2\2\u0a21\u0a22\5\u0190\u00c9\2\u0a22\u0a23\7"+
		"\u00d4\2\2\u0a23\u0a24\5\u0190\u00c9\2\u0a24\u0a25\7\u0151\2\2\u0a25\u0a27"+
		"\5\u0190\u00c9\2\u0a26\u0a28\t\"\2\2\u0a27\u0a26\3\2\2\2\u0a27\u0a28\3"+
		"\2\2\2\u0a28\u0a30\3\2\2\2\u0a29\u0a2a\7\u0148\2\2\u0a2a\u0a2c\5\u0190"+
		"\u00c9\2\u0a2b\u0a2d\t\"\2\2\u0a2c\u0a2b\3\2\2\2\u0a2c\u0a2d\3\2\2\2\u0a2d"+
		"\u0a2f\3\2\2\2\u0a2e\u0a29\3\2\2\2\u0a2f\u0a32\3\2\2\2\u0a30\u0a2e\3\2"+
		"\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0a33\3\2\2\2\u0a32\u0a30\3\2\2\2\u0a33"+
		"\u0a34\7\u0152\2\2\u0a34\u0a3b\3\2\2\2\u0a35\u0a36\7^\2\2\u0a36\u0a37"+
		"\7\u0092\2\2\u0a37\u0a3b\5\u0190\u00c9\2\u0a38\u0a39\7\64\2\2\u0a39\u0a3b"+
		"\5\u0190\u00c9\2\u0a3a\u09ec\3\2\2\2\u0a3a\u09ef\3\2\2\2\u0a3a\u0a19\3"+
		"\2\2\2\u0a3a\u0a35\3\2\2\2\u0a3a\u0a38\3\2\2\2\u0a3b\u013d\3\2\2\2\u0a3c"+
		"\u0a43\5\u0168\u00b5\2\u0a3d\u0a43\5\u016c\u00b7\2\u0a3e\u0a43\5\u0140"+
		"\u00a1\2\u0a3f\u0a43\5\u016a\u00b6\2\u0a40\u0a43\5\u0164\u00b3\2\u0a41"+
		"\u0a43\5\u0166\u00b4\2\u0a42\u0a3c\3\2\2\2\u0a42\u0a3d\3\2\2\2\u0a42\u0a3e"+
		"\3\2\2\2\u0a42\u0a3f\3\2\2\2\u0a42\u0a40\3\2\2\2\u0a42\u0a41\3\2\2\2\u0a43"+
		"\u013f\3\2\2\2\u0a44\u0a45\5\u0154\u00ab\2\u0a45\u0141\3\2\2\2\u0a46\u0a52"+
		"\7\u0146\2\2\u0a47\u0a49\5\u014a\u00a6\2\u0a48\u0a4a\5\u00b4[\2\u0a49"+
		"\u0a48\3\2\2\2\u0a49\u0a4a\3\2\2\2\u0a4a\u0a4f\3\2\2\2\u0a4b\u0a4c\7\u0155"+
		"\2\2\u0a4c\u0a50\7\u0146\2\2\u0a4d\u0a4e\7\u0155\2\2\u0a4e\u0a50\5\u0142"+
		"\u00a2\2\u0a4f\u0a4b\3\2\2\2\u0a4f\u0a4d\3\2\2\2\u0a4f\u0a50\3\2\2\2\u0a50"+
		"\u0a52\3\2\2\2\u0a51\u0a46\3\2\2\2\u0a51\u0a47\3\2\2\2\u0a52\u0143\3\2"+
		"\2\2\u0a53\u0a55\5n8\2\u0a54\u0a56\5p9\2\u0a55\u0a54\3\2\2\2\u0a55\u0a56"+
		"\3\2\2\2\u0a56\u0a5e\3\2\2\2\u0a57\u0a58\7\u0148\2\2\u0a58\u0a5a\5n8\2"+
		"\u0a59\u0a5b\5p9\2\u0a5a\u0a59\3\2\2\2\u0a5a\u0a5b\3\2\2\2\u0a5b\u0a5d"+
		"\3\2\2\2\u0a5c\u0a57\3\2\2\2\u0a5d\u0a60\3\2\2\2\u0a5e\u0a5c\3\2\2\2\u0a5e"+
		"\u0a5f\3\2\2\2\u0a5f\u0145\3\2\2\2\u0a60\u0a5e\3\2\2\2\u0a61\u0a64\7\u0104"+
		"\2\2\u0a62\u0a65\7\b\2\2\u0a63\u0a65\t#\2\2\u0a64\u0a62\3\2\2\2\u0a64"+
		"\u0a63\3\2\2\2\u0a64\u0a65\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66\u0a67\5\u0144"+
		"\u00a3\2\u0a67\u0147\3\2\2\2\u0a68\u0a69\5\u0190\u00c9\2\u0a69\u0a6a\7"+
		"\u014a\2\2\u0a6a\u0a72\3\2\2\2\u0a6b\u0a6c\5\u0190\u00c9\2\u0a6c\u0a6d"+
		"\7\u0156\2\2\u0a6d\u0a6e\5\u0190\u00c9\2\u0a6e\u0a6f\7\u014a\2\2\u0a6f"+
		"\u0a72\3\2\2\2\u0a70\u0a72\5J&\2\u0a71\u0a68\3\2\2\2\u0a71\u0a6b\3\2\2"+
		"\2\u0a71\u0a70\3\2\2\2\u0a72\u0149\3\2\2\2\u0a73\u0a75\5\u0148\u00a5\2"+
		"\u0a74\u0a73\3\2\2\2\u0a74\u0a75\3\2\2\2\u0a75\u0a76\3\2\2\2\u0a76\u0a77"+
		"\5\u0190\u00c9\2\u0a77\u014b\3\2\2\2\u0a78\u0a7a\7\u00dc\2\2\u0a79\u0a78"+
		"\3\2\2\2\u0a79\u0a7a\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0a7d\5\u014a\u00a6"+
		"\2\u0a7c\u0a7e\5p9\2\u0a7d\u0a7c\3\2\2\2\u0a7d\u0a7e\3\2\2\2\u0a7e\u014d"+
		"\3\2\2\2\u0a7f\u0a80\5\u0158\u00ad\2\u0a80\u014f\3\2\2\2\u0a81\u0a89\7"+
		"\u0081\2\2\u0a82\u0a8a\5\u014c\u00a7\2\u0a83\u0a84\7\u0151\2\2\u0a84\u0a85"+
		"\5\u014e\u00a8\2\u0a85\u0a87\7\u0152\2\2\u0a86\u0a88\5p9\2\u0a87\u0a86"+
		"\3\2\2\2\u0a87\u0a88\3\2\2\2\u0a88\u0a8a\3\2\2\2\u0a89\u0a82\3\2\2\2\u0a89"+
		"\u0a83\3\2\2\2\u0a8a\u0a97\3\2\2\2\u0a8b\u0a93\7\u0148\2\2\u0a8c\u0a94"+
		"\5\u014c\u00a7\2\u0a8d\u0a8e\7\u0151\2\2\u0a8e\u0a8f\5\u014e\u00a8\2\u0a8f"+
		"\u0a91\7\u0152\2\2\u0a90\u0a92\5p9\2\u0a91\u0a90\3\2\2\2\u0a91\u0a92\3"+
		"\2\2\2\u0a92\u0a94\3\2\2\2\u0a93\u0a8c\3\2\2\2\u0a93\u0a8d\3\2\2\2\u0a94"+
		"\u0a96\3\2\2\2\u0a95\u0a8b\3\2\2\2\u0a96\u0a99\3\2\2\2\u0a97\u0a95\3\2"+
		"\2\2\u0a97\u0a98\3\2\2\2\u0a98\u0151\3\2\2\2\u0a99\u0a97\3\2\2\2\u0a9a"+
		"\u0a9b\5\4\3\2\u0a9b\u0153\3\2\2\2\u0a9c\u0a9f\5\u0146\u00a4\2\u0a9d\u0a9e"+
		"\7\u0099\2\2\u0a9e\u0aa0\5\u00d2j\2\u0a9f\u0a9d\3\2\2\2\u0a9f\u0aa0\3"+
		"\2\2\2\u0aa0\u0aa1\3\2\2\2\u0aa1\u0aa3\5\u0150\u00a9\2\u0aa2\u0aa4\5\u015a"+
		"\u00ae\2\u0aa3\u0aa2\3\2\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u0aa6\3\2\2\2\u0aa5"+
		"\u0aa7\5\u015c\u00af\2\u0aa6\u0aa5\3\2\2\2\u0aa6\u0aa7\3\2\2\2\u0aa7\u0aa9"+
		"\3\2\2\2\u0aa8\u0aaa\5\u015e\u00b0\2\u0aa9\u0aa8\3\2\2\2\u0aa9\u0aaa\3"+
		"\2\2\2\u0aaa\u0aac\3\2\2\2\u0aab\u0aad\5\u0156\u00ac\2\u0aac\u0aab\3\2"+
		"\2\2\u0aac\u0aad\3\2\2\2\u0aad\u0aaf\3\2\2\2\u0aae\u0ab0\5\u0162\u00b2"+
		"\2\u0aaf\u0aae\3\2\2\2\u0aaf\u0ab0\3\2\2\2\u0ab0\u0ab4\3\2\2\2\u0ab1\u0ab2"+
		"\7\u0099\2\2\u0ab2\u0ab3\7\u011a\2\2\u0ab3\u0ab5\5\4\3\2\u0ab4\u0ab1\3"+
		"\2\2\2\u0ab4\u0ab5\3\2\2\2\u0ab5\u0ab9\3\2\2\2\u0ab6\u0ab7\7\u013d\2\2"+
		"\u0ab7\u0ab8\7\u00c8\2\2\u0ab8\u0aba\7\u00b1\2\2\u0ab9\u0ab6\3\2\2\2\u0ab9"+
		"\u0aba\3\2\2\2\u0aba\u0155\3\2\2\2\u0abb\u0abd\7\u0128\2\2\u0abc\u0abe"+
		"\7\b\2\2\u0abd\u0abc\3\2\2\2\u0abd\u0abe\3\2\2\2\u0abe\u0abf\3\2\2\2\u0abf"+
		"\u0ac0\5\u0158\u00ad\2\u0ac0\u0157\3\2\2\2\u0ac1\u0ac2\5\u0146\u00a4\2"+
		"\u0ac2\u0ac4\5\u0150\u00a9\2\u0ac3\u0ac5\5\u015a\u00ae\2\u0ac4\u0ac3\3"+
		"\2\2\2\u0ac4\u0ac5\3\2\2\2\u0ac5\u0ac7\3\2\2\2\u0ac6\u0ac8\5\u015c\u00af"+
		"\2\u0ac7\u0ac6\3\2\2\2\u0ac7\u0ac8\3\2\2\2\u0ac8\u0aca\3\2\2\2\u0ac9\u0acb"+
		"\5\u015e\u00b0\2\u0aca\u0ac9\3\2\2\2\u0aca\u0acb\3\2\2\2\u0acb\u0acd\3"+
		"\2\2\2\u0acc\u0ace\5\u0156\u00ac\2\u0acd\u0acc\3\2\2\2\u0acd\u0ace\3\2"+
		"\2\2\u0ace\u0159\3\2\2\2\u0acf\u0ad0\7\u013a\2\2\u0ad0\u0ad1\5b\62\2\u0ad1"+
		"\u015b\3\2\2\2\u0ad2\u0ad3\7\u0088\2\2\u0ad3\u0ad4\7!\2\2\u0ad4\u0ad5"+
		"\5\u00d4k\2\u0ad5\u015d\3\2\2\2\u0ad6\u0ad7\7\u0089\2\2\u0ad7\u0ad8\5"+
		"b\62\2\u0ad8\u015f\3\2\2\2\u0ad9\u0adb\5\u0096L\2\u0ada\u0adc\t\"\2\2"+
		"\u0adb\u0ada\3\2\2\2\u0adb\u0adc\3\2\2\2\u0adc\u0161\3\2\2\2\u0add\u0ade"+
		"\7\u00da\2\2\u0ade\u0adf\7!\2\2\u0adf\u0ae4\5\u0160\u00b1\2\u0ae0\u0ae1"+
		"\7\u0148\2\2\u0ae1\u0ae3\5\u0160\u00b1\2\u0ae2\u0ae0\3\2\2\2\u0ae3\u0ae6"+
		"\3\2\2\2\u0ae4\u0ae2\3\2\2\2\u0ae4\u0ae5\3\2\2\2\u0ae5\u0163\3\2\2\2\u0ae6"+
		"\u0ae4\3\2\2\2\u0ae7\u0ae8\7\u00ae\2\2\u0ae8\u0aeb\7\u0081\2\2\u0ae9\u0aec"+
		"\5\u00aeX\2\u0aea\u0aec\5J&\2\u0aeb\u0ae9\3\2\2\2\u0aeb\u0aea\3\2\2\2"+
		"\u0aec\u0af2\3\2\2\2\u0aed\u0af0\7T\2\2\u0aee\u0af1\5\u00aeX\2\u0aef\u0af1"+
		"\5J&\2\u0af0\u0aee\3\2\2\2\u0af0\u0aef\3\2\2\2\u0af1\u0af3\3\2\2\2\u0af2"+
		"\u0aed\3\2\2\2\u0af2\u0af3\3\2\2\2\u0af3\u0afe\3\2\2\2\u0af4\u0af5\7\u0097"+
		"\2\2\u0af5\u0af6\7\u0099\2\2\u0af6\u0afb\5\u014a\u00a6\2\u0af7\u0af8\7"+
		"\u0151\2\2\u0af8\u0af9\5\u0132\u009a\2\u0af9\u0afa\7\u0152\2\2\u0afa\u0afc"+
		"\3\2\2\2\u0afb\u0af7\3\2\2\2\u0afb\u0afc\3\2\2\2\u0afc\u0aff\3\2\2\2\u0afd"+
		"\u0aff\5\u0168\u00b5\2\u0afe\u0af4\3\2\2\2\u0afe\u0afd\3\2\2\2\u0aff\u0b00"+
		"\3\2\2\2\u0b00\u0b01\5\u0186\u00c4\2\u0b01\u0165\3\2\2\2\u0b02\u0b03\7"+
		"\u012b\2\2\u0b03\u0b06\7\u0120\2\2\u0b04\u0b07\5\u00aeX\2\u0b05\u0b07"+
		"\5J&\2\u0b06\u0b04\3\2\2\2\u0b06\u0b05\3\2\2\2\u0b07\u0b0d\3\2\2\2\u0b08"+
		"\u0b0b\7T\2\2\u0b09\u0b0c\5\u00aeX\2\u0b0a\u0b0c\5J&\2\u0b0b\u0b09\3\2"+
		"\2\2\u0b0b\u0b0a\3\2\2\2\u0b0c\u0b0e\3\2\2\2\u0b0d\u0b08\3\2\2\2\u0b0d"+
		"\u0b0e\3\2\2\2\u0b0e\u0b0f\3\2\2\2\u0b0f\u0b10\5\u0140\u00a1\2\u0b10\u0b11"+
		"\5\u0186\u00c4\2\u0b11\u0167\3\2\2\2\u0b12\u0b13\7\u0097\2\2\u0b13\u0b14"+
		"\7\u0099\2\2\u0b14\u0b19\5\u014a\u00a6\2\u0b15\u0b16\7\u0151\2\2\u0b16"+
		"\u0b17\5\u0132\u009a\2\u0b17\u0b18\7\u0152\2\2\u0b18\u0b1a\3\2\2\2\u0b19"+
		"\u0b15\3\2\2\2\u0b19\u0b1a\3\2\2\2\u0b1a\u0b28\3\2\2\2\u0b1b\u0b1c\7\u0131"+
		"\2\2\u0b1c\u0b1d\7\u0151\2\2\u0b1d\u0b22\5\u0096L\2\u0b1e\u0b1f\7\u0148"+
		"\2\2\u0b1f\u0b21\5\u0096L\2\u0b20\u0b1e\3\2\2\2\u0b21\u0b24\3\2\2\2\u0b22"+
		"\u0b20\3\2\2\2\u0b22\u0b23\3\2\2\2\u0b23\u0b25\3\2\2\2\u0b24\u0b22\3\2"+
		"\2\2\u0b25\u0b26\7\u0152\2\2\u0b26\u0b29\3\2\2\2\u0b27\u0b29\5\u0158\u00ad"+
		"\2\u0b28\u0b1b\3\2\2\2\u0b28\u0b27\3\2\2\2\u0b29\u0169\3\2\2\2\u0b2a\u0b2b"+
		"\7\u012d\2\2\u0b2b\u0b2c\5\u014a\u00a6\2\u0b2c\u0b5a\7\u0105\2\2\u0b2d"+
		"\u0b2e\5\u0142\u00a2\2\u0b2e\u0b2f\7\u014b\2\2\u0b2f\u0b37\5\u0096L\2"+
		"\u0b30\u0b31\7\u0148\2\2\u0b31\u0b32\5\u0142\u00a2\2\u0b32\u0b33\7\u014b"+
		"\2\2\u0b33\u0b34\5\u0096L\2\u0b34\u0b36\3\2\2\2\u0b35\u0b30\3\2\2\2\u0b36"+
		"\u0b39\3\2\2\2\u0b37\u0b35\3\2\2\2\u0b37\u0b38\3\2\2\2\u0b38\u0b5b\3\2"+
		"\2\2\u0b39\u0b37\3\2\2\2\u0b3a\u0b3b\7\u0151\2\2\u0b3b\u0b3c\5\u0132\u009a"+
		"\2\u0b3c\u0b3d\7\u0152\2\2\u0b3d\u0b45\3\2\2\2\u0b3e\u0b3f\5\u0152\u00aa"+
		"\2\u0b3f\u0b40\7\u0155\2\2\u0b40\u0b42\3\2\2\2\u0b41\u0b3e\3\2\2\2\u0b41"+
		"\u0b42\3\2\2\2\u0b42\u0b43\3\2\2\2\u0b43\u0b45\7\u0146\2\2\u0b44\u0b3a"+
		"\3\2\2\2\u0b44\u0b41\3\2\2\2\u0b45\u0b46\3\2\2\2\u0b46\u0b58\7\u014b\2"+
		"\2\u0b47\u0b48\7\u0151\2\2\u0b48\u0b4d\5\u0096L\2\u0b49\u0b4a\7\u0148"+
		"\2\2\u0b4a\u0b4c\5\u0096L\2\u0b4b\u0b49\3\2\2\2\u0b4c\u0b4f\3\2\2\2\u0b4d"+
		"\u0b4b\3\2\2\2\u0b4d\u0b4e\3\2\2\2\u0b4e\u0b50\3\2\2\2\u0b4f\u0b4d\3\2"+
		"\2\2\u0b50\u0b51\7\u0152\2\2\u0b51\u0b59\3\2\2\2\u0b52\u0b53\5\u0152\u00aa"+
		"\2\u0b53\u0b54\7\u0155\2\2\u0b54\u0b56\3\2\2\2\u0b55\u0b52\3\2\2\2\u0b55"+
		"\u0b56\3\2\2\2\u0b56\u0b57\3\2\2\2\u0b57\u0b59\7\u0146\2\2\u0b58\u0b47"+
		"\3\2\2\2\u0b58\u0b55\3\2\2\2\u0b59\u0b5b\3\2\2\2\u0b5a\u0b2d\3\2\2\2\u0b5a"+
		"\u0b44\3\2\2\2\u0b5b\u0b63\3\2\2\2\u0b5c\u0b61\7\u013a\2\2\u0b5d\u0b62"+
		"\5b\62\2\u0b5e\u0b5f\7>\2\2\u0b5f\u0b60\7\u00d2\2\2\u0b60\u0b62\5\u0136"+
		"\u009c\2\u0b61\u0b5d\3\2\2\2\u0b61\u0b5e\3\2\2\2\u0b62\u0b64\3\2\2\2\u0b63"+
		"\u0b5c\3\2\2\2\u0b63\u0b64\3\2\2\2\u0b64\u016b\3\2\2\2\u0b65\u0b66\7Q"+
		"\2\2\u0b66\u0b67\7\u0081\2\2\u0b67\u0b6f\5\u014a\u00a6\2\u0b68\u0b6d\7"+
		"\u013a\2\2\u0b69\u0b6e\5b\62\2\u0b6a\u0b6b\7>\2\2\u0b6b\u0b6c\7\u00d2"+
		"\2\2\u0b6c\u0b6e\5\u0136\u009c\2\u0b6d\u0b69\3\2\2\2\u0b6d\u0b6a\3\2\2"+
		"\2\u0b6e\u0b70\3\2\2\2\u0b6f\u0b68\3\2\2\2\u0b6f\u0b70\3\2\2\2\u0b70\u0b71"+
		"\3\2\2\2\u0b71\u0b72\5\u0186\u00c4\2\u0b72\u016d\3\2\2\2\u0b73\u0b78\5"+
		"^\60\2\u0b74\u0b75\7\u0148\2\2\u0b75\u0b77\5^\60\2\u0b76\u0b74\3\2\2\2"+
		"\u0b77\u0b7a\3\2\2\2\u0b78\u0b76\3\2\2\2\u0b78\u0b79\3\2\2\2\u0b79\u016f"+
		"\3\2\2\2\u0b7a\u0b78\3\2\2\2\u0b7b\u0b7c\7\u00e4\2\2\u0b7c\u0b7d\5\u0136"+
		"\u009c\2\u0b7d\u0b7e\7\u0081\2\2\u0b7e\u0b7f\5\u0096L\2\u0b7f\u0b93\3"+
		"\2\2\2\u0b80\u0b81\7h\2\2\u0b81\u0b84\5\u0136\u009c\2\u0b82\u0b83\7\u012f"+
		"\2\2\u0b83\u0b85\5\u00d2j\2\u0b84\u0b82\3\2\2\2\u0b84\u0b85\3\2\2\2\u0b85"+
		"\u0b93\3\2\2\2\u0b86\u0b89\7\u0080\2\2\u0b87\u0b8a\5\u0136\u009c\2\u0b88"+
		"\u0b8a\5\u0134\u009b\2\u0b89\u0b87\3\2\2\2\u0b89\u0b88\3\2\2\2\u0b8a\u0b93"+
		"\3\2\2\2\u0b8b\u0b8c\7\u00b0\2\2\u0b8c\u0b8d\7\u0117\2\2\u0b8d\u0b8e\5"+
		"\u0096L\2\u0b8e\u0b8f\7\u0090\2\2\u0b8f\u0b90\t$\2\2\u0b90\u0b91\7\u00be"+
		"\2\2\u0b91\u0b93\3\2\2\2\u0b92\u0b7b\3\2\2\2\u0b92\u0b80\3\2\2\2\u0b92"+
		"\u0b86\3\2\2\2\u0b92\u0b8b\3\2\2\2\u0b93\u0171\3\2\2\2\u0b94\u0b95\7\u012d"+
		"\2\2\u0b95\u0b99\7\u0113\2\2\u0b96\u0b97\7y\2\2\u0b97\u0b98\7\u0117\2"+
		"\2\u0b98\u0b9a\5\u014a\u00a6\2\u0b99\u0b96\3\2\2\2\u0b99\u0b9a\3\2\2\2"+
		"\u0b9a\u0bb9\3\2\2\2\u0b9b\u0b9c\7\u0105\2\2\u0b9c\u0b9d\7\u00b0\2\2\u0b9d"+
		"\u0b9e\7\u00be\2\2\u0b9e\u0ba5\7\u0120\2\2\u0b9f\u0ba1\7\u0135\2\2\u0ba0"+
		"\u0ba2\7\u0168\2\2\u0ba1\u0ba0\3\2\2\2\u0ba1\u0ba2\3\2\2\2\u0ba2\u0ba6"+
		"\3\2\2\2\u0ba3\u0ba4\7\u00c9\2\2\u0ba4\u0ba6\7\u0135\2\2\u0ba5\u0b9f\3"+
		"\2\2\2\u0ba5\u0ba3\3\2\2\2\u0ba6\u0bb9\3\2\2\2\u0ba7\u0ba8\7\u0105\2\2"+
		"\u0ba8\u0ba9\7k\2\2\u0ba9\u0bb9\t\35\2\2\u0baa\u0bab\7\u0105\2\2\u0bab"+
		"\u0bac\7\u00a2\2\2\u0bac\u0bb1\7\u0120\2\2\u0bad\u0bae\7?\2\2\u0bae\u0bb2"+
		"\7\u0112\2\2\u0baf\u0bb0\t%\2\2\u0bb0\u0bb2\7\u00ef\2\2\u0bb1\u0bad\3"+
		"\2\2\2\u0bb1\u0baf\3\2\2\2\u0bb2\u0bb9\3\2\2\2\u0bb3\u0bb5\7\u0105\2\2"+
		"\u0bb4\u0bb6\7 \2\2\u0bb5\u0bb4\3\2\2\2\u0bb5\u0bb6\3\2\2\2\u0bb6\u0bb7"+
		"\3\2\2\2\u0bb7\u0bb9\7\u00b1\2\2\u0bb8\u0b94\3\2\2\2\u0bb8\u0b9b\3\2\2"+
		"\2\u0bb8\u0ba7\3\2\2\2\u0bb8\u0baa\3\2\2\2\u0bb8\u0bb3\3\2\2\2\u0bb9\u0173"+
		"\3\2\2\2\u0bba\u0bbb\7A\2\2\u0bbb\u0bbe\5\u0190\u00c9\2\u0bbc\u0bbd\7"+
		"\u0156\2\2\u0bbd\u0bbf\5\u0190\u00c9\2\u0bbe\u0bbc\3\2\2\2\u0bbe\u0bbf"+
		"\3\2\2\2\u0bbf\u0bc1\3\2\2\2\u0bc0\u0bc2\7f\2\2\u0bc1\u0bc0\3\2\2\2\u0bc1"+
		"\u0bc2\3\2\2\2\u0bc2\u0bc4\3\2\2\2\u0bc3\u0bc5\7\u0149\2\2\u0bc4\u0bc3"+
		"\3\2\2\2\u0bc4\u0bc5\3\2\2\2\u0bc5\u0175\3\2\2\2\u0bc6\u0bc7\7,\2\2\u0bc7"+
		"\u0bc8\7A\2\2\u0bc8\u0177\3\2\2\2\u0bc9\u0bd1\5\u017a\u00be\2\u0bca\u0bcb"+
		"\7\27\2\2\u0bcb\u0bd1\7\u0141\2\2\u0bcc\u0bcd\7\62\2\2\u0bcd\u0bd1\7\u0141"+
		"\2\2\u0bce\u0bcf\7\u00fc\2\2\u0bcf\u0bd1\7\u0141\2\2\u0bd0\u0bc9\3\2\2"+
		"\2\u0bd0\u0bca\3\2\2\2\u0bd0\u0bcc\3\2\2\2\u0bd0\u0bce\3\2\2\2\u0bd1\u0179"+
		"\3\2\2\2\u0bd2\u0bd3\7\u0139\2\2\u0bd3\u0bd4\5\u017c\u00bf\2\u0bd4\u0bd5"+
		"\5\u017e\u00c0\2\u0bd5\u0bd6\5\u0186\u00c4\2\u0bd6\u017b\3\2\2\2\u0bd7"+
		"\u0bd8\7\u00c9\2\2\u0bd8\u0bdf\7~\2\2\u0bd9\u0bdb\7\13\2\2\u0bda\u0bd9"+
		"\3\2\2\2\u0bda\u0bdb\3\2\2\2\u0bdb\u0bdc\3\2\2\2\u0bdc\u0bdf\t&\2\2\u0bdd"+
		"\u0bdf\t\'\2\2\u0bde\u0bd7\3\2\2\2\u0bde\u0bda\3\2\2\2\u0bde\u0bdd\3\2"+
		"\2\2\u0bdf\u017d\3\2\2\2\u0be0\u0bed\t(\2\2\u0be1\u0be2\7$\2\2\u0be2\u0bed"+
		"\5\4\3\2\u0be3\u0be4\7\u0085\2\2\u0be4\u0be7\7\u0120\2\2\u0be5\u0be7\7"+
		"\u0086\2\2\u0be6\u0be3\3\2\2\2\u0be6\u0be5\3\2\2\2\u0be7\u0be9\3\2\2\2"+
		"\u0be8\u0bea\7\u014a\2\2\u0be9\u0be8\3\2\2\2\u0be9\u0bea\3\2\2\2\u0bea"+
		"\u0beb\3\2\2\2\u0beb\u0bed\5\4\3\2\u0bec\u0be0\3\2\2\2\u0bec\u0be1\3\2"+
		"\2\2\u0bec\u0be6\3\2\2\2\u0bed\u017f\3\2\2\2\u0bee\u0bef\7\u00f6\2\2\u0bef"+
		"\u0bf1\5\4\3\2\u0bf0\u0bf2\5\22\n\2\u0bf1\u0bf0\3\2\2\2\u0bf1\u0bf2\3"+
		"\2\2\2\u0bf2\u0bf4\3\2\2\2\u0bf3\u0bf5\5\30\r\2\u0bf4\u0bf3\3\2\2\2\u0bf4"+
		"\u0bf5\3\2\2\2\u0bf5\u0bf7\3\2\2\2\u0bf6\u0bf8\5\u0182\u00c2\2\u0bf7\u0bf6"+
		"\3\2\2\2\u0bf7\u0bf8\3\2\2\2\u0bf8\u0bff\3\2\2\2\u0bf9\u0bfb\7\u00da\2"+
		"\2\u0bfa\u0bfc\7n\2\2\u0bfb\u0bfa\3\2\2\2\u0bfb\u0bfc\3\2\2\2\u0bfc\u0bfd"+
		"\3\2\2\2\u0bfd\u0bfe\7!\2\2\u0bfe\u0c00\5\u00d2j\2\u0bff\u0bf9\3\2\2\2"+
		"\u0bff\u0c00\3\2\2\2\u0c00\u0c02\3\2\2\2\u0c01\u0c03\5\u0184\u00c3\2\u0c02"+
		"\u0c01\3\2\2\2\u0c02\u0c03\3\2\2\2\u0c03\u0c04\3\2\2\2\u0c04\u0c05\7b"+
		"\2\2\u0c05\u0c06\7\u00f6\2\2\u0c06\u0181\3\2\2\2\u0c07\u0c10\7\u00db\2"+
		"\2\u0c08\u0c09\7\u00f6\2\2\u0c09\u0c0e\7\u0120\2\2\u0c0a\u0c0f\5J&\2\u0c0b"+
		"\u0c0c\7\u00e2\2\2\u0c0c\u0c0f\5J&\2\u0c0d\u0c0f\7\u00e7\2\2\u0c0e\u0c0a"+
		"\3\2\2\2\u0c0e\u0c0b\3\2\2\2\u0c0e\u0c0d\3\2\2\2\u0c0f\u0c11\3\2\2\2\u0c10"+
		"\u0c08\3\2\2\2\u0c10\u0c11\3\2\2\2\u0c11\u0c27\3\2\2\2\u0c12\u0c13\7\u00a7"+
		"\2\2\u0c13\u0c14\7\u00b8\2\2\u0c14\u0c26\5\u00acW\2\u0c15\u0c16\7\u00fb"+
		"\2\2\u0c16\u0c17\7\u00b8\2\2\u0c17\u0c26\5\u00acW\2\u0c18\u0c19\7\u0122"+
		"\2\2\u0c19\u0c1a\7\u00b8\2\2\u0c1a\u0c26\5\u00acW\2\u0c1b\u0c1c\7\37\2"+
		"\2\u0c1c\u0c1d\7\u00b8\2\2\u0c1d\u0c26\5\u00acW\2\u0c1e\u0c1f\7\u00de"+
		"\2\2\u0c1f\u0c20\7\u00a8\2\2\u0c20\u0c26\5\u00acW\2\u0c21\u0c22\7\u0122"+
		"\2\2\u0c22\u0c23\7\u00d2\2\2\u0c23\u0c24\7\u00de\2\2\u0c24\u0c26\5J&\2"+
		"\u0c25\u0c12\3\2\2\2\u0c25\u0c15\3\2\2\2\u0c25\u0c18\3\2\2\2\u0c25\u0c1b"+
		"\3\2\2\2\u0c25\u0c1e\3\2\2\2\u0c25\u0c21\3\2\2\2\u0c26\u0c29\3\2\2\2\u0c27"+
		"\u0c25\3\2\2\2\u0c27\u0c28\3\2\2\2\u0c28\u0183\3\2\2\2\u0c29\u0c27\3\2"+
		"\2\2\u0c2a\u0c46\7{\2\2\u0c2b\u0c2c\7e\2\2\u0c2c\u0c47\7\u00fd\2\2\u0c2d"+
		"\u0c2f\7u\2\2\u0c2e\u0c2d\3\2\2\2\u0c2e\u0c2f\3\2\2\2\u0c2f\u0c30\3\2"+
		"\2\2\u0c30\u0c31\7\u00de\2\2\u0c31\u0c40\7\u008a\2\2\u0c32\u0c33\7\u00de"+
		"\2\2\u0c33\u0c40\7\u0123\2\2\u0c34\u0c39\7\u00d4\2\2\u0c35\u0c36\7e\2"+
		"\2\u0c36\u0c3a\7\u00fd\2\2\u0c37\u0c38\7\u00a6\2\2\u0c38\u0c3a\7\u00fd"+
		"\2\2\u0c39\u0c35\3\2\2\2\u0c39\u0c37\3\2\2\2\u0c3a\u0c40\3\2\2\2\u0c3b"+
		"\u0c3c\t\31\2\2\u0c3c\u0c3d\7\u0088\2\2\u0c3d\u0c3e\7\u00d2\2\2\u0c3e"+
		"\u0c40\5\u00aeX\2\u0c3f\u0c2e\3\2\2\2\u0c3f\u0c32\3\2\2\2\u0c3f\u0c34"+
		"\3\2\2\2\u0c3f\u0c3b\3\2\2\2\u0c40\u0c41\3\2\2\2\u0c41\u0c43\5N(\2\u0c42"+
		"\u0c3f\3\2\2\2\u0c43\u0c44\3\2\2\2\u0c44\u0c42\3\2\2\2\u0c44\u0c45\3\2"+
		"\2\2\u0c45\u0c47\3\2\2\2\u0c46\u0c2b\3\2\2\2\u0c46\u0c42\3\2\2\2\u0c47"+
		"\u0185\3\2\2\2\u0c48\u0c49\7\u015f\2\2\u0c49\u0187\3\2\2\2\u0c4a\u0c4d"+
		"\5\u018a\u00c6\2\u0c4b\u0c4d\5\u018c\u00c7\2\u0c4c\u0c4a\3\2\2\2\u0c4c"+
		"\u0c4b\3\2\2\2\u0c4d\u0189\3\2\2\2\u0c4e\u0c4f\7\u015a\2\2\u0c4f\u018b"+
		"\3\2\2\2\u0c50\u0c51\7\u015b\2\2\u0c51\u018d\3\2\2\2\u0c52\u0c53\t\13"+
		"\2\2\u0c53\u018f\3\2\2\2\u0c54\u0c57\t)\2\2\u0c55\u0c57\5\4\3\2\u0c56"+
		"\u0c54\3\2\2\2\u0c56\u0c55\3\2\2\2\u0c57\u0191\3\2\2\2\u019e\u0193\u0196"+
		"\u0199\u019c\u019f\u01a6\u01ab\u01ae\u01b6\u01b9\u01bc\u01c1\u01c3\u01cb"+
		"\u01cd\u01d1\u01d6\u01db\u01e5\u01ef\u01f9\u0201\u020a\u0215\u021f\u0229"+
		"\u022d\u0234\u0236\u023d\u0246\u0248\u024f\u0266\u026d\u0276\u027f\u0288"+
		"\u0291\u029a\u02a1\u02a7\u02ab\u02af\u02b3\u02b7\u02bb\u02c2\u02c7\u02d0"+
		"\u02db\u02e6\u02f0\u02fa\u0301\u0307\u0309\u030f\u0315\u031c\u0321\u0329"+
		"\u032f\u0332\u033b\u0346\u0349\u034c\u0354\u0357\u035d\u0361\u036c\u036f"+
		"\u0376\u037c\u0382\u0388\u038c\u0392\u039c\u03a3\u03b8\u03bd\u03c4\u03c9"+
		"\u03cf\u03d5\u03db\u03e6\u03ea\u03f2\u03f7\u0401\u0407\u040c\u0411\u0416"+
		"\u041b\u0422\u0425\u042c\u0433\u0436\u0441\u044d\u0461\u0469\u0472\u047b"+
		"\u0487\u0493\u0496\u04a0\u04a3\u04aa\u04b2\u04b9\u04bb\u04cc\u04cf\u04d7"+
		"\u04e2\u04e8\u04f3\u04f7\u0500\u0503\u0506\u050a\u0510\u0518\u051e\u0522"+
		"\u052e\u0535\u053d\u053f\u0547\u054b\u0551\u0555\u0557\u055f\u0564\u056f"+
		"\u0573\u0588\u058c\u0590\u0594\u0597\u059a\u05a6\u05ae\u05b6\u05ba\u05bf"+
		"\u05c1\u05cd\u05d2\u05d6\u05dc\u05e5\u05f1\u05fc\u05fe\u0610\u0612\u0622"+
		"\u062b\u0636\u0639\u0641\u064a\u064d\u0658\u065e\u0660\u0662\u0669\u0674"+
		"\u0676\u068c\u068e\u0691\u069b\u06a3\u06a6\u06aa\u06b4\u06c0\u06c3\u06c7"+
		"\u06ce\u06d2\u06da\u06e0\u06e2\u06e4\u06e9\u06f2\u06fa\u070d\u0714\u071d"+
		"\u0722\u0729\u0735\u0744\u0747\u074b\u0750\u0755\u075d\u0762\u0767\u076d"+
		"\u0777\u0781\u0789\u0793\u0795\u0798\u07a2\u07a6\u07ae\u07b2\u07ba\u07be"+
		"\u07c2\u07c7\u07ca\u07d2\u07d6\u07db\u07eb\u07f1\u07f7\u07f9\u07ff\u080a"+
		"\u080f\u0816\u081b\u0820\u0823\u0827\u082c\u0831\u0838\u0840\u0845\u0848"+
		"\u084d\u0852\u085c\u0860\u0864\u0866\u086c\u0872\u0879\u087f\u0886\u088c"+
		"\u0893\u0897\u089e\u08a7\u08ad\u08af\u08bb\u08bd\u08c4\u08e2\u0903\u090b"+
		"\u0913\u0917\u0929\u0932\u0953\u0956\u095f\u0965\u0967\u0970\u097b\u0983"+
		"\u0985\u0989\u098f\u0994\u0996\u09a2\u09a7\u09b1\u09b7\u09b9\u09c0\u09cf"+
		"\u09d1\u09d3\u09d7\u09e0\u09e3\u09e8\u09ea\u09f1\u09fb\u0a02\u0a06\u0a0b"+
		"\u0a10\u0a17\u0a1b\u0a1e\u0a27\u0a2c\u0a30\u0a3a\u0a42\u0a49\u0a4f\u0a51"+
		"\u0a55\u0a5a\u0a5e\u0a64\u0a71\u0a74\u0a79\u0a7d\u0a87\u0a89\u0a91\u0a93"+
		"\u0a97\u0a9f\u0aa3\u0aa6\u0aa9\u0aac\u0aaf\u0ab4\u0ab9\u0abd\u0ac4\u0ac7"+
		"\u0aca\u0acd\u0adb\u0ae4\u0aeb\u0af0\u0af2\u0afb\u0afe\u0b06\u0b0b\u0b0d"+
		"\u0b19\u0b22\u0b28\u0b37\u0b41\u0b44\u0b4d\u0b55\u0b58\u0b5a\u0b61\u0b63"+
		"\u0b6d\u0b6f\u0b78\u0b84\u0b89\u0b92\u0b99\u0ba1\u0ba5\u0bb1\u0bb5\u0bb8"+
		"\u0bbe\u0bc1\u0bc4\u0bd0\u0bda\u0bde\u0be6\u0be9\u0bec\u0bf1\u0bf4\u0bf7"+
		"\u0bfb\u0bff\u0c02\u0c0e\u0c10\u0c25\u0c27\u0c2e\u0c39\u0c3f\u0c44\u0c46"+
		"\u0c4c\u0c56";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}