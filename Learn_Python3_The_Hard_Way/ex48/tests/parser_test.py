from nose.tools import *
from ex48 import parser
from ex48.parser import ParserError


def test_peek():
    assert_equal(parser.peek(None), None)
    result = parser.peek([('verb', 'run'), ('direction', 'north')])
    assert_equal(result, 'verb')


def test_match():
    assert_equal(parser.match(None, 'stop'), None)
    result_correct = parser.match([('verb', 'run'), ('direction', 'north')], 'verb')
    assert_equal(result_correct, ('verb', 'run'))
    result_error = parser.match([('verb', 'run'), ('direction', 'north')], 'noun')
    assert_equal(result_error, None)


def test_parse_verb():
    result = parser.parse_verb([('verb', 'run'), ('direction', 'north')])
    assert_equal(result, ('verb', 'run'))

    assert_raises(ParserError, parser.parse_verb, [('direction', 'north'), ('verb', 'run')])


def test_parse_object():
    result_noun = parser.parse_object([('noun', 'bear'), ('verb', 'run')])
    assert_equal(result_noun, ('noun', 'bear'))
    result_direction = parser.parse_object([('direction', 'north'), ('verb', 'run')])
    assert_equal(result_direction, ('direction', 'north'))
    
    assert_raises(ParserError, parser.parse_object, [('verb', 'run'), ('direction', 'north')])

   
def test_parse_subject():
    result_noun = parser.parse_subject([('noun', 'honey'), ('verb', 'run')])
    assert_equal(result_noun, ('noun', 'honey'))
    result_verb = parser.parse_subject([('verb', 'run'), ('direction', 'north')])
    assert_equal(result_verb, ('noun', 'player'))
    assert_raises(ParserError, parser.parse_subject, [('direction', 'north')])


def test_parse_sentence():
    result = parser.parse_sentence([('noun', 'bear'), ('verb', 'eat'), ('stop', 'the'), ('noun', 'honey')])

    assert_equal(result.subject, 'bear')
    assert_equal(result.verb, 'eat')
    assert_equal(result.object, 'honey')