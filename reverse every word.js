function reverseWords(sentence) {
    let words = sentence.split(" ");
    let reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });
    return reversedWords.join(' ');
}
let input = "Nice to meet you..";
let reversedSentence = reverseWords(input);
console.log("Reversed Sentence:", reversedSentence);