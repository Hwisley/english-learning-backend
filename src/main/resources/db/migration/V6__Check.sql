SELECT wsm.id,      w.word as phrasal_verb,     m.meaning,     m.extra_meaning,     s.eng_sentence as eng_example,     s.kor_sentence as kor_example FROM word_sentence_mapping wsm JOIN word w ON wsm.word_id = w.id LEFT JOIN meaning m ON w.id = m.word_id JOIN sentence s ON wsm.sentence_id = s.id WHERE w.is_phrasal_verb = 1 ORDER by wsm.id;